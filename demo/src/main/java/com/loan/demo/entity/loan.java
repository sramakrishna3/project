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
public class loan  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int loanid;
	private String loantype;
	private String loanemi;
	private String duration;
	@ManyToOne
	@JoinColumn(name = "cust_id")
	private customer cust;
		
}
