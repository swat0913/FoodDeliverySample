package com.sample.entity;

import org.springframework.stereotype.Component;

@Component
public class FoodItemsList {
	
	private int foodItemId;
	private String foodItem;
	public FoodItemsList(int foodItemId, String foodItem) {
		super();
		this.foodItemId = foodItemId;
		this.foodItem = foodItem;
	}
	public int getFoodItemId() {
		return foodItemId;
	}
	public void setFoodItemId(int foodItemId) {
		this.foodItemId = foodItemId;
	}
	public String getFoodItem() {
		return foodItem;
	}
	public void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}

}
