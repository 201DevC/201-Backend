package com.cs201.sendo.clients.pojos;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class VariantsItem{

	@JsonProperty("promotion_percent")
	private double promotionPercent;

	@JsonProperty("attribute_hash")
	private String attributeHash;

	@JsonProperty("special_price")
	private int specialPrice;

	@JsonProperty("final_price")
	private int finalPrice;

	@JsonProperty("price")
	private int price;

	@JsonProperty("promotion_end_date")
	private int promotionEndDate;

	@JsonProperty("sku_user")
	private String skuUser;

	@JsonProperty("options")
	private List<Integer> options;

	@JsonProperty("is_promotion")
	private int isPromotion;

	@JsonProperty("promotion_start_date")
	private int promotionStartDate;

	@JsonProperty("stock")
	private int stock;

	@JsonProperty("attribute_option")
	private AttributeOption attributeOption;

	public void setPromotionPercent(double promotionPercent){
		this.promotionPercent = promotionPercent;
	}

	public double getPromotionPercent(){
		return promotionPercent;
	}

	public void setAttributeHash(String attributeHash){
		this.attributeHash = attributeHash;
	}

	public String getAttributeHash(){
		return attributeHash;
	}

	public void setSpecialPrice(int specialPrice){
		this.specialPrice = specialPrice;
	}

	public int getSpecialPrice(){
		return specialPrice;
	}

	public void setFinalPrice(int finalPrice){
		this.finalPrice = finalPrice;
	}

	public int getFinalPrice(){
		return finalPrice;
	}

	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return price;
	}

	public void setPromotionEndDate(int promotionEndDate){
		this.promotionEndDate = promotionEndDate;
	}

	public int getPromotionEndDate(){
		return promotionEndDate;
	}

	public void setSkuUser(String skuUser){
		this.skuUser = skuUser;
	}

	public String getSkuUser(){
		return skuUser;
	}

	public void setOptions(List<Integer> options){
		this.options = options;
	}

	public List<Integer> getOptions(){
		return options;
	}

	public void setIsPromotion(int isPromotion){
		this.isPromotion = isPromotion;
	}

	public int getIsPromotion(){
		return isPromotion;
	}

	public void setPromotionStartDate(int promotionStartDate){
		this.promotionStartDate = promotionStartDate;
	}

	public int getPromotionStartDate(){
		return promotionStartDate;
	}

	public void setStock(int stock){
		this.stock = stock;
	}

	public int getStock(){
		return stock;
	}

	public void setAttributeOption(AttributeOption attributeOption){
		this.attributeOption = attributeOption;
	}

	public AttributeOption getAttributeOption(){
		return attributeOption;
	}

	@Override
 	public String toString(){
		return 
			"VariantsItem{" + 
			"promotion_percent = '" + promotionPercent + '\'' + 
			",attribute_hash = '" + attributeHash + '\'' + 
			",special_price = '" + specialPrice + '\'' + 
			",final_price = '" + finalPrice + '\'' + 
			",price = '" + price + '\'' + 
			",promotion_end_date = '" + promotionEndDate + '\'' + 
			",sku_user = '" + skuUser + '\'' + 
			",options = '" + options + '\'' + 
			",is_promotion = '" + isPromotion + '\'' + 
			",promotion_start_date = '" + promotionStartDate + '\'' + 
			",stock = '" + stock + '\'' + 
			",attribute_option = '" + attributeOption + '\'' + 
			"}";
		}
}