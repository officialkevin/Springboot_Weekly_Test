package com.assignment.Employee.repository;

import com.assignment.Employee.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Addressrepo extends JpaRepository<Address,Long> {
}
