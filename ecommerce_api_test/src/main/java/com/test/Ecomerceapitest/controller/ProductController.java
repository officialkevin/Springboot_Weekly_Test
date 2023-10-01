package com.test.Ecomerceapitest.controller;

import com.test.Ecomerceapitest.service.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    Product product;

    @PostMapping("product")
    public String addProduct(@RequestBody com.test.Ecomerceapitest.model.Product product){
        return this.product.addProduct(product);
    }

    @GetMapping("products")
    public List<com.test.Ecomerceapitest.model.Product> getProductsByCategory(@RequestParam String category){
        return product.getProductsByCategory(category);
    }

    @DeleteMapping("product/{productID}")
    public String deleteProductByID(@PathVariable Integer productID){
        return product.deleteProductByID(productID);
    }
}
