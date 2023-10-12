package com.weekassignment.rms_Assignment.repository;

import com.weekassignment.rms_Assignment.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {
    User findFirstByEmail(String email);
}
