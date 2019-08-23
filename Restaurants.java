package com.Saibaba.Rest.Service.appobjects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Restaurants {

	@Id
	@GeneratedValue
	String Id;
	
	@Column(name ="Name")
	String Name;
	
	@Column(name ="Type")
	String Type;
}
