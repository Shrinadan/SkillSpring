package com.chatbot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chatbot.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
}
