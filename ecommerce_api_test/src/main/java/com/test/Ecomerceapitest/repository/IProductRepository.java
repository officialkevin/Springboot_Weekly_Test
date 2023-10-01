package com.test.Ecomerceapitest.repository;

import com.test.Ecomerceapitest.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product,Integer> {
    List<Product> findByCategory(String category);
}
