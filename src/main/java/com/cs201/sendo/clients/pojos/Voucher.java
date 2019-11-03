package com.cs201.sendo.clients.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Voucher{

	@JsonProperty("end_date")
	private int endDate;

	@JsonProperty("product_type")
	private int productType;

	@JsonProperty("is_check_date")
	private boolean isCheckDate;

	@JsonProperty("start_date")
	private int startDate;

	public void setEndDate(int endDate){
		this.endDate = endDate;
	}

	public int getEndDate(){
		return endDate;
	}

	public void setProductType(int productType){
		this.productType = productType;
	}

	public int getProductType(){
		return productType;
	}

	public void setIsCheckDate(boolean isCheckDate){
		this.isCheckDate = isCheckDate;
	}

	public boolean isIsCheckDate(){
		return isCheckDate;
	}

	public void setStartDate(int startDate){
		this.startDate = startDate;
	}

	public int getStartDate(){
		return startDate;
	}

	@Override
 	public String toString(){
		return 
			"Voucher{" + 
			"end_date = '" + endDate + '\'' + 
			",product_type = '" + productType + '\'' + 
			",is_check_date = '" + isCheckDate + '\'' + 
			",start_date = '" + startDate + '\'' + 
			"}";
		}
}