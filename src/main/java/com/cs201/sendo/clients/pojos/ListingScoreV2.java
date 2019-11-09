package com.cs201.sendo.clients.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ListingScoreV2{

	@JsonProperty("updated_at")
	private int updatedAt;

	@JsonProperty("score_v2")
	private int scoreV2;

	public void setUpdatedAt(int updatedAt){
		this.updatedAt = updatedAt;
	}

	public int getUpdatedAt(){
		return updatedAt;
	}

	public void setScoreV2(int scoreV2){
		this.scoreV2 = scoreV2;
	}

	public int getScoreV2(){
		return scoreV2;
	}

	@Override
 	public String toString(){
		return 
			"ListingScoreV2{" + 
			"updated_at = '" + updatedAt + '\'' + 
			",score_v2 = '" + scoreV2 + '\'' + 
			"}";
		}
}