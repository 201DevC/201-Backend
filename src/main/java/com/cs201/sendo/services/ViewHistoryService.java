package com.cs201.sendo.services;

import com.cs201.sendo.mappers.ProductRepository;
import com.cs201.sendo.mappers.ViewHistoryMapper;
import com.cs201.sendo.models.Product;
import com.cs201.sendo.models.ProductData;
import com.cs201.sendo.models.ViewHistory;
import com.cs201.sendo.models.paging.Paging;
import com.cs201.sendo.models.paging.PagingParams;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Service
public class ViewHistoryService {

    private final ViewHistoryMapper viewHistoryMapper;
    private final ProductRepository productRepository;
    private final ProductService productService;
    private final UserViewCountService userViewCountService;

    public ViewHistoryService(ViewHistoryMapper viewHistoryMapper, ProductRepository productRepository, ProductService productService, UserViewCountService userViewCountService) {
        this.viewHistoryMapper = viewHistoryMapper;
        this.productRepository = productRepository;
        this.productService = productService;
        this.userViewCountService = userViewCountService;
    }

    public void insertViewHistory(Long productId, Long userId) {
        Product product = productRepository.getProductById(productId);
        ViewHistory viewHistory = ViewHistory.builder()
                .userId(userId)
                .catLv1Id(product.getCatLv1Id())
                .catLv2Id(product.getCatLv2Id())
                .catLv3Id(product.getCatLv3Id())
                .productId(product.getProductId())
                .productName(product.getPathName())
                .dateTime(LocalDateTime.now()).build();


        this.insertViewHistory(viewHistory);

    }

    private void insertViewHistory(ViewHistory viewHistory) {

        if (Objects.isNull(viewHistory)) {
            return;
        }
        if (Objects.isNull(viewHistory.getUserId()) || viewHistory.getUserId() == 0) {
            return;
        }
        if (Objects.isNull(viewHistory.getProductId()) || viewHistory.getProductId() == 0) {
            return;
        }

        this.viewHistoryMapper.insertViewHistory(viewHistory);
    }

    public Paging<ProductData> getViewHistoryByUser(Long id, PagingParams params) {
        Long countTotal = viewHistoryMapper.getViewHistCount(id);
        List<Long> listUserId = viewHistoryMapper.getListProductIdHistByUser(id, params);
        List<ProductData> listProductData = productService.getListProductDataByIds(listUserId);

        return Paging.of(listProductData, countTotal, params);
    }
}
