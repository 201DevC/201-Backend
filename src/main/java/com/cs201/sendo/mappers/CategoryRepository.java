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

    Long getCategoryLv2Count(@Param("parentId") Long parentId);

    List<Category> getCategoryLv2List(@Param("param") PagingParams params, @Param("parentId") Long parentId);

    Long getCategoryLv3Count(@Param("parentId") Long parentId);

    List<Category> getCategoryLv3List(@Param("param") PagingParams params, @Param("parentId") Long parentId);

    List<Long> getCategoryIdLv2ByParentIds(@Param("lv1Ids") List<Long> lv1Ids);
}
