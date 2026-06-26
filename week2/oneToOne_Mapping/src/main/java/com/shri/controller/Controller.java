package com.shri.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shri.entity.User;
import com.shri.repo.UserRepo;
import com.shri.sevice.UserService;

@RestController
public class Controller {

    private final UserRepo userRepo;
	private UserService userService;
	public Controller(UserService userservice, UserRepo userRepo)
	{
		this.userService=userservice;
		this.userRepo = userRepo;
	}
	@PostMapping("/save")
	public User user(@RequestBody User user)
	
	{
		return  userService.save(user);
		
	}
	@GetMapping("/getId/{id}")
	public Optional<User> user(@PathVariable Integer id)
	{
		return userService.byId(id);
	}
	@GetMapping("/getAll")
	public List<User> user()
	{
		return userService.byAll();
	}
	@DeleteMapping("/delete/{id}")
	public String hii(@PathVariable Integer id)
	{
		userService.delete(id);
		return "delete success";
	}
	@PutMapping("/update/{id}")
	public User user(@PathVariable Integer id,@RequestBody User user)
	{
		return userService.update(id, user);
		
	}
	@GetMapping("/email/{email}")
	public User byEmail(@PathVariable String email)
	{
		return userService.email(email);
	}
	@GetMapping("/users/{fname}/{lname}")
	public List<User> findByName(@PathVariable String fname, @PathVariable String lname) {
	    return userService.nameByAll(fname, lname);
	}
	@GetMapping("/count")
	public long count()
	{
		return userService.hii();
	}
@GetMapping("/salary")
	public List<User> sortBy()
	{
	return userService.sort();
		
	}
@DeleteMapping("/dele/{id}")
public String delll(@PathVariable Integer id)
{
	userService.deleteUserById(id);
	return "ka hal ba delete";
}
}
