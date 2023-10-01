package com.test.Ecomerceapitest.controller;

import com.test.Ecomerceapitest.model.Order;
import com.test.Ecomerceapitest.service.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @Autowired
    Orders orders;

    @PostMapping("order")
    public String placeOrder(@RequestBody Order order){
        return orders.placeOrder(order);
    }

    @GetMapping("order/{orderID}")
    public Order getOrderByID(@PathVariable Integer orderID){
        return orders.getOrderByID(orderID);
    }
}
