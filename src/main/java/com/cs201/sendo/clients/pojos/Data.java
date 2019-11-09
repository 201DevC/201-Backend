package com.cs201.sendo.clients.pojos;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Data{


	@JsonProperty("voucher")
	private Voucher voucher;

	@JsonProperty("total_comment")
	private int totalComment;

	@JsonProperty("variants")
	private List<VariantsItem> variants;

	@JsonProperty("size_guide")
	private String sizeGuide;

	@JsonProperty("product_mall")
	private int productMall;

	@JsonProperty("price")
	private int price;

	@JsonProperty("witdh_product")
	private int witdhProduct;

	@JsonProperty("return_policy")
	private List<ReturnPolicyItem> returnPolicy;

	@JsonProperty("id")
	private Long id;

	@JsonProperty("belong_cate_self_transport")
	private boolean belongCateSelfTransport;

	@JsonProperty("sku")
	private String sku;

	@JsonProperty("status_new")
	private int statusNew;

	@JsonProperty("relate_tags")
	private List<RelateTagsItem> relateTags;

	@JsonProperty("price_discount")
	private PriceDiscount priceDiscount;

	@JsonProperty("image")
	private String image;

	@JsonProperty("shop_free_shipping")
	private int shopFreeShipping;

	@JsonProperty("stock_status")
	private int stockStatus;

	@JsonProperty("counter_view")
	private int counterView;

	@JsonProperty("is_event_frame")
	private int isEventFrame;

	@JsonProperty("shop_brand_type")
	private int shopBrandType;

	@JsonProperty("weight")
	private int weight;

	@JsonProperty("required_options")
	private String requiredOptions;

	@JsonProperty("rating_info")
	private RatingInfo ratingInfo;

	@JsonProperty("admin_id")
	private int adminId;

	@JsonProperty("name")
	private String name;

	@JsonProperty("has_voucher")
	private boolean hasVoucher;

	@JsonProperty("is_express")
	private boolean isExpress;

	@JsonProperty("price_max")
	private int priceMax;

	@JsonProperty("status")
	private int status;

	@JsonProperty("is_config_variant")
	private boolean isConfigVariant;

	@JsonProperty("short_description")
	private String shortDescription;

	@JsonProperty("shop_info")
	private ShopInfo shopInfo;

	@JsonProperty("shipping_express")
	private int shippingExpress;

	@JsonProperty("description")
	private String description;

	@JsonProperty("product_status")
	private String productStatus;

	@JsonProperty("media")
	private List<MediaItem> media;

	@JsonProperty("counter_like")
	private int counterLike;

	@JsonProperty("category_id")
	private String categoryId;

	@JsonProperty("final_price")
	private int finalPrice;

	@JsonProperty("sku_user")
	private String skuUser;

	@JsonProperty("product_relateds")
	private String productRelateds;

	@JsonProperty("attribute")
	private List<AttributeItem> attribute;

	@JsonProperty("length_product")
	private int lengthProduct;

	@JsonProperty("cat_path")
	private String catPath;

	@JsonProperty("promotion_percent")
	private int promotionPercent;

	@JsonProperty("category_info")
	private List<CategoryInfoItem> categoryInfo;

	@JsonProperty("quantity")
	private int quantity;

	@JsonProperty("order_count")
	private int orderCount;

	@JsonProperty("discount_app")
	private int discountApp;

	@JsonProperty("final_price_max")
	private int finalPriceMax;

	@JsonProperty("has_options")
	private boolean hasOptions;

	@JsonProperty("is_installment")
	private boolean isInstallment;

	@JsonProperty("url_key")
	private String urlKey;

	@JsonProperty("is_event")
	private int isEvent;

	@JsonProperty("special_price")
	private int specialPrice;

	@JsonProperty("label_sale_event")
	private List<Object> labelSaleEvent;

	@JsonProperty("height_product")
	private int heightProduct;

	@JsonProperty("promotion_note")
	private String promotionNote;

	@JsonProperty("is_shop_ads")
	private int isShopAds;

	public void setVoucher(Voucher voucher){
		this.voucher = voucher;
	}

	public Voucher getVoucher(){
		return voucher;
	}

	public void setTotalComment(int totalComment){
		this.totalComment = totalComment;
	}

	public int getTotalComment(){
		return totalComment;
	}

	public void setVariants(List<VariantsItem> variants){
		this.variants = variants;
	}

	public List<VariantsItem> getVariants(){
		return variants;
	}

	public void setSizeGuide(String sizeGuide){
		this.sizeGuide = sizeGuide;
	}

	public String getSizeGuide(){
		return sizeGuide;
	}

	public void setProductMall(int productMall){
		this.productMall = productMall;
	}

	public int getProductMall(){
		return productMall;
	}

	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return price;
	}

	public void setWitdhProduct(int witdhProduct){
		this.witdhProduct = witdhProduct;
	}

	public int getWitdhProduct(){
		return witdhProduct;
	}

	public void setReturnPolicy(List<ReturnPolicyItem> returnPolicy){
		this.returnPolicy = returnPolicy;
	}

	public List<ReturnPolicyItem> getReturnPolicy(){
		return returnPolicy;
	}

	public void setId(Long id){
		this.id = id;
	}

	public Long getId(){
		return id;
	}

	public void setBelongCateSelfTransport(boolean belongCateSelfTransport){
		this.belongCateSelfTransport = belongCateSelfTransport;
	}

	public boolean isBelongCateSelfTransport(){
		return belongCateSelfTransport;
	}

	public void setSku(String sku){
		this.sku = sku;
	}

	public String getSku(){
		return sku;
	}

	public void setStatusNew(int statusNew){
		this.statusNew = statusNew;
	}

	public int getStatusNew(){
		return statusNew;
	}

	public void setRelateTags(List<RelateTagsItem> relateTags){
		this.relateTags = relateTags;
	}

	public List<RelateTagsItem> getRelateTags(){
		return relateTags;
	}

	public void setPriceDiscount(PriceDiscount priceDiscount){
		this.priceDiscount = priceDiscount;
	}

	public PriceDiscount getPriceDiscount(){
		return priceDiscount;
	}

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setShopFreeShipping(int shopFreeShipping){
		this.shopFreeShipping = shopFreeShipping;
	}

	public int getShopFreeShipping(){
		return shopFreeShipping;
	}

	public void setStockStatus(int stockStatus){
		this.stockStatus = stockStatus;
	}

	public int getStockStatus(){
		return stockStatus;
	}

	public void setCounterView(int counterView){
		this.counterView = counterView;
	}

	public int getCounterView(){
		return counterView;
	}

	public void setIsEventFrame(int isEventFrame){
		this.isEventFrame = isEventFrame;
	}

	public int getIsEventFrame(){
		return isEventFrame;
	}

	public void setShopBrandType(int shopBrandType){
		this.shopBrandType = shopBrandType;
	}

	public int getShopBrandType(){
		return shopBrandType;
	}

	public void setWeight(int weight){
		this.weight = weight;
	}

	public int getWeight(){
		return weight;
	}

	public void setRequiredOptions(String requiredOptions){
		this.requiredOptions = requiredOptions;
	}

	public String getRequiredOptions(){
		return requiredOptions;
	}

	public void setRatingInfo(RatingInfo ratingInfo){
		this.ratingInfo = ratingInfo;
	}

	public RatingInfo getRatingInfo(){
		return ratingInfo;
	}

	public void setAdminId(int adminId){
		this.adminId = adminId;
	}

	public int getAdminId(){
		return adminId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setHasVoucher(boolean hasVoucher){
		this.hasVoucher = hasVoucher;
	}

	public boolean isHasVoucher(){
		return hasVoucher;
	}

	public void setIsExpress(boolean isExpress){
		this.isExpress = isExpress;
	}

	public boolean isIsExpress(){
		return isExpress;
	}

	public void setPriceMax(int priceMax){
		this.priceMax = priceMax;
	}

	public int getPriceMax(){
		return priceMax;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}

	public void setIsConfigVariant(boolean isConfigVariant){
		this.isConfigVariant = isConfigVariant;
	}

	public boolean isIsConfigVariant(){
		return isConfigVariant;
	}

	public void setShortDescription(String shortDescription){
		this.shortDescription = shortDescription;
	}

	public String getShortDescription(){
		return shortDescription;
	}

	public void setShopInfo(ShopInfo shopInfo){
		this.shopInfo = shopInfo;
	}

	public ShopInfo getShopInfo(){
		return shopInfo;
	}

	public void setShippingExpress(int shippingExpress){
		this.shippingExpress = shippingExpress;
	}

	public int getShippingExpress(){
		return shippingExpress;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setProductStatus(String productStatus){
		this.productStatus = productStatus;
	}

	public String getProductStatus(){
		return productStatus;
	}

	public void setMedia(List<MediaItem> media){
		this.media = media;
	}

	public List<MediaItem> getMedia(){
		return media;
	}

	public void setCounterLike(int counterLike){
		this.counterLike = counterLike;
	}

	public int getCounterLike(){
		return counterLike;
	}

	public void setCategoryId(String categoryId){
		this.categoryId = categoryId;
	}

	public String getCategoryId(){
		return categoryId;
	}

	public void setFinalPrice(int finalPrice){
		this.finalPrice = finalPrice;
	}

	public int getFinalPrice(){
		return finalPrice;
	}

	public void setSkuUser(String skuUser){
		this.skuUser = skuUser;
	}

	public String getSkuUser(){
		return skuUser;
	}

	public void setProductRelateds(String productRelateds){
		this.productRelateds = productRelateds;
	}

	public String getProductRelateds(){
		return productRelateds;
	}

	public void setAttribute(List<AttributeItem> attribute){
		this.attribute = attribute;
	}

	public List<AttributeItem> getAttribute(){
		return attribute;
	}

	public void setLengthProduct(int lengthProduct){
		this.lengthProduct = lengthProduct;
	}

	public int getLengthProduct(){
		return lengthProduct;
	}

	public void setCatPath(String catPath){
		this.catPath = catPath;
	}

	public String getCatPath(){
		return catPath;
	}

	public void setPromotionPercent(int promotionPercent){
		this.promotionPercent = promotionPercent;
	}

	public int getPromotionPercent(){
		return promotionPercent;
	}

	public void setCategoryInfo(List<CategoryInfoItem> categoryInfo){
		this.categoryInfo = categoryInfo;
	}

	public List<CategoryInfoItem> getCategoryInfo(){
		return categoryInfo;
	}

	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

	public int getQuantity(){
		return quantity;
	}

	public void setOrderCount(int orderCount){
		this.orderCount = orderCount;
	}

	public int getOrderCount(){
		return orderCount;
	}

	public void setDiscountApp(int discountApp){
		this.discountApp = discountApp;
	}

	public int getDiscountApp(){
		return discountApp;
	}

	public void setFinalPriceMax(int finalPriceMax){
		this.finalPriceMax = finalPriceMax;
	}

	public int getFinalPriceMax(){
		return finalPriceMax;
	}

	public void setHasOptions(boolean hasOptions){
		this.hasOptions = hasOptions;
	}

	public boolean isHasOptions(){
		return hasOptions;
	}

	public void setIsInstallment(boolean isInstallment){
		this.isInstallment = isInstallment;
	}

	public boolean isIsInstallment(){
		return isInstallment;
	}

	public void setUrlKey(String urlKey){
		this.urlKey = urlKey;
	}

	public String getUrlKey(){
		return urlKey;
	}

	public void setIsEvent(int isEvent){
		this.isEvent = isEvent;
	}

	public int getIsEvent(){
		return isEvent;
	}

	public void setSpecialPrice(int specialPrice){
		this.specialPrice = specialPrice;
	}

	public int getSpecialPrice(){
		return specialPrice;
	}

	public void setLabelSaleEvent(List<Object> labelSaleEvent){
		this.labelSaleEvent = labelSaleEvent;
	}

	public List<Object> getLabelSaleEvent(){
		return labelSaleEvent;
	}

	public void setHeightProduct(int heightProduct){
		this.heightProduct = heightProduct;
	}

	public int getHeightProduct(){
		return heightProduct;
	}

	public void setPromotionNote(String promotionNote){
		this.promotionNote = promotionNote;
	}

	public String getPromotionNote(){
		return promotionNote;
	}

	public void setIsShopAds(int isShopAds){
		this.isShopAds = isShopAds;
	}

	public int getIsShopAds(){
		return isShopAds;
	}

	@Override
 	public String toString(){
		return 
			"Data{" +
			",voucher = '" + voucher + '\'' + 
			",total_comment = '" + totalComment + '\'' + 
			",variants = '" + variants + '\'' + 
			",size_guide = '" + sizeGuide + '\'' + 
			",product_mall = '" + productMall + '\'' + 
			",price = '" + price + '\'' + 
			",witdh_product = '" + witdhProduct + '\'' + 
			",return_policy = '" + returnPolicy + '\'' + 
			",id = '" + id + '\'' + 
			",belong_cate_self_transport = '" + belongCateSelfTransport + '\'' + 
			",sku = '" + sku + '\'' +
			",status_new = '" + statusNew + '\'' + 
			",relate_tags = '" + relateTags + '\'' + 
			",price_discount = '" + priceDiscount + '\'' + 
			",image = '" + image + '\'' + 
			",shop_free_shipping = '" + shopFreeShipping + '\'' + 
			",stock_status = '" + stockStatus + '\'' + 
			",counter_view = '" + counterView + '\'' + 
			",is_event_frame = '" + isEventFrame + '\'' + 
			",shop_brand_type = '" + shopBrandType + '\'' + 
			",weight = '" + weight + '\'' + 
			",required_options = '" + requiredOptions + '\'' + 
			",rating_info = '" + ratingInfo + '\'' + 
			",admin_id = '" + adminId + '\'' + 
			",name = '" + name + '\'' + 
			",has_voucher = '" + hasVoucher + '\'' + 
			",is_express = '" + isExpress + '\'' + 
			",price_max = '" + priceMax + '\'' + 
			",status = '" + status + '\'' + 
			",is_config_variant = '" + isConfigVariant + '\'' + 
			",short_description = '" + shortDescription + '\'' + 
			",shop_info = '" + shopInfo + '\'' + 
			",shipping_express = '" + shippingExpress + '\'' + 
			",description = '" + description + '\'' + 
			",product_status = '" + productStatus + '\'' + 
			",media = '" + media + '\'' + 
			",counter_like = '" + counterLike + '\'' + 
			",category_id = '" + categoryId + '\'' + 
			",final_price = '" + finalPrice + '\'' + 
			",sku_user = '" + skuUser + '\'' + 
			",product_relateds = '" + productRelateds + '\'' + 
			",attribute = '" + attribute + '\'' + 
			",length_product = '" + lengthProduct + '\'' + 
			",cat_path = '" + catPath + '\'' + 
			",promotion_percent = '" + promotionPercent + '\'' + 
			",category_info = '" + categoryInfo + '\'' + 
			",quantity = '" + quantity + '\'' + 
			",order_count = '" + orderCount + '\'' + 
			",discount_app = '" + discountApp + '\'' + 
			",final_price_max = '" + finalPriceMax + '\'' + 
			",has_options = '" + hasOptions + '\'' + 
			",is_installment = '" + isInstallment + '\'' + 
			",url_key = '" + urlKey + '\'' + 
			",is_event = '" + isEvent + '\'' + 
			",special_price = '" + specialPrice + '\'' + 
			",label_sale_event = '" + labelSaleEvent + '\'' + 
			",height_product = '" + heightProduct + '\'' + 
			",promotion_note = '" + promotionNote + '\'' + 
			",is_shop_ads = '" + isShopAds + '\'' + 
			"}";
		}
}