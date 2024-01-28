package com.example.Foodie.Controller;

import com.example.Foodie.Food;
import com.example.Foodie.Service.Foodservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FoodController {


    @Autowired
    Foodservice service;
       @GetMapping("search")
 public String getHelloSpring(){
     return " Hello Spring!!";
   }


    @PostMapping("/create")
    public void createFood(@RequestBody Food food){
        service.createFood(food);
    }

    @GetMapping("/get")
    public Food getFood(@RequestParam( name="id" )int id){
        return service.getFood(id);
    }

    @DeleteMapping("/delete")
    public void deleteFood(@RequestParam(name="id")int id){
        service.deleteFood(id);
    }

    @PutMapping("/update")
    public void updateFood(@RequestBody Food food, @RequestParam(name="id")int id ){
        service.updateFood(food,id);
    }
}
