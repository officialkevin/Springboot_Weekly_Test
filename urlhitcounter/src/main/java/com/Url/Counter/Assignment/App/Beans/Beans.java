package com.Url.Counter.Assignment.App.Beans;

import com.Url.Counter.Assignment.App.Entity.Entity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Beans {

    @Bean
    public List<Entity> getUrlHitCounterList(){

        return new ArrayList<>();
    }
}