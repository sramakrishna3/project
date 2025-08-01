package com.loan.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Login {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int lid;
	@Column(unique = true)
	private String username;
	private String password;

}
