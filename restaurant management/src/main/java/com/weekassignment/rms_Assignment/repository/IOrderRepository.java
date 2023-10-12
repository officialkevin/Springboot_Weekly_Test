package com.weekassignment.rms_Assignment.repository;

import com.weekassignment.rms_Assignment.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepository extends JpaRepository<Order,Long> {
}
