package com.sample.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sample.entity.FoodItemsList;

@Service
public class GetItems {
	
	public List<FoodItemsList> processItems() {
		return Arrays.asList(new FoodItemsList(1,"Panipuri"),
				new FoodItemsList(2, "Noodles"),
				new FoodItemsList(3,"Sandwich"));
	}
	

}
