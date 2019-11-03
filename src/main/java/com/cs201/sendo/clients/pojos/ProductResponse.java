package com.cs201.sendo.clients.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ProductResponse{

	@JsonProperty("result")
	private Result result;

	@JsonProperty("status")
	private Status status;

	public void setResult(Result result){
		this.result = result;
	}

	public Result getResult(){
		return result;
	}

	public void setStatus(Status status){
		this.status = status;
	}

	public Status getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"ProductResponse{" + 
			"result = '" + result + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}