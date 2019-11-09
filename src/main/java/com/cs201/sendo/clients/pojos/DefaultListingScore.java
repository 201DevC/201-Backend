package com.cs201.sendo.clients.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class DefaultListingScore{

	@JsonProperty("score_cate3")
	private int scoreCate3;

	@JsonProperty("score_cate2")
	private int scoreCate2;

	public void setScoreCate3(int scoreCate3){
		this.scoreCate3 = scoreCate3;
	}

	public int getScoreCate3(){
		return scoreCate3;
	}

	public void setScoreCate2(int scoreCate2){
		this.scoreCate2 = scoreCate2;
	}

	public int getScoreCate2(){
		return scoreCate2;
	}

	@Override
 	public String toString(){
		return 
			"DefaultListingScore{" + 
			"score_cate3 = '" + scoreCate3 + '\'' + 
			",score_cate2 = '" + scoreCate2 + '\'' + 
			"}";
		}
}