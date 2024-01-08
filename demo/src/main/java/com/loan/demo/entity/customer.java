package com.loan.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int custid;
	private String fname;
	private String lname;
	private String addhar;
	private String password;
	private String conformpassword;
	private String email;
	
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddhar() {
		return addhar;
	}
	public void setAddhar(String addhar) {
		this.addhar = addhar;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConformpassword() {
		return conformpassword;
	}
	public void setConformpassword(String conformpassword) {
		this.conformpassword = conformpassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public customer(int custid, String fname, String lname, String addhar, String password, String conformpassword,
			String email) {
		super();
		this.custid = custid;
		this.fname = fname;
		this.lname = lname;
		this.addhar = addhar;
		this.password = password;
		this.conformpassword = conformpassword;
		this.email = email;
	}
	@Override
	public String toString() {
		return "customer [custid=" + custid + ", fname=" + fname + ", lname=" + lname + ", addhar=" + addhar
				+ ", password=" + password + ", conformpassword=" + conformpassword + ", email=" + email + "]";
	}
	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
	

}
