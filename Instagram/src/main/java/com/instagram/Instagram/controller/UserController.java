package com.instagram.Instagram.controller;

import com.instagram.Instagram.models.dto.AuthenticationInput;
import com.instagram.Instagram.models.dto.SignInInput;
import com.instagram.Instagram.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    User user;


    @PostMapping("signUp")
    public String userSignUp(@RequestBody com.instagram.Instagram.models.User user) {
        return this.user.userSignUp(user);
    }

    @PostMapping("signIn")
    public String userSignIn(@RequestBody SignInInput signIn){
        return user.userSignIn(signIn);
    }

    @PutMapping("user")
    public String updateUserEmailByUserId(@RequestBody AuthenticationInput authenticationInput, @RequestParam String email) {
        return user.updateUserDetails(authenticationInput,email);
    }

}

