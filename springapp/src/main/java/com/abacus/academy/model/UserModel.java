package com.abacus.academy.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class UserModel {
	
	@Id
	@GeneratedValue
	private String email;

	private String password;
	
	private String userName;
	
	private String mobileNumber;
	
	private String role;
	
	@OneToMany(targetEntity = AdmissionModel.class, cascade = CascadeType.ALL)
	@JoinColumn(name="admissions_key",referencedColumnName="email")
	private List<AdmissionModel> admissions;
	
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	

	@Override
	public String toString() {
		return "UserModel [email=" + email + ", password=" + password + ", userName=" + userName + ", mobileNumber="
				+ mobileNumber + ", role=" + role + ", admissions=" + admissions + "]";
	}

	public List<AdmissionModel> getAdmissions() {
		return admissions;
	}

	public void setAdmissions(List<AdmissionModel> admissions) {
		this.admissions = admissions;
	}
	
	
	
}
