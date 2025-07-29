package com.loan.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loan.demo.entity.Loan;
import com.loan.demo.entity.service.Loanservice;

@RestController
@RequestMapping("/loan")
public class Loancontroller {

    @Autowired
    private Loanservice loanService;

    @PostMapping("/save")
    public ResponseEntity<Loan> savedata(@RequestBody Loan l) {
        Loan savedLoan = loanService.createLoan(l);
        return new ResponseEntity<>(savedLoan, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Loan> getbyloanid(@PathVariable Long id) {
        Loan Loan = loanService.getLoanid(id);
        return new ResponseEntity<>(Loan, HttpStatus.OK);
    }
    
    @DeleteMapping("/{id}")
    public Loan loanDelete(@PathVariable Long id) {
		return loanService.deleteLoan(id);
    	
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllLoans() {
        return new ResponseEntity<>(loanService.getallLoans(), HttpStatus.OK);
    }

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<?> getLoansByCustomerId(@PathVariable Long customerId) {
        return new ResponseEntity<>(loanService.findByCustomerId(customerId), HttpStatus.OK);
    }
}
