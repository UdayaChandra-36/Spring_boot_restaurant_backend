package com.vcube.restaurantservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vcube.restaurantservice.model.FoodItem;


@Repository
public interface FoodItemRepo extends JpaRepository<FoodItem, Integer>{


	List<FoodItem> findByRestaurant_Id(Integer id);
}
