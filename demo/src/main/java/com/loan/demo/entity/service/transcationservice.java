package com.loan.demo.entity.service;

import java.util.List;

import com.loan.demo.entity.transcation;

public interface transcationservice {
	
	List<transcation> getalltranscations();
	transcation gettranscationid(Long id);
	transcation createtranscation(transcation l);

}
