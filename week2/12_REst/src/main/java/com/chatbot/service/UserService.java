package com.chatbot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chatbot.entity.User;

public interface UserService {
	// save
	 User save(User user);
	 // getBy id
	User getBYid(Integer id);
	  // delete By id
	void delete(Integer id);
	//get all
	List<User> getall();
	// for update
	
   User update(User user, Integer id);
   
	
	
	
	
	
	

}
