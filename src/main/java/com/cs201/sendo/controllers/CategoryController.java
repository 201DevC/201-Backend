package com.cs201.sendo.controllers;

import com.cs201.sendo.models.Category;
import com.cs201.sendo.models.paging.Paging;
import com.cs201.sendo.models.paging.PagingParams;
import com.cs201.sendo.services.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "API lấy data của Danh mục sản phẩm")
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/lv1")
    @ApiOperation(value = "Lấy danh sách category level 1. Các param truyền lên đều optional")
    public Paging<Category> getCategoryLv1(@RequestParam(value = "page", required = false) Long page,
                                           @RequestParam(value = "size", required = false) Long size,
                                           @RequestParam(value = "offset", required = false) Long offset) {
        PagingParams params = null;
        if (size != null && page != null && offset != null) {
            params = PagingParams.builder().size(size).page(page).offset(offset).build();
        }

        return categoryService.getListCategoryLv1(params);
    }

    @GetMapping("/lv2")
    @ApiOperation(value = "Lấy danh sách category level 2. Các param truyền lên đều optional")
    public Paging<Category> getCategoryLv2(@RequestParam(value = "page", required = false) Long page,
                                           @RequestParam(value = "size", required = false) Long size,
                                           @RequestParam(value = "offset", required = false) Long offset,
                                           @RequestParam(value = "parentId", required = false) Long parentId) {
        PagingParams params = null;
        if (size != null && page != null && offset != null) {
            params = PagingParams.builder().size(size).page(page).offset(offset).build();
        }

        return categoryService.getListCategoryLv2(params, parentId);
    }

    @GetMapping("/lv3")
    @ApiOperation(value = "Lấy danh sách category level 3. Các param truyền lên đều optional")
    public Paging<Category> getCategoryLv3(@RequestParam(value = "page", required = false) Long page,
                                           @RequestParam(value = "size", required = false) Long size,
                                           @RequestParam(value = "offset", required = false) Long offset,
                                           @RequestParam(value = "parentId", required = false) Long parentId) {
        PagingParams params = null;
        if (size != null && page != null && offset != null) {
            params = PagingParams.builder().size(size).page(page).offset(offset).build();
        }

        return categoryService.getListCategoryLv3(params, parentId);
    }
}
