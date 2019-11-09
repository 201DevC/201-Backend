package com.cs201.sendo.clients.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ValueItem{

	@JsonProperty("product_option_id")
	private String productOptionId;

	@JsonProperty("name")
	private String name;

	@JsonProperty("option_id")
	private int optionId;

	public void setProductOptionId(String productOptionId){
		this.productOptionId = productOptionId;
	}

	public String getProductOptionId(){
		return productOptionId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setOptionId(int optionId){
		this.optionId = optionId;
	}

	public int getOptionId(){
		return optionId;
	}

	@Override
 	public String toString(){
		return 
			"ValueItem{" + 
			"product_option_id = '" + productOptionId + '\'' + 
			",name = '" + name + '\'' + 
			",option_id = '" + optionId + '\'' + 
			"}";
		}
}