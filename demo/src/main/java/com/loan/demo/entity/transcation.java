package com.loan.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class transcation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int tid;
	private String time;
	private String tmsg;
	@ManyToOne
	@JoinColumn(name = "loanid")
	private loan loans;
	@ManyToOne
	@JoinColumn(name = "cusid")
	private customer custloan;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTmsg() {
		return tmsg;
	}
	public void setTmsg(String tmsg) {
		this.tmsg = tmsg;
	}
	public loan getLoans() {
		return loans;
	}
	public void setLoans(loan loans) {
		this.loans = loans;
	}
	public customer getCustloan() {
		return custloan;
	}
	public void setCustloan(customer custloan) {
		this.custloan = custloan;
	}
	public transcation(int tid, String time, String tmsg, loan loans, customer custloan) {
		super();
		this.tid = tid;
		this.time = time;
		this.tmsg = tmsg;
		this.loans = loans;
		this.custloan = custloan;
	}
	@Override
	public String toString() {
		return "transcation [tid=" + tid + ", time=" + time + ", tmsg=" + tmsg + ", loans=" + loans + ", custloan="
				+ custloan + "]";
	}
	public transcation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


}
