package com.weekassignment.rms_Assignment.controller;

import com.weekassignment.rms_Assignment.model.User;
import com.weekassignment.rms_Assignment.service.Food;
import com.weekassignment.rms_Assignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    Food food;

    @Autowired
    UserService userService;

    @PostMapping("foodItem")
    public String createFoodItem(@RequestParam String email, @RequestBody com.weekassignment.rms_Assignment.model.Food foodItem){
        return food.createFoodItem(email, foodItem);
    }


    @DeleteMapping("foodItem/{email}/{foodId}")
    public String deleteFoodItem(@PathVariable String email, @PathVariable Long foodId){
        return food.deleteFoodItem(email,foodId);
    }

    @GetMapping("users")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
}
