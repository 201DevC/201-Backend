package com.cs201.sendo.clients.pojos;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class CategoryInfoItem{

	@JsonProperty("path")
	private String path;

	@JsonProperty("images")
	private List<Object> images;

	@JsonProperty("id")
	private int id;

	@JsonProperty("title")
	private String title;

	@JsonProperty("url_key")
	private String urlKey;

	public void setPath(String path){
		this.path = path;
	}

	public String getPath(){
		return path;
	}

	public void setImages(List<Object> images){
		this.images = images;
	}

	public List<Object> getImages(){
		return images;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
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
			"CategoryInfoItem{" + 
			"path = '" + path + '\'' + 
			",images = '" + images + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",url_key = '" + urlKey + '\'' + 
			"}";
		}
}