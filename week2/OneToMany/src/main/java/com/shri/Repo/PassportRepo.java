package com.shri.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shri.enity.Passport;

public interface PassportRepo extends JpaRepository<Passport, Integer> {
}
