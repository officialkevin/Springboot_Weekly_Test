package com.test.Ecomerceapitest.service;

import com.test.Ecomerceapitest.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 class Bet{
    void call(){
        System.out.println("ys");
    }
}
@Service
public class User {

    @Autowired
    IUserRepository iUserRepository;

    // Add User
    public String addUser(com.test.Ecomerceapitest.model.User user) {
        iUserRepository.save(user);
        return "user added";
    }

    // Get User By userID
    Bet m2=new Bet();
    public com.test.Ecomerceapitest.model.User getUserByID(Integer userID) {

       m2. call();
        return iUserRepository.findById(userID).orElseThrow();
    }
}
