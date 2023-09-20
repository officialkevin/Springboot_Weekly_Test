package com.Url.Counter.Assignment.App.Controller;

import com.Url.Counter.Assignment.App.Entity.Entity;
import com.Url.Counter.Assignment.App.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private Service service;

    /*Get ALL Users
     * Get Specific User with number of Count The Same User Has Visited
     * Get The Number Of Visitors
     * Post a new Visitor
     * put Hit the Url to update counter for each Visitor */

    // Post a new Visitor

    @PostMapping("visitor")
    public String addAVisitor(@RequestBody Entity user)
    {
        return service.addVisitor(user);
    }

    @GetMapping("visitors") //get all Visitors
    public List<Entity> getAllVisitors()
    {
        return service.getAllVisitors();
    }

    @GetMapping("visitor/count") //Visitor Count
    public String getTheNumberOfVisitors()
    {
        return service.getCountOfVisitors();
    }

    @GetMapping("api/v1/visitor-count-app/username/{username}") //get specific user
    public Entity getAVisitor(@PathVariable String username)
    {
        return service.getAVisitor(username);
    }
    @PutMapping("api/v1/count_update/username/{username}")
    public String countUpdated(@PathVariable  String username)
    {
        return service.countUpdated(username);
    }
}
