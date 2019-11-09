package com.cs201.sendo.clients;

import com.cs201.sendo.clients.pojos.Data;
import com.cs201.sendo.clients.pojos.MediaItem;
import com.cs201.sendo.clients.pojos.ProductResponse;
import com.cs201.sendo.models.Product;
import com.cs201.sendo.models.ProductData;
import com.cs201.sendo.models.ShopInfo;
import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

@Service
@Slf4j
public class SendoProductClient {

    @Autowired
    private RestTemplate restTemplate;

    public ProductData getProduct(Product product) {
        try {
            HttpEntity entityHeader = createEntityHeader();
            ResponseEntity<ProductResponse> productResponseResponseEntity = restTemplate.exchange(product.getAlterHref(), HttpMethod.GET, entityHeader, ProductResponse.class);
            ProductResponse productResponse = productResponseResponseEntity.getBody();
            ProductData productData = new ProductData();
            productData.setId(product.getProductId());
            productData.setOrder(product.getOrder());
            if (productResponse != null && productResponse.getResult() != null && productResponse.getResult().getData() != null) {
                Data data = productResponse.getResult().getData();
                productData.setSendoPid(data.getId());
                productData.setName(data.getName());
                productData.setImages(getImages(data.getMedia()));
                productData.setOrderCount(data.getOrderCount());
                productData.setPrice(data.getPrice());
                productData.setShopInfo(getShopInfo(data.getShopInfo()));
                productData.setRatingInfo(data.getRatingInfo());
                return productData;
            }
        } catch (Exception e) {
            log.error("Error: {} --- When parse: {} {}", e.getMessage(), product.getProductId(), product.getAlterHref());
        }
        return null;
    }

    private List<String> getImages(List<MediaItem> mediaItems) {
        return mediaItems.stream().map(MediaItem::getImage500x500)
                .collect(Collectors.toList());
    }

    private ShopInfo getShopInfo(com.cs201.sendo.clients.pojos.ShopInfo shopInfo) {
        ShopInfo shopInfoResult = new ShopInfo();
        shopInfoResult.setId(shopInfo.getShopId());
        shopInfoResult.setLogo(shopInfo.getShopLogo());
        shopInfoResult.setName(shopInfo.getShopName());
        return shopInfoResult;
    }

    public List<ProductData> getListProductData(List<Product> products) {
        log.info(String.valueOf(LocalDateTime.now()));
        if (products != null) {
            for (int i = 0; i < products.size(); i++) {
                products.get(i).setOrder(i);
            }
            List<CompletableFuture<ProductData>> completableFutures = new ArrayList<>();
            for (Product product : products) {
                CompletableFuture<ProductData> productDataCompletableFuture = CompletableFuture.supplyAsync(() -> getProduct(product));
                completableFutures.add(productDataCompletableFuture);
            }
            CompletableFuture.allOf(completableFutures.toArray(new CompletableFuture[0])).join();
            log.info(String.valueOf(LocalDateTime.now()));

            return completableFutures.stream()
                    .map(CompletableFuture::join)
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
        }
        return null;
    }

    private HttpEntity createEntityHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.97 Safari/537.36");
        headers.add("Cookie", "search_algo=algo6; tracking_id=14f5a7f64c7247c4bc8ec1f93c9afa19; browserid=aac22ec1c2b6fef77aeb3f5aef21fa3f; listing_algo=algo5; s_c_id=aac22ec1c2b6fef77aeb3f5aef21fa3f%7C%7C%7C; s_c_id_status=return; SSID=omstr5ff8uj2clo524k3iiuvo5; closed_banner=1; search_first=2");

        HttpEntity entity = new HttpEntity(headers);
        return entity;
    }
}
