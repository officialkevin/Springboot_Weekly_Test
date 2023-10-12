package com.weekassignment.rms_Assignment.repository;

import com.weekassignment.rms_Assignment.model.UserAuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserTokenRepository extends JpaRepository<UserAuthenticationToken,Long> {
    UserAuthenticationToken findFirstByTokenValue(String tokenValue);
}
