package com.loan.demo.entity.service;

import java.util.List;

import com.loan.demo.entity.Customer;

public interface Customerservice {
	
	List<Customer> getallcustomers();
	Customer getCustomerid(Long id);
	Customer createCustomer(Customer cust);
	Boolean validateLogin(String username, String password);
	Customer deleteCustomer(Long id);

}
