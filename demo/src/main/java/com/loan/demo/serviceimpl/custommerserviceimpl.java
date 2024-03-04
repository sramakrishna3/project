package com.loan.demo.serviceimpl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.demo.entity.customer;
import com.loan.demo.entity.service.customerservice;
import com.loan.demo.respository.customerespositry;

@Service
public class custommerserviceimpl implements customerservice {

	@Autowired
	private customerespositry customerRespositry;

	@Override
	public List<customer> getallcustomers() {
		return customerRespositry.findAll();
	}

	@Override
	public customer getCustomerid(Long id) {
		
		return customerRespositry.findById(id).orElseThrow(()->
		new NoSuchElementException("customer not found"+id));
	}

	@Override
	public customer createCustomer(customer cust) {
		
		return customerRespositry.save(cust);
	}

	@Override
	public boolean findbyusername(String username, String password) {
		Optional<customer> optcust=customerRespositry.findbyusername(username,password);
		return optcust.map(customer -> customer.login(username,password)).orElse(false);
	}
	
	
}
