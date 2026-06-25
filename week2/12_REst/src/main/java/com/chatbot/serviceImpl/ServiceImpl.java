package com.chatbot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chatbot.entity.User;
import com.chatbot.repo.UserRepo;
import com.chatbot.service.UserService;



@Service
public class ServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User save(User user) {

        User user1 = userRepo.save(user);
        return user1;
    }

    @Override
    public User getBYid(Integer id) {

        User user = userRepo.findById(id).orElse(null);

        return user;
    }

    @Override
    public void delete(Integer id) {

        userRepo.deleteById(id);
    }

    @Override
    public List<User> getall() {

        List<User> users = userRepo.findAll();

        return users;
    }

    @Override
    public User update(User user, Integer id) {

        User oldUser = userRepo.findById(id).orElse(null);

        if (oldUser != null) {

            oldUser.setName(user.getName());
            oldUser.setRoll(user.getRoll());

            return userRepo.save(oldUser);
        }

        return null;
    }



}