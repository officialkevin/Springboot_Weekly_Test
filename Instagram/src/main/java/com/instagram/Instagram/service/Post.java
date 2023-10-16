package com.instagram.Instagram.service;

import com.instagram.Instagram.repository.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Post {

    @Autowired
    IPostRepository iPostRepository;

    public String addPost(com.instagram.Instagram.models.Post post) {

        iPostRepository.save(post);
        return "Posted Successfully";
    }

    public com.instagram.Instagram.models.Post getPostById(Long postId) {
        return iPostRepository.findById(postId).orElseThrow();
    }
}
