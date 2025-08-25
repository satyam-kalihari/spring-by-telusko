package com.telusko.demo_spring_security.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;

import com.telusko.demo_spring_security.model.User;
import com.telusko.demo_spring_security.service.UserService;

import jakarta.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/")
    public List<User> getAllUsers() {
        System.out.println("user controller is working");
        return service.getAllUsers();
    }

    @PostMapping("/")
    public User addUser(@RequestBody User user ){
        return service.addUser(user);
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        System.out.println("user csrf controller is working");
        return (CsrfToken) request.getAttribute("_csrf");
    }
    
}
