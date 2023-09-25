package com.Assignmentums.umsWithValidation.repository;

import com.Assignmentums.umsWithValidation.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepo {

    @Autowired
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }
}
