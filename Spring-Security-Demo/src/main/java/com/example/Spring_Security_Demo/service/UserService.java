package com.example.Spring_Security_Demo.service;

import com.example.Spring_Security_Demo.dao.UserRepo;
import com.example.Spring_Security_Demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public User saveUser(User user){
        return repo.save(user);
    }
}
