package com.cs201.sendo.controllers;

import com.cs201.sendo.models.ProductData;
import com.cs201.sendo.models.paging.Paging;
import com.cs201.sendo.models.paging.PagingParams;
import com.cs201.sendo.services.FlashSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flash")
public class FlashSaleController {

    @Autowired
    private FlashSaleService flashSaleService;

    @GetMapping
    public Paging<ProductData> getFlashSaleList(@RequestParam(value = "userId", required = false) Long userId,
                                                @RequestParam(value = "size", required = false) Long size,
                                                @RequestParam(value = "offset", required = false) Long offset,
                                                @RequestParam(value = "sortBy", required = false) String sortColumn,
                                                @RequestParam(value = "direction", required = false) String direction) {
        PagingParams params = null;

        if (size != null && offset != null) {
            params = PagingParams.builder().offset(offset).size(size).build();
        }
        return flashSaleService.getFlashSale(userId, params);
    }
}
