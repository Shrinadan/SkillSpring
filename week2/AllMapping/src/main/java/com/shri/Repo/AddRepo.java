package com.shri.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shri.Entity.Address;


public interface AddRepo extends JpaRepository<Address, Integer> {

}
