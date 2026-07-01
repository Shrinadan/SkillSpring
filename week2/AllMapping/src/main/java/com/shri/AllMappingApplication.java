package com.shri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shri.Entity.Address;
import com.shri.Entity.User;
import com.shri.Repo.UserRepository;


@SpringBootApplication
public class AllMappingApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(AllMappingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // Create Address
        Address address = new Address();
        address.setId(101);
        address.setVillage("Rampur");
        address.setDist("Patna");

        // Create User
        User user = new User();
        user.setId(1);
        user.setName("Rahul");
        user.setAddress(address);

        // Save user (address auto save due to cascade)
        userRepository.save(user);

        System.out.println("User and Address saved successfully!");
    }
}
