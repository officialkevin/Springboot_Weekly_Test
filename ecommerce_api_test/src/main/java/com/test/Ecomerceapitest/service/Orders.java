package com.test.Ecomerceapitest.service;

import com.test.Ecomerceapitest.model.Order;
import com.test.Ecomerceapitest.repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Orders {

    @Autowired
    IOrderRepository iOrderRepository;

    public String placeOrder(Order order) {
        iOrderRepository.save(order);
        return "Your order placed";
    }

    public Order getOrderByID(Integer orderID) {
        return iOrderRepository.findById(orderID).orElseThrow();
    }
}
