package com.loan.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.loan.demo.entity.Customer;
import com.loan.demo.serviceimpl.Custommerserviceimpl;

@RestController()
@RequestMapping("/customer")
public class Customercontroller {
	
	@Autowired
	private Custommerserviceimpl customerService;
	
	@PostMapping("/save")
	public Customer savedata(@RequestBody Customer c) {
	    System.out.println("Received customer: " + c);
	    return customerService.createCustomer(c);
	}

	
	@GetMapping("/{id}")
	public ResponseEntity<Customer> getCustomerbyid(@PathVariable Long id) {
		Customer cust=customerService.getCustomerid(id);
		return new ResponseEntity<>(cust,HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/delete/{id}")
	public Customer getDeleteByid(@PathVariable Long id){
		return customerService.deleteCustomer(id);
	}

	@PutMapping("/login")
	public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password ){
		boolean loginsucess = customerService.validateLogin(username, password);
		if(loginsucess) {
			return
			ResponseEntity.ok("login sucessful");
		}else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("login failed");
		}
	}

}
