package com.cs201.sendo.clients.pojos;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class PriceDiscount{

	@JsonProperty("list_discount")
	private List<Object> listDiscount;

	@JsonProperty("total_min_price")
	private String totalMinPrice;

	@JsonProperty("total_max_price")
	private String totalMaxPrice;

	public void setListDiscount(List<Object> listDiscount){
		this.listDiscount = listDiscount;
	}

	public List<Object> getListDiscount(){
		return listDiscount;
	}

	public void setTotalMinPrice(String totalMinPrice){
		this.totalMinPrice = totalMinPrice;
	}

	public String getTotalMinPrice(){
		return totalMinPrice;
	}

	public void setTotalMaxPrice(String totalMaxPrice){
		this.totalMaxPrice = totalMaxPrice;
	}

	public String getTotalMaxPrice(){
		return totalMaxPrice;
	}

	@Override
 	public String toString(){
		return 
			"PriceDiscount{" + 
			"list_discount = '" + listDiscount + '\'' + 
			",total_min_price = '" + totalMinPrice + '\'' + 
			",total_max_price = '" + totalMaxPrice + '\'' + 
			"}";
		}
}