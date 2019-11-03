package com.cs201.sendo.services;

import com.cs201.sendo.clients.SendoProductClient;
import com.cs201.sendo.mappers.ProductRepository;
import com.cs201.sendo.models.Product;
import com.cs201.sendo.models.ProductData;
import com.cs201.sendo.models.paging.Paging;
import com.cs201.sendo.models.paging.PagingParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private SendoProductClient productClient;

    public Paging<ProductData> getListProductByCategory(Long cate1, Long cate2, Long cate3, PagingParams pagingParams) {
        try {
            Long count = productRepository.getProductCountByCategory(cate1, cate2, cate3);
            List<Product> products = productRepository.getListProductByCategory(cate1, cate2, cate3, pagingParams);
            List<ProductData> listProductData = productClient.getListProductData(products);

            return Paging.of(listProductData, count, pagingParams);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}


