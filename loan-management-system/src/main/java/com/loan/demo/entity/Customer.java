package com.loan.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int custid;

    private String fname;
    private String lname;
    private String addhar;
    @Column(unique = true)
    private String username;
    private String password;
    private String conformpassword;
    private String email;

    // Getters and Setters

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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


	
	
	public Boolean login(String providedUsername, String providedpassword) {
		return this.username.equals(providedUsername)&&this.password.equals(providedpassword);
		
	}
	
	
}
