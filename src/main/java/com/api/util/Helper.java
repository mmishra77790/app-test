package com.api.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.api.model.FoodTruck;

public class Helper {
	public static List<FoodTruck> convertCSVToObject(BufferedReader br) {
		List<FoodTruck> listFoodTruck = new ArrayList<FoodTruck>();
		FoodTruck foodTruck = null;
		String line = "";
        String cvsSplitBy = ",";
        try {

            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                foodTruck = new FoodTruck();
                foodTruck.setApplicant(data[0]);
                foodTruck.setLocationDescription(data[1]);
                foodTruck.setAddress(data[2]);
                foodTruck.setLatitude(data[3]);
                foodTruck.setLongitude(data[4]);
                listFoodTruck.add(foodTruck);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return listFoodTruck;
		
	}
}
