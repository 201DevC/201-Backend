package com.cs201.sendo.clients;

import com.cs201.sendo.clients.pojos.Data;
import com.cs201.sendo.clients.pojos.MediaItem;
import com.cs201.sendo.clients.pojos.ProductResponse;
import com.cs201.sendo.clients.pojos.Result;
import com.cs201.sendo.models.Product;
import com.cs201.sendo.models.ProductData;
import com.cs201.sendo.models.ShopInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SendoProductClient {

    @Autowired
    private RestTemplate restTemplate;

    public ProductData getProduct(String href) {
        try {
            ProductResponse productResponse = restTemplate.getForObject(href, ProductResponse.class);
            ProductData productData = new ProductData();
            if (productResponse != null && productResponse.getResult() != null && productResponse.getResult().getData() != null) {
                Data data = productResponse.getResult().getData();
                productData.setId(data.getId());
                productData.setName(data.getName());
                productData.setImages(getImages(data.getMedia()));
                productData.setOrderCount(data.getOrderCount());
                productData.setPrice(data.getPrice());
                productData.setShopInfo(getShopInfo(data.getShopInfo()));
                return productData;
            }
            throw new RuntimeException("Can't parse Product Information");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
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
        return products.stream().map(product -> this.getProduct(product.getAlterHref()))
                .collect(Collectors.toList());
    }
}
