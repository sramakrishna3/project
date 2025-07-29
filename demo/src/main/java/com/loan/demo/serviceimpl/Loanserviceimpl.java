package com.loan.demo.serviceimpl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.demo.entity.Customer;
import com.loan.demo.entity.Loan;
import com.loan.demo.entity.service.Loanservice;
import com.loan.demo.respository.Customerespositry;
import com.loan.demo.respository.Loanrespository;

import jakarta.transaction.Transactional;

@Service
public class Loanserviceimpl implements Loanservice {

	@Autowired
	private Loanrespository loanRespository;
	
	@Override
	public List<Loan> getallLoans() {
		return loanRespository.findAll();
	}

	@Override
	public Loan getLoanid(Long id) {
		return loanRespository.findById(id).orElseThrow(()-> new
		NoSuchElementException("loan not found"+id));
	}

	@Autowired
	private Customerespositry customerRepository;

	@Override
	@Transactional
	public Loan createLoan(Loan l) {
	    int customerId = l.getCustomer().getCustid();

	    // Fetch full customer from DB
	    Customer existingCustomer = customerRepository.findById((long) customerId)
	        .orElseThrow(() -> new RuntimeException("Customer not found with ID: " + customerId));

	    // Attach the fetched, full entity to the loan
	    l.setCustomer(existingCustomer);

	    return loanRespository.save(l);
	}


	@Override
	public List findByCustomerId(Long custId) {
		return loanRespository.findByCustomer_custid(custId);
	}

	@Override
	public Loan deleteLoan(Long id) {
		Optional<Loan> optional=loanRespository.findById(id);
		if(optional.isPresent()) {
			loanRespository.deleteById(id);
			return optional.get();
		}
		return null;
	}

	

}
