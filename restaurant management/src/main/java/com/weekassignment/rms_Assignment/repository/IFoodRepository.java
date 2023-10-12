package com.weekassignment.rms_Assignment.repository;

import com.weekassignment.rms_Assignment.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodRepository extends JpaRepository<Food, Long> {
}
