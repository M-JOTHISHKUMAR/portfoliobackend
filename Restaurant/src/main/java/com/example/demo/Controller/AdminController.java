package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Servic;
import com.example.demo.model.Admin;
@RestController
@CrossOrigin
public class AdminController {
	@Autowired
	Servic ser;
	
	@PostMapping("/addDetails") 
	public Admin addinfo(@RequestBody Admin st)
	{
		return ser.saveDetails(st);
	}
	@GetMapping("/showDetails")
	public List<Admin> fetchDetails()
	{
		return ser.getDetails();
	}
	@PutMapping("/updateDetails")
		public Admin updateInfo(@RequestBody Admin st)
		{
			return ser.updateDetails(st);
		}
	@DeleteMapping("/deleteDetails/{username}")
	 String deleteInfo(@PathVariable("username") String username){
		ser.deleteDetails(username);
		return "Deleted the data";
	}
//	
}