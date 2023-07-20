package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="Admin")
@Entity
public class Admin {
@Id
@Column(name="Admin_id")
@GeneratedValue
private long Admin_id;
@Column(name="NAME")
private String name;
@Column(name="Password")
private String password;
private long mobilenumber;
private String email;
private String confirm_password;
public long getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(long mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getConfirm_password() {
	return confirm_password;
}
public void setConfirm_password(String confirm_password) {
	this.confirm_password = confirm_password;
}
public String getPassword() {
	return password;
}
public void setAdmin_id(long admin_id) {
	Admin_id = admin_id;
}
public long getAdmin_id() {

	return Admin_id;
}
public void setAdminid(long Admin_id) {
	this.Admin_id = Admin_id;
}
public String getName() {
	
	return name;
}
public void setName(String name) {
	this.name = name;
}


public String getPass() {
	return password ;
}
public void setPassword(String password) {
	this.password=password;
}
public Admin(long Admin_id,String name,String password) {
	super();
	this.Admin_id = Admin_id;
	this.name = name;
	this.password = password;
}
public Admin()
{
}
}

