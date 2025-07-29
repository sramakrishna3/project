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

import com.loan.demo.entity.Transcation;
import com.loan.demo.serviceimpl.Transcationserviceimpl;

@RestController
@RequestMapping("transcation")
public class Transcationcontroller {

	@Autowired
	private Transcationserviceimpl tsil;
	
	@PostMapping("save")
	public Transcation addtranscation(@RequestBody Transcation t){
		return tsil.createtranscation(t);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Transcation> getbytranscid(@PathVariable Long id){
		Transcation trans=tsil.gettranscationid(id);
		return new ResponseEntity<>(trans,HttpStatus.OK);	
	}
	
	
	
}
