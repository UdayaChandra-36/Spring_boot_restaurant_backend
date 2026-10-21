package com.vcube.restaurantservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity

@Table(name = "Restaurant76")
public class Restaurant {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   Integer id;
   String name;
   public Integer getId() {
	return id;
   }
   public void setId(Integer id) {
	this.id = id;
   }
   public String getName() {
	return name;
   }
   public void setName(String name) {
	this.name = name;
   }
   
}
