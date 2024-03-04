package com.loan.demo.entity.service;

import java.util.List;

import com.loan.demo.entity.customer;

public interface customerservice {
	
	List<customer> getallcustomers();
	customer getCustomerid(Long id);
	customer createCustomer(customer cust);
	boolean findbyusername(String username, String password);

}
