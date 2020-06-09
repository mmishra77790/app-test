package com.api.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "app")
@Configuration
@EnableConfigurationProperties
public class AppConfiguration { 
	
	private String foodTruckFileName;
	private String foofTruckLivePath;
	
	public String getFoodTruckFileName() {
		return foodTruckFileName;
	}
	public void setFoodTruckFileName(String foodTruckFileName) {
		this.foodTruckFileName = foodTruckFileName;
	}
	public String getFoofTruckLivePath() {
		return foofTruckLivePath;
	}
	public void setFoofTruckLivePath(String foofTruckLivePath) {
		this.foofTruckLivePath = foofTruckLivePath;
	}
	
	@Override
	public String toString() {
		return "AppConfiguration [foodTruckFileName=" + foodTruckFileName + ", foofTruckLivePath=" + foofTruckLivePath
				+ "]";
	}
	
}
