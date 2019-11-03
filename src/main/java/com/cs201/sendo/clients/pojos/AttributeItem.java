package com.cs201.sendo.clients.pojos;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class AttributeItem{

	@JsonProperty("search_key")
	private String searchKey;

	@JsonProperty("attribute_id")
	private int attributeId;

	@JsonProperty("name")
	private String name;

	@JsonProperty("show_required")
	private int showRequired;

	@JsonProperty("type")
	private String type;

	@JsonProperty("product_option")
	private String productOption;

	@JsonProperty("value")
	private List<ValueItem> value;

	public void setSearchKey(String searchKey){
		this.searchKey = searchKey;
	}

	public String getSearchKey(){
		return searchKey;
	}

	public void setAttributeId(int attributeId){
		this.attributeId = attributeId;
	}

	public int getAttributeId(){
		return attributeId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setShowRequired(int showRequired){
		this.showRequired = showRequired;
	}

	public int getShowRequired(){
		return showRequired;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setProductOption(String productOption){
		this.productOption = productOption;
	}

	public String getProductOption(){
		return productOption;
	}

	public void setValue(List<ValueItem> value){
		this.value = value;
	}

	public List<ValueItem> getValue(){
		return value;
	}

	@Override
 	public String toString(){
		return 
			"AttributeItem{" + 
			"search_key = '" + searchKey + '\'' + 
			",attribute_id = '" + attributeId + '\'' + 
			",name = '" + name + '\'' + 
			",show_required = '" + showRequired + '\'' + 
			",type = '" + type + '\'' + 
			",product_option = '" + productOption + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}