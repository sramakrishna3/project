package com.loan.demo.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loan.demo.entity.Customer;

public interface Customerespositry extends JpaRepository<Customer, Long> {
	
	Optional<Customer> findByUsernameAndPassword(String username, String password);

}
