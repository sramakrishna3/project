package com.loan.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class transcation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int tid;
	private String time;
	private String tmsg;
	@ManyToOne
	@JoinColumn(name = "loanid")
	private loan loans;
	
}