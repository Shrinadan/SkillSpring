package com.chatbot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.chatbot.entity.User;
import com.chatbot.service.UserService;

@RestController

public class UserController {

    @Autowired
    private UserService userService;

    // ✅ CREATE USER
    @PostMapping("/save")
    public ResponseEntity<User> save(@RequestBody User user) {

        User savedUser = userService.save(user);
        return ResponseEntity.status(201).body(savedUser);
    }

    // ✅ GET USER BY ID
    @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable Integer id) {

        User user = userService.getBYid(id);
        return ResponseEntity.ok(user);
    }

    // ✅ GET ALL USERS
    @GetMapping("/all")
    public ResponseEntity<List<User>> getAll() {

        List<User> users = userService.getall();
        return ResponseEntity.ok(users);
    }

    // ✅ DELETE USER
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) {

        userService.delete(id);
        return ResponseEntity.ok("User deleted successfully");
    }

    // ✅ UPDATE USER
    @PutMapping("/{id}")
    public ResponseEntity<User> update(@RequestBody User user,
                                       @PathVariable Integer id) {

        User updatedUser = userService.update(user, id);
        return ResponseEntity.ok(updatedUser);
    }
}