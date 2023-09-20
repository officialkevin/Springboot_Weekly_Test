package com.Url.Counter.Assignment.App.Repo;

import com.Url.Counter.Assignment.App.Entity.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Repo {

    @Autowired
    private List<Entity> urlHit;

    public List<Entity> getUrlHitCounter()
    {
        return  urlHit;
    }

    public void addUsers(Entity u)
    {
        urlHit.add(u);
    }
}
