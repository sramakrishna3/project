package com.loan.demo.entity.service;

import java.util.List;

import com.loan.demo.entity.Loan;

public interface Loanservice {
	
	List<Loan> getallLoans();
	Loan getLoanid(Long id);
	Loan createLoan(Loan l);
	List<Loan> findByCustomerId(Long custId);
	Loan deleteLoan(Long id);


}
