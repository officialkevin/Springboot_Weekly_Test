package com.assignment.Employee.controller;

import com.assignment.Employee.service.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    Address address;

    @PostMapping("addresses")
    public String addAddresses(@RequestBody com.assignment.Employee.model.Address address){
        return this.address.addAddresses(address);
    }

    @GetMapping("addresses/{addressId}")
    public com.assignment.Employee.model.Address getAddressesById(@PathVariable Long addressId){
        return address.getAddressesById(addressId);
    }

    @GetMapping("addresses")
    public List<com.assignment.Employee.model.Address> getAllAddresses(){
        return address.getAllAddresses();
    }

    @PutMapping("addresses/{addressId}")
    public String updateAddresses(@PathVariable Long addressId,@RequestBody com.assignment.Employee.model.Address address){
        return this.address.updateAddresses(addressId,address);
    }

    @DeleteMapping("addresses/{addressId}")
    public String deleteAddresses(@PathVariable Long addressId){
        return address.deleteAddressesById(addressId);
    }
}
