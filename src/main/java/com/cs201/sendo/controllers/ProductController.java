package com.cs201.sendo.controllers;

import com.cs201.sendo.models.ProductData;
import com.cs201.sendo.models.paging.Paging;
import com.cs201.sendo.models.paging.PagingParams;
import com.cs201.sendo.services.ProductService;
import com.cs201.sendo.services.ViewHistoryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ViewHistoryService viewHistoryService;

    @GetMapping("/{id}")
    public ProductData getProductDetail(@PathVariable Long id, @RequestParam(value = "userId", required = false) Long userId) {
        viewHistoryService.insertViewHistory(id, userId);
        return productService.getProductDetail(id);
    }

    @GetMapping("/list")
    @ApiOperation(value = "Lazy load: lấy offset = offset + size + 1, gửi lên parameter gồm offset và size là lấy được data trang tiếp theo.")
    public Paging<ProductData> getProductListByCategory(@RequestParam(value = "userId", required = false) Long userId,
                                                        @RequestParam(value = "size", required = false) Long size,
                                                        @RequestParam(value = "offset", required = false) Long offset,
                                                        @RequestParam(value = "sortBy", required = false) String sortColumn,
                                                        @RequestParam(value = "direction", required = false) String direction,
                                                        @RequestParam(value = "cate1", required = false) Long cate1,
                                                        @RequestParam(value = "cate2", required = false) Long cate2,
                                                        @RequestParam(value = "cate3", required = false) Long cate3,
                                                        @RequestParam(value = "keyword", required = false) String keyword) {

        PagingParams params = null;
        if (size != null && offset != null) {
            params = PagingParams.builder().size(size).offset(offset).build();
        }
        if (keyword != null) {
            keyword = keyword.replaceAll("\\s+", "-");
        }
        return productService.getListProductByCategory(cate1, cate2, cate3, params, keyword);
    }

    @GetMapping("/{productId}/relation")
    @ApiOperation(value = "Lấy danh sách sản phẩm liên quan của 1 sản phẩm cụ thể. Mặc định có 20 sản phẩm.")
    public List<ProductData> getRelatedProduct(@PathVariable Long productId) {
        return productService.getListRelatedProducts(productId);
    }

    @GetMapping("/trend")
    @ApiOperation(value = "Lấy danh sách sản phẩm đang hot, là xu hướng hiện nay. Mặc định có 20 sản phẩm.")
    public List<ProductData> getTrendingProducts() {
        return productService.getTrendingProducts();
    }

    @GetMapping("/category/{categoryId}")
    public List<ProductData> getRecommendationByCategory2(@PathVariable Long categoryId) {
        return productService.getRecommendationByCategory2(categoryId);
    }
}
