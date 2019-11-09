package com.cs201.sendo.clients.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class BrandInfo{

	@JsonProperty("name")
	private String name;

	@JsonProperty("url_key")
	private String urlKey;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setUrlKey(String urlKey){
		this.urlKey = urlKey;
	}

	public String getUrlKey(){
		return urlKey;
	}

	@Override
 	public String toString(){
		return 
			"BrandInfo{" + 
			"name = '" + name + '\'' + 
			",url_key = '" + urlKey + '\'' + 
			"}";
		}
}