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

import com.loan.demo.entity.transcation;
import com.loan.demo.serviceimpl.transcationserviceimpl;

@RestController
@RequestMapping("transcation")
public class transcationcontroller {

	@Autowired
	private transcationserviceimpl tsil;
	
	@PostMapping("save")
	public transcation addtranscation(@RequestBody transcation t){
		return tsil.createtranscation(t);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<transcation> getbytranscid(@PathVariable Long id){
		transcation trans=tsil.gettranscationid(id);
		return new ResponseEntity<>(trans,HttpStatus.OK);
		
	}
	
}
