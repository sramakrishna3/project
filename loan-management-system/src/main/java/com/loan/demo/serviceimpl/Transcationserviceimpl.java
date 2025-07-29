package com.loan.demo.serviceimpl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.demo.entity.Customer;
import com.loan.demo.entity.Loan;
import com.loan.demo.entity.Transcation;
import com.loan.demo.entity.service.Transcationservice;
import com.loan.demo.respository.Customerespositry;
import com.loan.demo.respository.Loanrespository;
import com.loan.demo.respository.Transcationrepository;

import jakarta.transaction.Transactional;

@Service
public class Transcationserviceimpl implements Transcationservice {
	
	@Autowired
	private Transcationrepository transcationRepository;
	
	@Autowired
	private Loanrespository loanRepository;
	
	@Override
	public List<Transcation> getalltranscations() {
		// TODO Auto-generated method stub
		return transcationRepository.findAll();
	}

	@Override
	public Transcation gettranscationid(Long id) {
		// TODO Auto-generated method stub
		return transcationRepository.findById(id).orElseThrow(()->
		new NoSuchElementException("transcation data not found"+id));
	}
	
	@Override
	@Transactional
	public Transcation createtranscation(Transcation t) {
	    Long loanId = (long) t.getLoans().getLoanid();

        Loan existingLoan = loanRepository.findById(loanId)
                .orElseThrow(() -> new RuntimeException("Loan not found with ID: " + loanId));

	    t.setLoans(existingLoan);

	    return transcationRepository.save(t);
	}


}
