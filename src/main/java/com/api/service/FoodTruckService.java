package com.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.model.FoodTruck;

@Service
public interface FoodTruckService {
	
	 public List<FoodTruck> getLiveFoodTruckDataSet() throws Exception;;
	 public List<FoodTruck> getDownloadedFoodTruckDataSet() throws Exception;
	 
	 
}
