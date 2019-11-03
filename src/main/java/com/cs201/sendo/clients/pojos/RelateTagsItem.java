package com.cs201.sendo.clients.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class RelateTagsItem{

	@JsonProperty("link")
	private String link;

	@JsonProperty("title")
	private String title;

	public void setLink(String link){
		this.link = link;
	}

	public String getLink(){
		return link;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	@Override
 	public String toString(){
		return 
			"RelateTagsItem{" + 
			"link = '" + link + '\'' + 
			",title = '" + title + '\'' + 
			"}";
		}
}