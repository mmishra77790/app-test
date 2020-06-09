package com.api.rest;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.stream.IntStream;

import com.api.config.AppConfiguration;
import com.api.model.FoodTruck;
import com.api.util.Helper;


public class GetLiveFoodTruckData {
	public BufferedReader getLiveFoodTruckData(AppConfiguration appConfig) throws Exception {
		String url = appConfig.getFoofTruckLivePath();
    	URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		InputStream inputStream = con.getInputStream();
		return new BufferedReader(new InputStreamReader(inputStream));
	}
}
