package com.cs201.sendo.mappers;

import com.cs201.sendo.models.Product;
import com.cs201.sendo.models.ProductData;
import com.cs201.sendo.models.paging.PagingParams;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductRepository {

    Long getProductCountByCategory(@Param("cate1") Long cate1, @Param("cate2") Long cate2, @Param("cate3") Long cate3,
                                   @Param("keyword") String keyword);

    List<Product> getListProductByCategory(@Param("cate1") Long cate1, @Param("cate2") Long cate2,
                                           @Param("cate3") Long cate3, @Param("pagingParams") PagingParams pagingParams,
                                           @Param("keyword") String keyword);

    List<Product> getRandomProduct(PagingParams params);

    List<Product> getListRelatedProduct(Product product);

    List<Product> getTrendingProducts();

    Product getProductById(@Param("productId") Long productId);

    List<ProductData> getProductDataByIds(@Param("ids") List<Long> ids);
}
