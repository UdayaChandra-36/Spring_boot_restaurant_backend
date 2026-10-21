package com.vcube.restaurantservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "FoodItem76")
public class FoodItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
String item_name;
double item_price;
Integer quantity;


public Integer getId() {
	return id;
}


public void setId(Integer id) {
	this.id = id;
}


public String getItem_name() {
	return item_name;
}


public void setItem_name(String item_name) {
	this.item_name = item_name;
}


public double getItem_price() {
	return item_price;
}


public void setItem_price(double item_price) {
	this.item_price = item_price;
}


public Integer getQuantity() {
	return quantity;
}


public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}


public Restaurant getRestaurant() {
	return restaurant;
}


public void setRestaurant(Restaurant restaurant) {
	this.restaurant = restaurant;
}


@JoinColumn(name = "restautant_id", referencedColumnName = "id")
@ManyToOne
Restaurant restaurant;
}
