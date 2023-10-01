package com.test.Ecomerceapitest.service;

import com.test.Ecomerceapitest.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Product {

    @Autowired
    IProductRepository iProductRepository;

    // Add product


    // Get Products By Category
    public List<com.test.Ecomerceapitest.model.Product> getProductsByCategory(String category) {
        return iProductRepository.findByCategory(category);
    }

    // Delete Product By ID
    public String deleteProductByID(Integer productID) {
        iProductRepository.deleteById(productID);
        return "Product deleted";
    }


    public String addProduct(com.test.Ecomerceapitest.model.Product product) {
        iProductRepository.save(product);
        return "product added";
    }
}
