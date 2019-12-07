package com.cs201.sendo.mappers;

import com.cs201.sendo.models.ViewHistory;
import com.cs201.sendo.models.paging.PagingParams;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ViewHistoryMapper {

    void insertViewHistory(ViewHistory viewHistory);

    List<Long> getListProductIdHistByUser(@Param("userId") Long id, @Param("params") PagingParams pagingParams);

    List<Long> getList20ProductIdHistByUser(@Param("userId") Long id);

    Long getViewHistCount(@Param("userId") Long id);

    void deleteViewHistory(@Param("userId") Long userId, @Param("productId") Long productId);

    void deleteAllViewHistory(@Param("id") Long id);
}
