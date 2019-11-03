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

@Service
public class FlashSaleService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private SendoProductClient productClient;

    public Paging<ProductData> getFlashSale(Long userId, PagingParams params) {
        try {
            List<Product> randomProduct = productRepository.getRandomProduct(params);
            List<ProductData> listProductData = productClient.getListProductData(randomProduct);

            return Paging.of(listProductData, 20L, params);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
