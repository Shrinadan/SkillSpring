package com.shri.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shri.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
