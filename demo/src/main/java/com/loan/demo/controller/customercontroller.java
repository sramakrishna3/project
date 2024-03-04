package com.loan.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.loan.demo.entity.customer;
import com.loan.demo.entity.service.customerservice;

@RestController()
@RequestMapping("customer")
public class customercontroller {
	
	@Autowired
	private customerservice customerService;
	
	@PostMapping("save")
	public customer savedata(@RequestBody customer c) {
		return customerService.createCustomer(c);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<customer> getCustomerbyid(@PathVariable Long id) {
		customer cust=customerService.getCustomerid(id);
		return new ResponseEntity<>(cust,HttpStatus.NOT_FOUND);
	}

	@PutMapping("login")
	public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password ){
		boolean loginsucess = customerService.findbyusername(username, password);
		if(loginsucess) {
			return
			ResponseEntity.ok("login sucessful");
		}else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("login failed");
		}
	}

}
