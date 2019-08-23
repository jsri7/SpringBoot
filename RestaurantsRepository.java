package com.Saibaba.Rest.Service.appobjects;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantsRepository extends JpaRepository<Restaurants, Integer>{
	
//	@Query("Select t from Restaurants t where t.type = :type")
//	public List<Restaurants> findAllByType(@Param("type") String type);
	
	@Query("Update Restaurants t set t.rating =:rating")
	public void updateRating(@Param("rating") Integer rating);

}
