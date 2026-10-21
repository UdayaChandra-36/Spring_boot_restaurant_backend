package com.vcube.restaurantservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.restaurantservice.model.Restaurant;
import com.vcube.restaurantservice.repo.RestaurantRepo;


@CrossOrigin(origins = "http://localhost:5173")


@RestController

@RequestMapping("/restaurant")
public class RestaurantController {
@Autowired
RestaurantRepo restaurantrepo;

@GetMapping("/GetAllRest")
List<Restaurant> getAllRestaurants(){
	return restaurantrepo.findAll();
}
@PostMapping("/CreateRest")
Restaurant createRestaurant(@RequestBody Restaurant restaurant) {
	return restaurantrepo.save(restaurant);
}
@GetMapping("/getres/{id}")
Restaurant getRestaurant(@PathVariable Integer id) {
	return restaurantrepo.findById(id).get();
}
@DeleteMapping("/Delres/{id}")
String deleteRestaurant(@PathVariable Integer id) {
	restaurantrepo.deleteById(id);
	return "The restaurant deleted";
}
@PutMapping("/Update/{id}")
Restaurant  updateRestaurant(@RequestBody Restaurant restaurant, @PathVariable Integer id) {
	Restaurant restaurantFromDB = restaurantrepo.findById(id).get();
	 restaurantFromDB.setName(restaurant.getName());
	return restaurantrepo.save(restaurantFromDB);
}

}
