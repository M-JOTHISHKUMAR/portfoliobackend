package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Database.AdminRepo;
import com.example.demo.model.Admin;



@Service
public class Servic {
	@Autowired(required=true)
	AdminRepo Re;
	public Admin saveDetails(Admin e)
	{
		return Re.save(e);
	}
	public List<Admin> getDetails(){
		return Re.findAll();
	} 
	public Admin updateDetails(Admin e) {
		return Re.saveAndFlush(e);
	}
	public void deleteDetails(String username) {
		Re.deleteById(username);
		
	}
}