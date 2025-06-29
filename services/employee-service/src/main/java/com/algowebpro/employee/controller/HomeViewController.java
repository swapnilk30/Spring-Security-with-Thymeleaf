package com.algowebpro.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeViewController {
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to our site!");
        return "home";
    }

}
