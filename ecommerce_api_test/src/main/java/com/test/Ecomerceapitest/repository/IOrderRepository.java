package com.test.Ecomerceapitest.repository;

import com.test.Ecomerceapitest.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepository extends JpaRepository<Order,Integer> {
}
