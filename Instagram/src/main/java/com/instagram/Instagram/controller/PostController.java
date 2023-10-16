package com.instagram.Instagram.controller;

import com.instagram.Instagram.service.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @Autowired
    Post post;

    @PostMapping("post")
    public String addPost(@RequestBody com.instagram.Instagram.models.Post post){
        return this.post.addPost(post);
    }

    @GetMapping("post/{postId}")
    public com.instagram.Instagram.models.Post getPostById(@PathVariable Long postId){
        return post.getPostById(postId);
    }
}
