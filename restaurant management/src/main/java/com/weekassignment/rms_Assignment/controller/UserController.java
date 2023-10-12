package com.weekassignment.rms_Assignment.controller;

import com.weekassignment.rms_Assignment.model.User;
import com.weekassignment.rms_Assignment.model.dto.AuthenticationInput;
import com.weekassignment.rms_Assignment.model.dto.OrderRequest;
import com.weekassignment.rms_Assignment.model.dto.SignInInput;
import com.weekassignment.rms_Assignment.service.Food;
import com.weekassignment.rms_Assignment.service.Order;
import com.weekassignment.rms_Assignment.service.UserService;
import com.weekassignment.rms_Assignment.service.Usertoken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    Food food;

    @Autowired
    Order order;

    @Autowired
    Usertoken usertoken;

    @PostMapping("user/signUp")
    public String userSignUp(@RequestBody User user){
        return userService.userSignUp(user);
    }


    @PostMapping("user/signIn")
    public String userSignIn(@RequestBody SignInInput sign){
        return userService.userSignIn(sign);
    }

    @DeleteMapping("user/signOut")
    public String userSignOut(@RequestBody AuthenticationInput authenticationInput) {
        return userService.userSignOut(authenticationInput);
    }

    @PostMapping("user/order")
    public String addOrder(@RequestBody OrderRequest orderRequest){
        if(usertoken.authenticate(orderRequest.getAuthenticationInput())) {
            return order.addOrder(orderRequest.getOrder(),orderRequest.getAuthenticationInput().getEmail());
        }
        else {
            return "You've to sign to order the food!";
        }
    }

    @GetMapping("foods")
    public List<com.weekassignment.rms_Assignment.model.Food> getAllFoodItems()
    {
        return food.getAllFoodItems();
    }


}
