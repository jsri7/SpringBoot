package com.Saibaba.Rest.Service.appobjects;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetRestaurantsList {

	@Autowired
	RestaurantsRepository repo;
	
	public List<Restaurants> getAllRestaurantsByCuisine(String type) {
		
		return repo.findAll();
	}
	
	public void saveRestaurantRating(Integer id, Integer rating){
		
		Optional<Restaurants> source = repo.findById(id);
		
		if(source.isPresent()){
			Restaurants r = source.get();
			Integer existingRating = r.getRating();
			
			Integer newRating = (existingRating+rating)/2;
			
			repo.updateRating(newRating);
		}
		
	}
	
}
