package com.cs201.sendo.clients.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class AttributeOption{

	@JsonProperty("284")
	private int jsonMember284;

	public void setJsonMember284(int jsonMember284){
		this.jsonMember284 = jsonMember284;
	}

	public int getJsonMember284(){
		return jsonMember284;
	}

	@Override
 	public String toString(){
		return 
			"AttributeOption{" + 
			"284 = '" + jsonMember284 + '\'' + 
			"}";
		}
}