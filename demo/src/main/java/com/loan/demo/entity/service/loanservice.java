package com.loan.demo.entity.service;

import java.util.List;

import com.loan.demo.entity.loan;

public interface loanservice {
	
	List<loan> getallLoans();
	loan getLoanid(Long id);
	loan createLoan(loan l);
	

}
