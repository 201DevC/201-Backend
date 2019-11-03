package com.cs201.sendo.clients.pojos;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Result{

	@JsonProperty("data")
	private Data data;

	@JsonProperty("meta_data")
	private MetaData metaData;

	@JsonProperty("error")
	private List<Object> error;

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	public void setMetaData(MetaData metaData){
		this.metaData = metaData;
	}

	public MetaData getMetaData(){
		return metaData;
	}

	public void setError(List<Object> error){
		this.error = error;
	}

	public List<Object> getError(){
		return error;
	}

	@Override
 	public String toString(){
		return 
			"Result{" + 
			"data = '" + data + '\'' + 
			",meta_data = '" + metaData + '\'' + 
			",error = '" + error + '\'' + 
			"}";
		}
}