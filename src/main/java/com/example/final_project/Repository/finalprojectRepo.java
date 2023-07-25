package com.example.final_project.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.final_project.Model.User;


public interface finalprojectRepo extends JpaRepository<User, Integer>{
    Optional<User> findByUsernameAndPassword(String username, String password); //findByUsernameAndPassword method to handle user login functionality
    Optional<User> findFirstByUsername(String username);   //findFirstByUsername method to find a user by their username.
    
}


