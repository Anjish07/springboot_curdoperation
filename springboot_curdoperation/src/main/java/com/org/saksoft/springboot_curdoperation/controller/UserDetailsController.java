package com.org.saksoft.springboot_curdoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.saksoft.springboot_curdoperation.entities.UserDetails;
import com.org.saksoft.springboot_curdoperation.service.UserDetailsService;

@RestController
public class UserDetailsController {
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@RequestMapping("/userDetails")
	public List <UserDetails> getAllUserDetails(){
		
		return userDetailsService.getAllUserDetails();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/userDetails")
	public void addUserDetails(@RequestBody UserDetails userDetails) {
		
		userDetailsService.addUserDetails(userDetails);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/userDetails/{id}")
	public void updateUserDetails(@PathVariable int Id, @RequestBody UserDetails userDetails) {
		
		userDetailsService.updateUserDetails(Id, userDetails);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/userDetails/{id}")
	public void deleteUserDetails(@PathVariable int Id) {
		
		userDetailsService.deleteUserDetails(Id);
	}
}
