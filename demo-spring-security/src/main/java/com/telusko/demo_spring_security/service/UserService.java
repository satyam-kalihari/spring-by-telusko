package com.telusko.demo_spring_security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.telusko.demo_spring_security.model.User;
import com.telusko.demo_spring_security.repo.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepository;

    @Autowired
    private JWTService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
    public User addUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

     public String verify(User user){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

        if(authentication.isAuthenticated()){
            return jwtService.generateToken(user.getUsername());
        }

        return  "failed";
     }

}
