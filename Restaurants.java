package com.Saibaba.Rest.Service.appobjects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Restaurants")
public class Restaurants {

	@Id
	@GeneratedValue
	Integer id;
	
	@Column(name ="Name")
	String name;
	
	@Column(name ="Type")
	String type;
	
	@Column(name = "Rating")
	Integer rating;
	
	public Integer getRating() {
		return rating;
	}
}

