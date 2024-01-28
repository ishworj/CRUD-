package com.example.Foodie.Service;

import com.example.Foodie.Food;
import com.example.Foodie.Repository.FoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Foodservice {
    @Autowired
    FoodRepo foodRepo;


     public void createFood(Food food) {
         foodRepo.save(food);

     }

    public Food getFood(int id) {
         return foodRepo.findById(id).get();
    }

    public void deleteFood(int id) {
         foodRepo.deleteById(id);
    }

    public void updateFood(Food food, int id) {
       Food  foodToBeUpdated =getFood(id);
       foodToBeUpdated.setName(food.getName());
       foodToBeUpdated.setType(food.getType());
       foodToBeUpdated.setPrice(food.getPrice());
      // foodToBeUpdated.setIndegridents(food.getIndegridents());

       foodRepo.save(foodToBeUpdated);

    }
}
