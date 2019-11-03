package com.cs201.sendo.clients.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class BreadcrumbItem{

	@JsonProperty("isExternalUrl")
	private boolean isExternalUrl;

	@JsonProperty("hidden")
	private boolean hidden;

	@JsonProperty("clickable")
	private boolean clickable;

	@JsonProperty("title")
	private String title;

	@JsonProperty("url")
	private String url;

	public void setIsExternalUrl(boolean isExternalUrl){
		this.isExternalUrl = isExternalUrl;
	}

	public boolean isIsExternalUrl(){
		return isExternalUrl;
	}

	public void setHidden(boolean hidden){
		this.hidden = hidden;
	}

	public boolean isHidden(){
		return hidden;
	}

	public void setClickable(boolean clickable){
		this.clickable = clickable;
	}

	public boolean isClickable(){
		return clickable;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"BreadcrumbItem{" + 
			"isExternalUrl = '" + isExternalUrl + '\'' + 
			",hidden = '" + hidden + '\'' + 
			",clickable = '" + clickable + '\'' + 
			",title = '" + title + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}