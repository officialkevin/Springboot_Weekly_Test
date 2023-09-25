package com.Assignmentums.umsWithValidation.repository;

import com.Assignmentums.umsWithValidation.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {

    @Bean
    public List<User> getAllUsers() {
        return new ArrayList<>();
    }

}
