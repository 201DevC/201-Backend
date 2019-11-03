package com.cs201.sendo.clients.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ValueItem{

	@JsonProperty("image")
	private String image;

	@JsonProperty("product_option_id")
	private String productOptionId;

	@JsonProperty("name")
	private String name;

	@JsonProperty("image_50x50")
	private String image50x50;

	@JsonProperty("option_id")
	private int optionId;

	@JsonProperty("image_500x500")
	private String image500x500;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

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

	public void setImage50x50(String image50x50){
		this.image50x50 = image50x50;
	}

	public String getImage50x50(){
		return image50x50;
	}

	public void setOptionId(int optionId){
		this.optionId = optionId;
	}

	public int getOptionId(){
		return optionId;
	}

	public void setImage500x500(String image500x500){
		this.image500x500 = image500x500;
	}

	public String getImage500x500(){
		return image500x500;
	}

	@Override
 	public String toString(){
		return 
			"ValueItem{" + 
			"image = '" + image + '\'' + 
			",product_option_id = '" + productOptionId + '\'' + 
			",name = '" + name + '\'' + 
			",image_50x50 = '" + image50x50 + '\'' + 
			",option_id = '" + optionId + '\'' + 
			",image_500x500 = '" + image500x500 + '\'' + 
			"}";
		}
}