package com.abacus.academy.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usersTable")
public class LoginModel {
	
	@Id
	private String email;
	
	private String password;

	private String userRole;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return userRole;
	}

	public void setRole(String role) {
		this.userRole = role;
	}

	
	
	
}