package com.cs201.sendo.clients.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ListTime{

	@JsonProperty("delivery_info")
	private int deliveryInfo;

	@JsonProperty("installment")
	private int installment;

	public void setDeliveryInfo(int deliveryInfo){
		this.deliveryInfo = deliveryInfo;
	}

	public int getDeliveryInfo(){
		return deliveryInfo;
	}

	public void setInstallment(int installment){
		this.installment = installment;
	}

	public int getInstallment(){
		return installment;
	}

	@Override
 	public String toString(){
		return 
			"ListTime{" + 
			"delivery_info = '" + deliveryInfo + '\'' + 
			",installment = '" + installment + '\'' + 
			"}";
		}
}