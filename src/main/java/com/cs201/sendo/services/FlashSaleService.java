package com.cs201.sendo.services;

import com.cs201.sendo.clients.SendoProductClient;
import com.cs201.sendo.mappers.ProductRepository;
import com.cs201.sendo.models.Product;
import com.cs201.sendo.models.ProductData;
import com.cs201.sendo.models.paging.Paging;
import com.cs201.sendo.models.paging.PagingParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlashSaleService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private SendoProductClient productClient;

    public Paging<ProductData> getFlashSale(Long userId, PagingParams params) {
        try {
            List<Product> randomProduct = productRepository.getRandomProduct(params);
            List<ProductData> listProductData = this.getProductData(randomProduct);

            return Paging.of(listProductData, 20L, params);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private List<ProductData> getProductData(List<Product> products) {
        List<Long> ids = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            products.get(i).setOrder(i);
            ids.add(products.get(i).getProductId());
        }
        List<ProductData> productDataByIds = productRepository.getProductDataByIds(ids);
        List<Product> missingProduct = products.stream().filter(product ->
                productDataByIds.stream().noneMatch(productData -> productData.getId().equals(product.getProductId())))
                .collect(Collectors.toList());
        List<ProductData> listProductData = productClient.getListProductData(missingProduct);

        listProductData.addAll(productDataByIds);
        return listProductData;
    }

}
