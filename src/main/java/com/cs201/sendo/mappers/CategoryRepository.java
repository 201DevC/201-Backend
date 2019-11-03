package com.cs201.sendo.mappers;

import com.cs201.sendo.models.Category;
import com.cs201.sendo.models.paging.PagingParams;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CategoryRepository {

    Long getCategoryLv1Count();

    List<Category> getCategoryLv1List(@Param("param") PagingParams params);
}
