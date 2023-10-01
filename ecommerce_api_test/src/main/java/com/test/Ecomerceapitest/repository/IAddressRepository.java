package com.test.Ecomerceapitest.repository;

import com.test.Ecomerceapitest.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepository extends JpaRepository<Address,Integer> {
}
