package com.cs201.sendo.clients.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class InstallmentInfo{

	@JsonProperty("is_active")
	private boolean isActive;

	@JsonProperty("min_installment_price")
	private int minInstallmentPrice;

	@JsonProperty("max_installment_term")
	private int maxInstallmentTerm;

	public void setIsActive(boolean isActive){
		this.isActive = isActive;
	}

	public boolean isIsActive(){
		return isActive;
	}

	public void setMinInstallmentPrice(int minInstallmentPrice){
		this.minInstallmentPrice = minInstallmentPrice;
	}

	public int getMinInstallmentPrice(){
		return minInstallmentPrice;
	}

	public void setMaxInstallmentTerm(int maxInstallmentTerm){
		this.maxInstallmentTerm = maxInstallmentTerm;
	}

	public int getMaxInstallmentTerm(){
		return maxInstallmentTerm;
	}

	@Override
 	public String toString(){
		return 
			"InstallmentInfo{" + 
			"is_active = '" + isActive + '\'' + 
			",min_installment_price = '" + minInstallmentPrice + '\'' + 
			",max_installment_term = '" + maxInstallmentTerm + '\'' + 
			"}";
		}
}