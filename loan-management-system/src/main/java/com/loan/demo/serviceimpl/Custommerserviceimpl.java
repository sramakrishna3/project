package com.loan.demo.serviceimpl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.demo.entity.Customer;
import com.loan.demo.entity.service.Customerservice;
import com.loan.demo.respository.Customerespositry;

@Service
public class Custommerserviceimpl implements Customerservice {

	@Autowired
	private Customerespositry customerRespositry;

	@Override
	public List<Customer> getallcustomers() {
		return customerRespositry.findAll();
	}

	@Override
	public Customer getCustomerid(Long id) {
		
		return customerRespositry.findById(id).orElseThrow(()->
		new NoSuchElementException("customer not found"+id));
	}

	@Override
	public Customer createCustomer(Customer cust) {
		
		return customerRespositry.save(cust);
	}

	@Override
	public Boolean validateLogin(String username, String password) {
	    List<Customer> customers = customerRespositry.findByUsername(username);

	    for (Customer c : customers) {
	        if (c.getPassword().equals(password)) {
	            return true;
	        }
	    }

	    return false;
	}




	@Override
	public Customer deleteCustomer(Long id) {
		Optional<Customer> optional=customerRespositry.findById(id);
		if(optional.isPresent()) {
			customerRespositry.deleteById(id);
			return optional.get();
		}
		return null;
	}
	
	
}
