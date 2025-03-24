package com.example.Spring_Boot_Rest.repo;

import com.example.Spring_Boot_Rest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
