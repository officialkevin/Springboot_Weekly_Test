package com.instagram.Instagram.repository;

import com.instagram.Instagram.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {
    User findFirstByEmail(String existingEmail);
}
