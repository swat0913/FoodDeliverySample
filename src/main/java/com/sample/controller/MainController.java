package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.entity.FoodItemsList;
import com.sample.service.GetItems;

@RestController
public class MainController {
	@Autowired
	GetItems getItems;
	@GetMapping(path = "/")
	public void getMainPage() {
		System.out.println("Welcome to Main Page");
	}
	@GetMapping(path = "/getItems")
	public @ResponseBody List<FoodItemsList> getFoofItems() {
		return getItems.processItems();
	}

}
