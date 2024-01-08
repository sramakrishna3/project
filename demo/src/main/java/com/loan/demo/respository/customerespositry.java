package com.loan.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.demo.entity.customer;

@Repository
public interface customerespositry extends JpaRepository<customer, Long> {

}
