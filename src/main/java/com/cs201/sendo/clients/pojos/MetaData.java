package com.cs201.sendo.clients.pojos;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class MetaData{

	@JsonProperty("keywords")
	private String keywords;

	@JsonProperty("breadcrumb")
	private List<BreadcrumbItem> breadcrumb;

	@JsonProperty("og_title")
	private String ogTitle;

	@JsonProperty("page_title")
	private String pageTitle;

	@JsonProperty("og_description")
	private String ogDescription;

	@JsonProperty("description")
	private String description;

	@JsonProperty("index")
	private boolean index;

	@JsonProperty("follow")
	private boolean follow;

	@JsonProperty("heading_search")
	private String headingSearch;

	@JsonProperty("og_image")
	private String ogImage;

	@JsonProperty("headerStyle")
	private String headerStyle;

	public void setKeywords(String keywords){
		this.keywords = keywords;
	}

	public String getKeywords(){
		return keywords;
	}

	public void setBreadcrumb(List<BreadcrumbItem> breadcrumb){
		this.breadcrumb = breadcrumb;
	}

	public List<BreadcrumbItem> getBreadcrumb(){
		return breadcrumb;
	}

	public void setOgTitle(String ogTitle){
		this.ogTitle = ogTitle;
	}

	public String getOgTitle(){
		return ogTitle;
	}

	public void setPageTitle(String pageTitle){
		this.pageTitle = pageTitle;
	}

	public String getPageTitle(){
		return pageTitle;
	}

	public void setOgDescription(String ogDescription){
		this.ogDescription = ogDescription;
	}

	public String getOgDescription(){
		return ogDescription;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setIndex(boolean index){
		this.index = index;
	}

	public boolean isIndex(){
		return index;
	}

	public void setFollow(boolean follow){
		this.follow = follow;
	}

	public boolean isFollow(){
		return follow;
	}

	public void setHeadingSearch(String headingSearch){
		this.headingSearch = headingSearch;
	}

	public String getHeadingSearch(){
		return headingSearch;
	}

	public void setOgImage(String ogImage){
		this.ogImage = ogImage;
	}

	public String getOgImage(){
		return ogImage;
	}

	public void setHeaderStyle(String headerStyle){
		this.headerStyle = headerStyle;
	}

	public String getHeaderStyle(){
		return headerStyle;
	}

	@Override
 	public String toString(){
		return 
			"MetaData{" + 
			"keywords = '" + keywords + '\'' + 
			",breadcrumb = '" + breadcrumb + '\'' + 
			",og_title = '" + ogTitle + '\'' + 
			",page_title = '" + pageTitle + '\'' + 
			",og_description = '" + ogDescription + '\'' + 
			",description = '" + description + '\'' + 
			",index = '" + index + '\'' + 
			",follow = '" + follow + '\'' + 
			",heading_search = '" + headingSearch + '\'' + 
			",og_image = '" + ogImage + '\'' + 
			",headerStyle = '" + headerStyle + '\'' + 
			"}";
		}
}