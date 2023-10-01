package com.test.Ecomerceapitest.service;

import com.test.Ecomerceapitest.repository.IAddressRepository;
import com.test.Ecomerceapitest.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Address {

    @Autowired
    IAddressRepository iAddressRepository;

    @Autowired
    IUserRepository iUserRepository;


    public String addAddress(com.test.Ecomerceapitest.model.Address address) {
        iAddressRepository.save(address);
        return "address added";
    }
}
