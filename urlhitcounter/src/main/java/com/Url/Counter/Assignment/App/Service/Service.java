package com.Url.Counter.Assignment.App.Service;

import com.Url.Counter.Assignment.App.Entity.Entity;
import com.Url.Counter.Assignment.App.Repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Repo repo;

    public List<Entity> getAllVisitors()
    {
        return  repo.getUrlHitCounter();
    }


    public String addVisitor(Entity user) {
        List<Entity> visitorlist = getAllVisitors();
        for(Entity u : visitorlist)
        {
            if(u.getUserName().equals(user.getUserName()))
            {
                u.setCounter(u.getCounter()+1);
                return "Cannot add the same visitor count updated";
            }
        }
        visitorlist.add(user);

        return "Welcome to our Website !!!";
    }


    public String getCountOfVisitors() {

        List<Entity> li = getAllVisitors();

        return "Visitors: "+li.size();
    }


    public Entity getAVisitor(String username) {
        List<Entity> visitorlist = getAllVisitors();
        for(Entity u : visitorlist)
        {
            if(u.getUserName().equals(username))
            {
                return u;

            }
        }
        throw new IllegalStateException("UserName not found");
    }

    public String countUpdated(String username) {
        List<Entity> visitorlist = getAllVisitors();
        for(Entity u : visitorlist)
        {
            if(u.getUserName().equals(username))
            {
                u.setCounter(u.getCounter()+1);
                return "Welcome Back";
            }
        }


        return "User not found new User";
    }
}