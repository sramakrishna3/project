package com.loan.demo.entity.service;

import java.util.List;

import com.loan.demo.entity.Transcation;

public interface Transcationservice {
	
	List<Transcation> getalltranscations();
	Transcation gettranscationid(Long id);
	Transcation createtranscation(Transcation l);

}
