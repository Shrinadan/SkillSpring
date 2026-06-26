package com.shri.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shri.enity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
}
