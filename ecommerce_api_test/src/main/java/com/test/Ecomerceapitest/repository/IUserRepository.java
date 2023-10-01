package com.test.Ecomerceapitest.repository;

import com.test.Ecomerceapitest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Integer> {
}
