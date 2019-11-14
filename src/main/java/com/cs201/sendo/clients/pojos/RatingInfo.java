package com.cs201.sendo.clients.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class RatingInfo{

	@JsonProperty("percent_star2")
	private int percentStar2;

	@JsonProperty("percent_star3")
	private int percentStar3;

	@JsonProperty("percent_star1")
	private int percentStar1;

	@JsonProperty("star4")
	private int star4;

	@JsonProperty("percent_star")
	private int percentStar;

	@JsonProperty("star5")
	private int star5;

	@JsonProperty("percent_star4")
	private int percentStar4;

	@JsonProperty("star2")
	private int star2;

	@JsonProperty("percent_star5")
	private int percentStar5;

	@JsonProperty("star3")
	private int star3;

	@JsonProperty("star1")
	private int star1;

	@JsonProperty("total_rated")
	private int totalRated;

	@JsonProperty("percent_number")
	private int percentNumber;

	public void setPercentStar2(int percentStar2){
		this.percentStar2 = percentStar2;
	}

	public int getPercentStar2(){
		return percentStar2;
	}

	public void setPercentStar3(int percentStar3){
		this.percentStar3 = percentStar3;
	}

	public int getPercentStar3(){
		return percentStar3;
	}

	public void setPercentStar1(int percentStar1){
		this.percentStar1 = percentStar1;
	}

	public int getPercentStar1(){
		return percentStar1;
	}

	public void setStar4(int star4){
		this.star4 = star4;
	}

	public int getStar4(){
		return star4;
	}

	public void setPercentStar(int percentStar){
		this.percentStar = percentStar;
	}

	public int getPercentStar(){
		return percentStar;
	}

	public void setStar5(int star5){
		this.star5 = star5;
	}

	public int getStar5(){
		return star5;
	}

	public void setPercentStar4(int percentStar4){
		this.percentStar4 = percentStar4;
	}

	public int getPercentStar4(){
		return percentStar4;
	}

	public void setStar2(int star2){
		this.star2 = star2;
	}

	public int getStar2(){
		return star2;
	}

	public void setPercentStar5(int percentStar5){
		this.percentStar5 = percentStar5;
	}

	public int getPercentStar5(){
		return percentStar5;
	}

	public void setStar3(int star3){
		this.star3 = star3;
	}

	public int getStar3(){
		return star3;
	}

	public void setStar1(int star1){
		this.star1 = star1;
	}

	public int getStar1(){
		return star1;
	}

	public void setTotalRated(int totalRated){
		this.totalRated = totalRated;
	}

	public int getTotalRated(){
		return totalRated;
	}

	public void setPercentNumber(int percentNumber){
		this.percentNumber = percentNumber;
	}

	public int getPercentNumber(){
		return percentNumber;
	}

	@Override
 	public String toString(){
		return 
			"RatingInfo{" + 
			"percent_star2 = '" + percentStar2 + '\'' + 
			",percent_star3 = '" + percentStar3 + '\'' + 
			",percent_star1 = '" + percentStar1 + '\'' + 
			",star4 = '" + star4 + '\'' + 
			",percent_star = '" + percentStar + '\'' + 
			",star5 = '" + star5 + '\'' + 
			",percent_star4 = '" + percentStar4 + '\'' + 
			",star2 = '" + star2 + '\'' + 
			",percent_star5 = '" + percentStar5 + '\'' + 
			",star3 = '" + star3 + '\'' + 
			",star1 = '" + star1 + '\'' + 
			",total_rated = '" + totalRated + '\'' + 
			",percent_number = '" + percentNumber + '\'' + 
			"}";
		}
}