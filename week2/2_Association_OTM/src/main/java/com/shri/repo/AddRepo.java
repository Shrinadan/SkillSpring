package com.shri.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shri.entity.Address;

public interface AddRepo extends JpaRepository<Address, Integer> {

}
