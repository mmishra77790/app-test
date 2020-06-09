package com.api.serviceImpl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.config.AppConfiguration;
import com.api.model.FoodTruck;
import com.api.rest.GetLiveFoodTruckData;
import com.api.service.FoodTruckService;
import com.api.util.Helper;

@Service
public class FoodTruckServiceImpl implements FoodTruckService {
	
	@Autowired
	private AppConfiguration appConfig;

	@Override
	public List<FoodTruck> getLiveFoodTruckDataSet() throws Exception {
		return Helper.convertCSVToObject(new GetLiveFoodTruckData().getLiveFoodTruckData(appConfig));
	}

	@Override
	public List<FoodTruck> getDownloadedFoodTruckDataSet() throws Exception {
		String csvFile = "C:\\Users\\mmishr17\\Desktop\\Food\\Food_Trucks.csv";
		BufferedReader br = null;
		br = new BufferedReader(new FileReader(csvFile));
		return Helper.convertCSVToObject(br);
	}

	
	
}
