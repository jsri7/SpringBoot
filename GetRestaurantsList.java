package com.Saibaba.Rest.Service.appobjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetRestaurantsList {

	@Autowired
	RestaurantsRepository repo;
	
	public List<Restaurants> getAllRestaurantsByCuisine(String type) {
		List<Restaurants> restaurantsByType = new ArrayList<>();
		Optional<List<Restaurants>> listByType = repo.findAllByType(type);
		
		if (listByType.isPresent()){
			restaurantsByType = listByType.get();
		}
		
		return restaurantsByType;
	}
	
}
