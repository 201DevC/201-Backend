package com.cs201.sendo.controllers;

import com.cs201.sendo.models.ProductData;
import com.cs201.sendo.models.paging.Paging;
import com.cs201.sendo.models.paging.PagingParams;
import com.cs201.sendo.services.UserViewCountService;
import com.cs201.sendo.services.ViewHistoryService;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Delete;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final ViewHistoryService viewHistoryService;
    private final UserViewCountService userViewCountService;

    public UserController(ViewHistoryService viewHistoryService, UserViewCountService userViewCountService) {
        this.viewHistoryService = viewHistoryService;
        this.userViewCountService = userViewCountService;
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



    @PostMapping("/{id}/favorite")
    @ApiOperation(value = "Chèn những category id mà user chọn thích trong from khảo sát.")
    public void insertFavorite(@PathVariable("id") Long id, @RequestBody List<Long> favLv2Ids) {
        try {
            userViewCountService.insertFavoriteCategoryLv2(id, favLv2Ids);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @DeleteMapping("{id}/views")
    public void deleteAllViewHistory(@PathVariable("id") Long id) {
        viewHistoryService.deleteAllViewHistory(id);
    }

    @DeleteMapping("/{id}/views/{productId}")
    public void deleteViewHistory(@PathVariable("id") Long id, @PathVariable("productId") Long productId) {
        viewHistoryService.deleteViewHistory(id, productId);
    }
}
