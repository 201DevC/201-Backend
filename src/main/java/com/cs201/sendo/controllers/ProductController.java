package com.cs201.sendo.controllers;

import com.cs201.sendo.models.ProductData;
import com.cs201.sendo.models.paging.Paging;
import com.cs201.sendo.models.paging.PagingParams;
import com.cs201.sendo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public Paging<ProductData> getProductListByCategory(@RequestParam(value = "userId", required = false) Long userId,
                                                        @RequestParam(value = "page", required = false) Long page,
                                                        @RequestParam(value = "size", required = false) Long size,
                                                        @RequestParam(value = "offset", required = false) Long offset,
                                                        @RequestParam(value = "sortBy", required = false) String sortColumn,
                                                        @RequestParam(value = "direction", required = false) String direction,
                                                        @RequestParam(value = "cate1", required = false) Long cate1,
                                                        @RequestParam(value = "cate2", required = false) Long cate2,
                                                        @RequestParam(value = "cate3", required = false) Long cate3) {

        PagingParams params = null;
        if (page != null && size != null && offset != null) {
            params = PagingParams.builder().page(page).size(size).offset(offset).build();
        }
        return productService.getListProductByCategory(cate1, cate2, cate3, params);
    }
}
