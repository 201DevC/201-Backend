package com.cs201.sendo.clients.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class RatingInfo{

	@JsonProperty("total_rated")
	private int totalRated;

	public void setTotalRated(int totalRated){
		this.totalRated = totalRated;
	}

	public int getTotalRated(){
		return totalRated;
	}

	@Override
 	public String toString(){
		return 
			"RatingInfo{" + 
			"total_rated = '" + totalRated + '\'' + 
			"}";
		}
}