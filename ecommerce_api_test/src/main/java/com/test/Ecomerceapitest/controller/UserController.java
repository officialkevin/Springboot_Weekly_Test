package com.test.Ecomerceapitest.controller;

import com.test.Ecomerceapitest.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    User user;

    @PostMapping("user")
    public String addUser(@RequestBody com.test.Ecomerceapitest.model.User user){
        return this.user.addUser(user);
    }

    @GetMapping("user/{userID}")
    public com.test.Ecomerceapitest.model.User getUserByID(@PathVariable Integer userID){
        return user.getUserByID(userID);
    }
}
