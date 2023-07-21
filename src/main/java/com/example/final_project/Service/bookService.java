package com.example.final_project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.final_project.Model.BookUser;
import com.example.final_project.Repository.bookRepo;

@Service
public class bookService {
    @Autowired
    bookRepo bookrepo;

    public void BookSaveInfo(BookUser bookuser){
        bookrepo.save(bookuser);
    }
}
