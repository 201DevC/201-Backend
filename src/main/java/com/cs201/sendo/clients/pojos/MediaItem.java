package com.cs201.sendo.clients.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class MediaItem{

	@JsonProperty("image")
	private String image;

	@JsonProperty("image_50x50")
	private String image50x50;

	@JsonProperty("type")
	private String type;

	@JsonProperty("image_500x500")
	private String image500x500;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setImage50x50(String image50x50){
		this.image50x50 = image50x50;
	}

	public String getImage50x50(){
		return image50x50;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
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
			"MediaItem{" + 
			"image = '" + image + '\'' + 
			",image_50x50 = '" + image50x50 + '\'' + 
			",type = '" + type + '\'' + 
			",image_500x500 = '" + image500x500 + '\'' + 
			"}";
		}
}