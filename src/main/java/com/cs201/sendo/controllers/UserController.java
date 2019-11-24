package com.cs201.sendo.controllers;

import com.cs201.sendo.models.ProductData;
import com.cs201.sendo.models.ViewHistory;
import com.cs201.sendo.models.paging.Paging;
import com.cs201.sendo.models.paging.PagingParams;
import com.cs201.sendo.services.ViewHistoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final ViewHistoryService viewHistoryService;

    public UserController(ViewHistoryService viewHistoryService) {
        this.viewHistoryService = viewHistoryService;
    }

    @GetMapping("/{id}/views")
    public Paging<ProductData> getViewHistoryByUerId(@PathVariable("id") Long id,
                                                     @RequestParam(value = "size", required = false) Long size,
                                                     @RequestParam(value = "offset", required = false) Long offset) {
        if (size == null) {
            size = 20L;
        }
        if (offset == null) {
            offset = 0L;
        }
        PagingParams params = PagingParams.builder()
                .size(size)
                .offset(offset)
                .build();

        return viewHistoryService.getViewHistoryByUser(id, params);
    }

}
