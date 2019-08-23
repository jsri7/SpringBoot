package com.Saibaba.Rest.Service.appobjects;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantsRepository extends JpaRepository<Restaurants, Integer>{
	
	public Optional<List<Restaurants>> findAllByType(String Type);

}
