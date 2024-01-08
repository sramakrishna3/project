package com.loan.demo.serviceimpl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.demo.entity.loan;
import com.loan.demo.entity.service.loanservice;
import com.loan.demo.respository.loanrespository;

@Service
public class loanserviceimpl implements loanservice {

	@Autowired
	private loanrespository loanRespository;
	
	@Override
	public List<loan> getallLoans() {
		return loanRespository.findAll();
	}

	@Override
	public loan getLoanid(Long id) {
		return loanRespository.findById(id).orElseThrow(()-> new
		NoSuchElementException("loan not found"+id));
	}

	@Override
	public loan createLoan(loan l) {
		return loanRespository.save(l);
	}

}
