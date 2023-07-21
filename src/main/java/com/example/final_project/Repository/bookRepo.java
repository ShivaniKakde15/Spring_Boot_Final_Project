package com.example.final_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.final_project.Model.BookUser;

public interface bookRepo extends JpaRepository<BookUser, Integer> {
    
}
