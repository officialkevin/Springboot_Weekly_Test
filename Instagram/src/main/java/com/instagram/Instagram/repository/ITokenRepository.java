package com.instagram.Instagram.repository;

import com.instagram.Instagram.models.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITokenRepository extends JpaRepository<AuthenticationToken,Long> {
    AuthenticationToken findFirstByTokenValue(String tokenValue);
}
