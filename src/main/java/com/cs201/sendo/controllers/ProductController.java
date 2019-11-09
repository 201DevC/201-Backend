package com.cs201.sendo.controllers;

import com.cs201.sendo.models.ProductData;
import com.cs201.sendo.models.paging.Paging;
import com.cs201.sendo.models.paging.PagingParams;
import com.cs201.sendo.services.ProductService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public ProductData getProductDetail(@PathVariable Long id) {
        return productService.getProductDetail(id);
    }

    @GetMapping("/list")
    public Paging<ProductData> getProductListByCategory(@RequestParam(value = "userId", required = false) Long userId,
                                                        @RequestParam(value = "page", required = false) Long page,
                                                        @RequestParam(value = "size", required = false) Long size,
                                                        @RequestParam(value = "offset", required = false) Long offset,
                                                        @RequestParam(value = "sortBy", required = false) String sortColumn,
                                                        @RequestParam(value = "direction", required = false) String direction,
                                                        @RequestParam(value = "cate1", required = false) Long cate1,
                                                        @RequestParam(value = "cate2", required = false) Long cate2,
                                                        @RequestParam(value = "cate3", required = false) Long cate3,
                                                        @RequestParam(value = "keyword", required = false) String keyword) {

        PagingParams params = null;
        if (page != null && size != null && offset != null) {
            params = PagingParams.builder().page(page).size(size).offset(offset).build();
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
}
