package com.cs201.sendo.clients.pojos;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ShopInfo{

	@JsonProperty("good_review_percent")
	private double goodReviewPercent;

	@JsonProperty("is_certified")
	private int isCertified;

	@JsonProperty("lotus_class")
	private String lotusClass;

	@JsonProperty("lotus")
	private int lotus;

	@JsonProperty("sale_on_sendo")
	private String saleOnSendo;

	@JsonProperty("shop_logo")
	private String shopLogo;

	@JsonProperty("score")
	private int score;

	@JsonProperty("shop_url")
	private String shopUrl;

	@JsonProperty("rating_avg")
	private double ratingAvg;

	@JsonProperty("time_prepare_product")
	private String timePrepareProduct;

	@JsonProperty("product_total")
	private int productTotal;

	@JsonProperty("shop_external_id")
	private int shopExternalId;

	@JsonProperty("self_transport")
	private List<Object> selfTransport;

	@JsonProperty("warehouse_longitude")
	private double warehouseLongitude;

	@JsonProperty("shop_mall")
	private int shopMall;

	@JsonProperty("shop_brand_type")
	private int shopBrandType;

	@JsonProperty("shop_name")
	private String shopName;

	@JsonProperty("is_self_transport")
	private boolean isSelfTransport;

	@JsonProperty("warehourse_region_id")
	private int warehourseRegionId;

	@JsonProperty("rating_count")
	private int ratingCount;

	@JsonProperty("shop_id")
	private Long shopId;

	@JsonProperty("percent_response")
	private String percentResponse;

	@JsonProperty("warehourse_region_name")
	private String warehourseRegionName;

	@JsonProperty("phone_number")
	private String phoneNumber;

	@JsonProperty("response_time")
	private String responseTime;

	@JsonProperty("customer_id")
	private int customerId;

	@JsonProperty("warehouse_latitude")
	private double warehouseLatitude;

	public void setGoodReviewPercent(double goodReviewPercent){
		this.goodReviewPercent = goodReviewPercent;
	}

	public double getGoodReviewPercent(){
		return goodReviewPercent;
	}

	public void setIsCertified(int isCertified){
		this.isCertified = isCertified;
	}

	public int getIsCertified(){
		return isCertified;
	}

	public void setLotusClass(String lotusClass){
		this.lotusClass = lotusClass;
	}

	public String getLotusClass(){
		return lotusClass;
	}

	public void setLotus(int lotus){
		this.lotus = lotus;
	}

	public int getLotus(){
		return lotus;
	}

	public void setSaleOnSendo(String saleOnSendo){
		this.saleOnSendo = saleOnSendo;
	}

	public String getSaleOnSendo(){
		return saleOnSendo;
	}

	public void setShopLogo(String shopLogo){
		this.shopLogo = shopLogo;
	}

	public String getShopLogo(){
		return shopLogo;
	}

	public void setScore(int score){
		this.score = score;
	}

	public int getScore(){
		return score;
	}

	public void setShopUrl(String shopUrl){
		this.shopUrl = shopUrl;
	}

	public String getShopUrl(){
		return shopUrl;
	}

	public void setRatingAvg(double ratingAvg){
		this.ratingAvg = ratingAvg;
	}

	public double getRatingAvg(){
		return ratingAvg;
	}

	public void setTimePrepareProduct(String timePrepareProduct){
		this.timePrepareProduct = timePrepareProduct;
	}

	public String getTimePrepareProduct(){
		return timePrepareProduct;
	}

	public void setProductTotal(int productTotal){
		this.productTotal = productTotal;
	}

	public int getProductTotal(){
		return productTotal;
	}

	public void setShopExternalId(int shopExternalId){
		this.shopExternalId = shopExternalId;
	}

	public int getShopExternalId(){
		return shopExternalId;
	}

	public void setSelfTransport(List<Object> selfTransport){
		this.selfTransport = selfTransport;
	}

	public List<Object> getSelfTransport(){
		return selfTransport;
	}

	public void setWarehouseLongitude(double warehouseLongitude){
		this.warehouseLongitude = warehouseLongitude;
	}

	public double getWarehouseLongitude(){
		return warehouseLongitude;
	}

	public void setShopMall(int shopMall){
		this.shopMall = shopMall;
	}

	public int getShopMall(){
		return shopMall;
	}

	public void setShopBrandType(int shopBrandType){
		this.shopBrandType = shopBrandType;
	}

	public int getShopBrandType(){
		return shopBrandType;
	}

	public void setShopName(String shopName){
		this.shopName = shopName;
	}

	public String getShopName(){
		return shopName;
	}

	public void setIsSelfTransport(boolean isSelfTransport){
		this.isSelfTransport = isSelfTransport;
	}

	public boolean isIsSelfTransport(){
		return isSelfTransport;
	}

	public void setWarehourseRegionId(int warehourseRegionId){
		this.warehourseRegionId = warehourseRegionId;
	}

	public int getWarehourseRegionId(){
		return warehourseRegionId;
	}

	public void setRatingCount(int ratingCount){
		this.ratingCount = ratingCount;
	}

	public int getRatingCount(){
		return ratingCount;
	}

	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	public Long getShopId(){
		return shopId;
	}

	public void setPercentResponse(String percentResponse){
		this.percentResponse = percentResponse;
	}

	public String getPercentResponse(){
		return percentResponse;
	}

	public void setWarehourseRegionName(String warehourseRegionName){
		this.warehourseRegionName = warehourseRegionName;
	}

	public String getWarehourseRegionName(){
		return warehourseRegionName;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setResponseTime(String responseTime){
		this.responseTime = responseTime;
	}

	public String getResponseTime(){
		return responseTime;
	}

	public void setCustomerId(int customerId){
		this.customerId = customerId;
	}

	public int getCustomerId(){
		return customerId;
	}

	public void setWarehouseLatitude(double warehouseLatitude){
		this.warehouseLatitude = warehouseLatitude;
	}

	public double getWarehouseLatitude(){
		return warehouseLatitude;
	}

	@Override
 	public String toString(){
		return 
			"ShopInfo{" + 
			"good_review_percent = '" + goodReviewPercent + '\'' + 
			",is_certified = '" + isCertified + '\'' + 
			",lotus_class = '" + lotusClass + '\'' + 
			",lotus = '" + lotus + '\'' + 
			",sale_on_sendo = '" + saleOnSendo + '\'' + 
			",shop_logo = '" + shopLogo + '\'' + 
			",score = '" + score + '\'' + 
			",shop_url = '" + shopUrl + '\'' + 
			",rating_avg = '" + ratingAvg + '\'' + 
			",time_prepare_product = '" + timePrepareProduct + '\'' + 
			",product_total = '" + productTotal + '\'' + 
			",shop_external_id = '" + shopExternalId + '\'' + 
			",self_transport = '" + selfTransport + '\'' + 
			",warehouse_longitude = '" + warehouseLongitude + '\'' + 
			",shop_mall = '" + shopMall + '\'' + 
			",shop_brand_type = '" + shopBrandType + '\'' + 
			",shop_name = '" + shopName + '\'' + 
			",is_self_transport = '" + isSelfTransport + '\'' + 
			",warehourse_region_id = '" + warehourseRegionId + '\'' + 
			",rating_count = '" + ratingCount + '\'' + 
			",shop_id = '" + shopId + '\'' + 
			",percent_response = '" + percentResponse + '\'' + 
			",warehourse_region_name = '" + warehourseRegionName + '\'' + 
			",phone_number = '" + phoneNumber + '\'' + 
			",response_time = '" + responseTime + '\'' + 
			",customer_id = '" + customerId + '\'' + 
			",warehouse_latitude = '" + warehouseLatitude + '\'' + 
			"}";
		}
}