package com.cs201.sendo.services;

import com.cs201.sendo.mappers.CategoryRepository;
import com.cs201.sendo.models.Category;
import com.cs201.sendo.models.ProductData;
import com.cs201.sendo.models.paging.Paging;
import com.cs201.sendo.models.paging.PagingParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductService productService;

    public Paging<Category> getListCategoryLv1(PagingParams params) {
        try {
            Long total = categoryRepository.getCategoryLv1Count();
            List<Category> categoryList = categoryRepository.getCategoryLv1List(params);

            return Paging.of(categoryList, total, params);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public Paging<Category> getListCategoryLv2(PagingParams params, Long parentId) {
        try {
            Long total = categoryRepository.getCategoryLv2Count(parentId);
            List<Category> categoryList = categoryRepository.getCategoryLv2List(params, parentId);

            return Paging.of(categoryList, total, params);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public Paging<Category> getListCategoryLv3(PagingParams params, Long parentId) {
        try {
            Long total = categoryRepository.getCategoryLv3Count(parentId);
            List<Category> categoryList = categoryRepository.getCategoryLv3List(params, parentId);

            return Paging.of(categoryList, total, params);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public List<ProductData> getSampleProductListOfCateLv2(List<Long> lv1Ids) {
        try {
            List<Long> catLv2Ids = categoryRepository.getCategoryIdLv2ByParentIds(lv1Ids);

            return productService.getListSampleProductByCatLv2Ids(catLv2Ids);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
