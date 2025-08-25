package com.telusko.demo_spring_security.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.demo_spring_security.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    User findByUsername(String username);

}
