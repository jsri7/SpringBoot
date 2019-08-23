package com.Saibaba.Rest.Service.appobjects;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestaurantsAPI {
	
	@Autowired
	GetRestaurantsList source;
	
	@GetMapping("/restaurants/{type}")
	public List<Restaurants> getRestaurantsByType(@PathVariable("type")String type){
		return source.getAllRestaurantsByCuisine(type);
	}
	
	@PutMapping("/restaurants/{id}/{rating}")
	public void saveRestaurantRatingById(@PathVariable("id") Integer id,
			@PathVariable("rating") Integer rating){
		source.saveRestaurantRating(id,rating);
	}
	
}
