package com.test.Ecomerceapitest.controller;

import com.test.Ecomerceapitest.service.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    Address address;

    @PostMapping("address")
    public String addAddress(@RequestBody com.test.Ecomerceapitest.model.Address address){
        return this.address.addAddress(address);
    }
}
