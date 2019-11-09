package com.cs201.sendo.clients.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ReturnPolicyItem{

	@JsonProperty("tooltip_content")
	private String tooltipContent;

	@JsonProperty("color")
	private String color;

	@JsonProperty("enable")
	private boolean enable;

	@JsonProperty("icon")
	private String icon;

	@JsonProperty("position")
	private String position;

	@JsonProperty("title")
	private String title;

	@JsonProperty("tooltip_title")
	private String tooltipTitle;

	@JsonProperty("is_installment")
	private boolean isInstallment;

	@JsonProperty("installment_label")
	private String installmentLabel;

	public void setTooltipContent(String tooltipContent){
		this.tooltipContent = tooltipContent;
	}

	public String getTooltipContent(){
		return tooltipContent;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setEnable(boolean enable){
		this.enable = enable;
	}

	public boolean isEnable(){
		return enable;
	}

	public void setIcon(String icon){
		this.icon = icon;
	}

	public String getIcon(){
		return icon;
	}

	public void setPosition(String position){
		this.position = position;
	}

	public String getPosition(){
		return position;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setTooltipTitle(String tooltipTitle){
		this.tooltipTitle = tooltipTitle;
	}

	public String getTooltipTitle(){
		return tooltipTitle;
	}

	public void setIsInstallment(boolean isInstallment){
		this.isInstallment = isInstallment;
	}

	public boolean isIsInstallment(){
		return isInstallment;
	}

	public void setInstallmentLabel(String installmentLabel){
		this.installmentLabel = installmentLabel;
	}

	public String getInstallmentLabel(){
		return installmentLabel;
	}

	@Override
 	public String toString(){
		return 
			"ReturnPolicyItem{" + 
			"tooltip_content = '" + tooltipContent + '\'' + 
			",color = '" + color + '\'' + 
			",enable = '" + enable + '\'' + 
			",icon = '" + icon + '\'' + 
			",position = '" + position + '\'' + 
			",title = '" + title + '\'' + 
			",tooltip_title = '" + tooltipTitle + '\'' + 
			",is_installment = '" + isInstallment + '\'' + 
			",installment_label = '" + installmentLabel + '\'' + 
			"}";
		}
}