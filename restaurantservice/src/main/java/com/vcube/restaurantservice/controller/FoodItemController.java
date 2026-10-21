package com.vcube.restaurantservice.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import com.vcube.restaurantservice.repo.RestaurantRepo;
import com.vcube.restaurantservice.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.restaurantservice.model.FoodItem;
import com.vcube.restaurantservice.repo.FoodItemRepo;
@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/FoodItems")
public class FoodItemController {
	
	@Autowired
	RestaurantRepo restaurantRepo;
	@Autowired
FoodItemRepo fooditemrepo;
	
	@PostMapping("/Create")
	FoodItem createFoodItem(@RequestBody FoodItem fooditem) {

	    Integer restaurantId = fooditem.getRestaurant().getId();

	    Restaurant restaurant = restaurantRepo.findById(restaurantId)
	        .orElseThrow(() -> new ResponseStatusException(
	            HttpStatus.NOT_FOUND, "Restaurant not found"));

	    fooditem.setRestaurant(restaurant);

	    return fooditemrepo.save(fooditem);
	}
	
	@GetMapping("/getfooditem")
	List<FoodItem>getAllfooditems(){
		return fooditemrepo.findAll();
	}
	
	@GetMapping("/getfooditemsbyid/{id}")
	List<FoodItem> getAllFoodItemsByResId(@PathVariable Integer id) {
	    return fooditemrepo.findByRestaurant_Id(id);
	}
}
