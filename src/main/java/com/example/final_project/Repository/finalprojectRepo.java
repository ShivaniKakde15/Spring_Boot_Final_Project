package com.example.final_project.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.final_project.Model.User;


public interface finalprojectRepo extends JpaRepository<User, Integer>{
    Optional<User> findByUsernameAndPassword(String username, String password);
    Optional<User> findFirstByUsername(String username);
    
}


