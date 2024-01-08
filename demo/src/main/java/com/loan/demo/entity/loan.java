package com.loan.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
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
	public customer getCust() {
		return cust;
	}
	public void setCust(customer cust) {
		this.cust = cust;
	}
	public loan(int loanid, String loantype, String loanemi, String duration, customer cust) {
		super();
		this.loanid = loanid;
		this.loantype = loantype;
		this.loanemi = loanemi;
		this.duration = duration;
		this.cust = cust;
	}
	@Override
	public String toString() {
		return "loan [loanid=" + loanid + ", loantype=" + loantype + ", loanemi=" + loanemi + ", duration=" + duration
				+ ", cust=" + cust + "]";
	}
	public loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
