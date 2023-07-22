package com.example.final_project.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.final_project.Model.BookUser;
import com.example.final_project.Model.User;
import com.example.final_project.Service.bookService;
import com.example.final_project.Service.finalprojectService;



@Controller
public class finalprojectController {

    @Autowired
    finalprojectService finaldemo;

    @Autowired    //(properly injected into the controller.)
    bookService bookdemo;

    @GetMapping("/")
    public String homePage() {
        return "index";
    }

    @GetMapping("/book")
    public String book() {
        return "book";
    }

    @GetMapping("/booklogin")
    public String booklogin() {
        return "redirect:/login";
    }

    @PostMapping("/book")
    public String bookForm(@ModelAttribute BookUser bookuser) {
        bookdemo.BookSaveInfo(bookuser);
        return "redirect:/";
    }

    @GetMapping("/about")
    public String aboutPage() {
        return "about";
    }

    @GetMapping("/packages")
    public String packagesPage() {
        return "Packages";
    }

    @GetMapping("/services")
    public String servicesPage() {
        return "services";
    }

    @GetMapping("/signup")
    public String signuppage(@ModelAttribute User user, Model model) {
        model.addAttribute("registerRequest", user);
        return "Signup";
    }

    @PostMapping("/signup")
    public String signupFrom(@ModelAttribute User user) {
        System.out.println("register requ:" + user);
        User registeredUser = finaldemo.signUser(user.getUsername(), user.getEmail(), user.getPassword());
        return registeredUser == null ? "error_page" : "redirect:/login";

    }

    @GetMapping("/login")
    public String loginPage(@ModelAttribute User user, Model model) {
        model.addAttribute("loginRequest", user);
        return "login";
    }

    @PostMapping("/login")
    public String loginForm(@ModelAttribute User user, Model model) {
        System.out.println("login requ:" + user);
        User authenticated = finaldemo.authenticate(user.getUsername(), user.getPassword());
        if (authenticated != null) {
            model.addAttribute("userLogin", authenticated.getUsername());
            return "book";
        } else {
            return "error_page";
        }
    }

}
