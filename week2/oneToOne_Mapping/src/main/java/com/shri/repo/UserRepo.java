package com.shri.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.shri.entity.User;

import jakarta.transaction.Transactional;

import java.util.List;


public interface UserRepo extends JpaRepository<User, Integer>{

// select*from user wehere email='shri@gmail.com';
	//User findByEmail(String email);
      //SELECT * FROM users WHERE fname = ? AND lname = ?;

	List<User> findByFnameAndLname(String fname, String lname);

	@Query("select u from User u")
	List<User> getAllUsers();
	// u is object in jpql to take in same sa field name
	@Query("select u from User u where u.email = email")
	
	User findByEmail(@Param("email") String email);
//
	@Query("select u from User u where u.fname = :fname and u.lname = :lname")
	List<User> findByName(@Param("fname") String fname,
	                      @Param("lname") String lname);

	@Query("select u from User u where u.fname like %:name%")
	List<User> searchByName(@Param("name") String name);
	
	//sacending by salary
	@Query("select u from User u order by u.salary desc")
	List<User> sortBySalary();
	
	@Query("select count(u) from User u")
	Integer totalUsers();
@Query("select u from User u order by u.salary ")
List<User> sortByAsc();

//max min for
@Query("select max(u.salary) from User u")
String getMaxSalary();
// request param
@Modifying
@Transactional
@Query("update User u set u.salary = :salary where u.id = :id")
int updateSalary(@Param("salary") String salary,
                 @Param("id") Integer id);

// dlete
@Modifying
@Transactional
@Query("delete from User u where u.id = :id")
int deleteUser(@Param("id") Integer id);

@Query(value = "SELECT * FROM user WHERE email = :email", nativeQuery = true)
User getUserByEmail(@Param("email") String email);


}
