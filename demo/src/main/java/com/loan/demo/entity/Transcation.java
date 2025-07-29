package com.loan.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
public class Transcation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long tid;
	private String time;
	private String tmsg;
	@ManyToOne
	@JoinColumn(name = "loanid")
	private Loan loans;
	
	public Transcation() {
		
	}

	public Long getTid() {
		return tid;
	}

	public void setTid(Long tid) {
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

	public Loan getLoans() {
		return loans;
	}

	public void setLoans(Loan loans) {
		this.loans = loans;
	}

	@Override
	public String toString() {
		return "Transcation [tid=" + tid + ", time=" + time + ", tmsg=" + tmsg + ", loans=" + loans + "]";
	}

	public Transcation(Long tid, String time, String tmsg, Loan loans) {
		this.tid = tid;
		this.time = time;
		this.tmsg = tmsg;
		this.loans = loans;
	}
	
	
}