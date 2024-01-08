package com.loan.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loan.demo.entity.loan;
import com.loan.demo.entity.service.loanservice;

@RestController()
@RequestMapping("loan")
public class loancontroller {
	
	@Autowired
	private loanservice loanService;
	
	@PostMapping("save")
	public loan savedata(@RequestBody loan l) {
		return loanService.createLoan(l);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<loan> getbyloanid(@PathVariable Long id){
		loan Loan=loanService.getLoanid(id);
		return new ResponseEntity<>(Loan,HttpStatus.OK);
		
	}
}
