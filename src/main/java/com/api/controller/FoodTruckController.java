package com.api.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.api.config.AppConfiguration;
import com.api.model.FoodTruck;
import com.api.service.FoodTruckService;
import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api")
@Api(value = "Its for Food Truck APi's", description = "Its for Food Truck APi's")
public class FoodTruckController {

	private static final Logger LOG = LoggerFactory.getLogger(FoodTruckController.class);
	
	@Autowired
	private AppConfiguration appConfig;
	
	@Autowired
	private FoodTruckService foodTruckService;
	
	@RequestMapping(value = "/healthCheck", method= RequestMethod.GET)
	public String getHealthCheck(HttpServletRequest request) throws InterruptedException {
		return "Running fine";
	}
	
	@RequestMapping(value = "/config", method= RequestMethod.GET)
	public String config() throws InterruptedException {
		return appConfig.toString();
	} 
	
	@RequestMapping(value = "/getLiveFoodTruckDataSet", method= RequestMethod.GET)
	public List<FoodTruck> getLiveFoodTruckDataSet() throws Exception {
		return foodTruckService.getLiveFoodTruckDataSet();
	} 
	
	@RequestMapping(value = "/getDownloadedFoodTruckDataSet", method= RequestMethod.GET)
	public List<FoodTruck> getDownloadedFoodTruckDataSet() throws Exception {
		return foodTruckService.getDownloadedFoodTruckDataSet();
	} 
	
}
