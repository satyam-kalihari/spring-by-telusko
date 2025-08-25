package com.telusko.demo_spring_security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.telusko.demo_spring_security.model.User;
import com.telusko.demo_spring_security.repo.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepository;

    public List<User> getAllUsers() {
        System.out.println("user service is working");
        return userRepository.findAll();
    }

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
    public User addUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

}
