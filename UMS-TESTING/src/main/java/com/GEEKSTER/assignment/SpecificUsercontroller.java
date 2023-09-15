package com.GEEKSTER.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SpecificUsercontroller {
    @Autowired
    List<SpecificUser> userList;


    // addUser

    @PostMapping("addUser")
    public String addUser(@RequestBody SpecificUser user){
        Integer userId = user.getUserId();

        for (SpecificUser existingUser : userList) {
            if (existingUser.getUserId().equals(userId)) {
                return "User with the same userId already exists.";
            }
        }

        userList.add(user);
        return "User Added Successfully";
    }



    @GetMapping("getUser/{userId}")
    public SpecificUser getUser(@PathVariable Integer userId) {
        System.out.println("Request received for userId: " + userId);

        for (SpecificUser user : userList) {
            if (user.getUserId().equals(userId)) {
                System.out.println("User found: " + user.getUserName());
                return user;
            }
        }

        System.out.println("User not found for userId: " + userId);
        return null;
    }


    // getAllUser

    @GetMapping("getAllUser")
    public List<SpecificUser> getAllUser(){
        return userList;
    }


    // updateUserInfo

    @PutMapping("update/{userId}")
    public String updateUserInfo(@PathVariable Integer userId, @RequestBody SpecificUser updatedUser) {
        SpecificUser existingUser = null;
        for(SpecificUser user : userList){
            if(user.getUserId().equals(userId)){
                existingUser = user;
                break;
            }
        }

        if(existingUser == null){
            return "User Not Found!";
        }

        existingUser.setName(updatedUser.getName());
        existingUser.setUserName(updatedUser.getUserName());
        existingUser.setAddress(updatedUser.getAddress());
        existingUser.setPhoneNumber(updatedUser.getPhoneNumber());

        return "User Info Updated Successfully";
    }


    // deleteUser

    @DeleteMapping("deleteUser/{userId}")
    public String deleteUser(@PathVariable Integer userId) {

        for (SpecificUser user : userList) {
            if (user.getUserId().equals(userId)) {
                userList.remove(user);
                return "User deleted Successfully";
            }
        }

        return "User not found";
    }

}
