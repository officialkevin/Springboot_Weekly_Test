package com.instagram.Instagram.repository;

import com.instagram.Instagram.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepository extends JpaRepository<Post,Long> {
}
