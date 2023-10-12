package com.weekassignment.rms_Assignment.controller;

import com.weekassignment.rms_Assignment.service.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VisitorController {

    @Autowired
    Food food;

    @GetMapping("visitor/foods/")
    public List<com.weekassignment.rms_Assignment.model.Food> getAllFoodItem()
    {
        return food.getAllFoodItems();
    }
}
