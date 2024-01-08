package com.loan.demo.serviceimpl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.demo.entity.transcation;
import com.loan.demo.entity.service.transcationservice;
import com.loan.demo.respository.transcationrepository;

@Service
public class transcationserviceimpl implements transcationservice {
	
	@Autowired
	private transcationrepository transcationRepository;

	@Override
	public List<transcation> getalltranscations() {
		// TODO Auto-generated method stub
		return transcationRepository.findAll();
	}

	@Override
	public transcation gettranscationid(Long id) {
		// TODO Auto-generated method stub
		return transcationRepository.findById(id).orElseThrow(()->
		new NoSuchElementException("transcation data not found"+id));
	}

	@Override
	public transcation createtranscation(transcation l) {
		// TODO Auto-generated method stub
		return transcationRepository.save(l);
	}

	
	
	

}
