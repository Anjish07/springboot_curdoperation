package com.org.saksoft.springboot_curdoperation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.saksoft.springboot_curdoperation.dao.UserRepository;
import com.org.saksoft.springboot_curdoperation.entities.UserDetails;

@Service
public class UserDetailsService {
	
	@Autowired
	public UserRepository userDetailsRepo;
	
	public List <UserDetails>getAllUserDetails(){
		
		List <UserDetails> userDetails =new ArrayList<>();
		userDetailsRepo.findAll().forEach(userDetails :: add);
		return userDetails;
		
	}
	
	public void addUserDetails(UserDetails userDetails) {
		
		userDetailsRepo.save(userDetails);
	}

	public void updateUserDetails(int id, UserDetails userDetails) {
		
		userDetailsRepo.save(userDetails);
	}

	public void deleteUserDetails(int id) {
		
		userDetailsRepo.deleteById(id);
		
	}
	

}
