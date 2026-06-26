package com.shri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shri.enity.Passport;
import com.shri.enity.User;
import com.shri.Repo.UserRepo;

import java.util.Arrays;

@SpringBootApplication
public class OneToManyApplication implements CommandLineRunner {

    @Autowired
    private UserRepo userRepository;

    public static void main(String[] args) {
        SpringApplication.run(OneToManyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // Create User
        User user = new User();
        user.setId(1);
        user.setName("Rahul");

        // Create Passports
        Passport p1 = new Passport();
        p1.setId(101);
        p1.setNumber("P1234");
        p1.setUser(user);

        Passport p2 = new Passport();
        p2.setId(102);
        p2.setNumber("P5678");
        p2.setUser(user);

        // Attach passports to user
        user.setPassports(Arrays.asList(p1, p2));

        // Save user (passports auto-save due to cascade)
        userRepository.save(user);

        System.out.println("User with passports saved successfully!");
    }
}
