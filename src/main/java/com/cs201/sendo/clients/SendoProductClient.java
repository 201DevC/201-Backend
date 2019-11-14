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
                productData.setShortDescription(data.getShortDescription());
                productData.setDescription(data.getDescription());
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
        headers.add("user-agent", "Mozilla/5.0 (Linux; Android 6.0.1; Nexus 5X Build/MMB29P) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.96 Mobile Safari/537.36 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)");
        headers.add("Cookie", "SSID=ve0k3oi0i17a8lr9lgqn09mql1; tracking_id=34320d6171024a1d950aa1b41d63244f; browserid=dbba9b171961719b4fcb09797ccf24c1; s_c_id=dbba9b171961719b4fcb09797ccf24c1%7C%7C%7C; s_c_id_status=return; search_algo=algo5; search_first=2; __utma=147100981.1838599419.1573655372.1573655372.1573655372.1; __utmc=147100981; __utmz=147100981.1573655372.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); __utmt=1; _gcl_au=1.1.1711949112.1573655372; _ga=GA1.2.1838599419.1573655372; _gid=GA1.2.473585721.1573655373; cto_lwid=831ed8ba-a51c-4309-8a0c-c0f14d32808d; _dc_gtm_UA-32891946-6=1; _gat_UA-32891946-6=1; _gat_UA-32891946-11=1; _fbp=fb.1.1573655373162.115970148; __stp={\"visit\":\"new\",\"uuid\":\"81156b3a-8d82-4649-9906-473874464ddd\"}; __stdf=0; WZRK_G=a164d6b9f4824900a79debcbd04308a6; __sts={\"sid\":1573655373292,\"tx\":1573655375169,\"url\":\"https%3A%2F%2Fwww.sendo.vn%2Ftim-kiem%3Fq%3Dad\",\"pet\":1573655375169,\"set\":1573655373292,\"pUrl\":\"https%3A%2F%2Fwww.sendo.vn%2Ftim-kiem%3Fq%3Dlien\",\"pPet\":1573655373292,\"pTx\":1573655373292}; __stgeo=\"0\"; WZRK_S_466-944-R55Z=%7B%22p%22%3A4%2C%22s%22%3A1573655373%2C%22t%22%3A1573655376%7D; __utmb=147100981.7.9.1573655374103");

        HttpEntity entity = new HttpEntity(headers);
        return entity;
    }
}
