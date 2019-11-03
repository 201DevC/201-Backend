package com.cs201.sendo.services;

import com.cs201.sendo.mappers.CategoryRepository;
import com.cs201.sendo.models.Category;
import com.cs201.sendo.models.paging.Paging;
import com.cs201.sendo.models.paging.PagingParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Paging<Category> getListCategoryLv1(PagingParams params) {
        try {
            Long total = categoryRepository.getCategoryLv1Count();
            List<Category> categoryList = categoryRepository.getCategoryLv1List(params);

            return Paging.of(categoryList, total, params);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
