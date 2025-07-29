package com.loan.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Loan  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int loanid;
	private String loantype;
	private String loanemi;
	private String duration;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	public Loan() {
		
	}
	
	public int getLoanid() {
		return loanid;
	}
	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}
	public String getLoantype() {
		return loantype;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public String getLoanemi() {
		return loanemi;
	}
	public void setLoanemi(String loanemi) {
		this.loanemi = loanemi;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Loan [loanid=" + loanid + ", loantype=" + loantype + ", loanemi=" + loanemi + ", duration=" + duration
				+ ", customer=" + customer + "]";
	}
	public Loan(int loanid, String loantype, String loanemi, String duration, Customer customer) {
		this.loanid = loanid;
		this.loantype = loantype;
		this.loanemi = loanemi;
		this.duration = duration;
		this.customer = customer;
	}
	
	
		
}
