package com.shri.sevice;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.shri.entity.User;
import com.shri.repo.UserRepo;

@Service
public class UserService {
	
	private UserRepo userRepo;
	public UserService(UserRepo userRepo)
	{
		this.userRepo=userRepo;
	}
	
	public User save(User user)
	{
	return 	userRepo.save(user);
		
		
	}
	public Optional<User> byId(int id)
	{    
		return userRepo.findById(id);
	}
	
	public List<User> byAll()
	{
		 return userRepo.getAllUsers();
		
	}
	public void delete(int id)
	{
		userRepo.deleteById(id);
		}
	
	public User update(Integer id, User user)
	{
		User exist=userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
		exist.setFname(user.getFname());
		exist.setLname(user.getLname());
		exist.setEmail(user.getEmail());
		exist.setSalary(user.getSalary());
		return userRepo.save(exist);
	}

	
	public User email(String email)
	{
		return userRepo.findByEmail(email);
	}
	public List<User> nameByAll(String fname,String lname)
	{
		return userRepo.findByFnameAndLname(fname,lname);
	}
	public long hii()
	{
		
		  return userRepo.count();
	}
	public List<User> sort()
	{
	return 	userRepo.sortBySalary();
	}



	    public boolean deleteUserById(Integer id) {
	        int rowsAffected = userRepo.deleteUser(id);
	        return rowsAffected > 0; // true if a user was deleted
	    }
	

}
