package com.loan.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int custid;
	private String fname;
	private String lname;
	private String addhar;
	private String username;
	private String password;
	private String conformpassword;
	private String email;

	
	
	public Boolean login(String providedUsername, String providedpassword) {
		return this.username.equals(providedUsername)&&this.password.equals(providedpassword);
		
	}
	
	
}
