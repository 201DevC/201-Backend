package com.cs201.sendo.clients.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Options{

	@JsonProperty("is_shipping_fee_support")
	private int isShippingFeeSupport;

	@JsonProperty("is_installment")
	private boolean isInstallment;

	@JsonProperty("is_loyalty")
	private int isLoyalty;

	public void setIsShippingFeeSupport(int isShippingFeeSupport){
		this.isShippingFeeSupport = isShippingFeeSupport;
	}

	public int getIsShippingFeeSupport(){
		return isShippingFeeSupport;
	}

	public void setIsInstallment(boolean isInstallment){
		this.isInstallment = isInstallment;
	}

	public boolean isIsInstallment(){
		return isInstallment;
	}

	public void setIsLoyalty(int isLoyalty){
		this.isLoyalty = isLoyalty;
	}

	public int getIsLoyalty(){
		return isLoyalty;
	}

	@Override
 	public String toString(){
		return 
			"Options{" + 
			"is_shipping_fee_support = '" + isShippingFeeSupport + '\'' + 
			",is_installment = '" + isInstallment + '\'' + 
			",is_loyalty = '" + isLoyalty + '\'' + 
			"}";
		}
}