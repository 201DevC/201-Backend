package com.cs201.sendo.services;

import com.cs201.sendo.mappers.ProductRepository;
import com.cs201.sendo.mappers.ViewHistoryMapper;
import com.cs201.sendo.models.Product;
import com.cs201.sendo.models.ProductData;
import com.cs201.sendo.models.ViewHistory;
import com.cs201.sendo.models.paging.Paging;
import com.cs201.sendo.models.paging.PagingParams;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Service
@Slf4j
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
        try {
            Product product = productRepository.getProductById(productId);
            ViewHistory viewHistory = ViewHistory.builder()
                    .userId(userId)
                    .catLv1Id(product.getCatLv1Id())
                    .catLv2Id(product.getCatLv2Id())
                    .catLv3Id(product.getCatLv3Id())
                    .productId(product.getProductId())
                    .productName(product.getPathName())
                    .dateTime(LocalDateTime.now()).build();

            userViewCountService.insertViewCountRecord(viewHistory);
            this.insertViewHistory(viewHistory);
        } catch (Exception e) {
            log.error("Error when insert log user view count {}", e.getMessage(), e);
        }
    }

    public Paging<ProductData> getViewHistoryByUser(Long id, PagingParams params) {
        Long countTotal = viewHistoryMapper.getViewHistCount(id);
        List<Long> listUserId = viewHistoryMapper.getListProductIdHistByUser(id, params);
        List<ProductData> listProductData = productService.getListProductDataByIds(listUserId);

        return Paging.of(listProductData, countTotal, params);
    }

    @Transactional
    public void deleteViewHistory(Long userId, Long productId) {
        try {
            viewHistoryMapper.deleteViewHistory(userId, productId);
            userViewCountService.deleteUserViewCount(userId, productId);
        } catch (Exception e) {
            log.error("Error when update log user history {}", e.getMessage(), e);
            throw new RuntimeException(e.getMessage());
        }
    }

    public void deleteAllViewHistory(ViewHistory viewHistory) {
//        try {
////            viewHistoryMapper.deleteAllViewHistory
//        }
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
}
