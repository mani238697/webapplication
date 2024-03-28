package com.mani.web.controllers;

import com.mani.web.userspack.adduser;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller

public class Logincontroller {
    @GetMapping("/login")
    public String loginPage(Model model) {
        model.addAttribute("loginCredentials", new adduser());
        return "login"; // Return the name of the HTML template (without extension)
    }

    @PostMapping("/login")
    public String login(adduser adduser) {
        // Access login credentials using getters
        String username =adduser.getUsername();
        String password = adduser.getPassword();

        // Perform authentication logic here
        // For simplicity, let's assume valid credentials are "admin/admin"
        if (adduser.equals(username) && adduser.equals(password)) {
            // If credentials are valid, redirect to a success page
            return "redirect:success";
        } else {
            // If credentials are invalid, return to login page
            return "login";
        }
    }

    @GetMapping("/success")
    public String successPage() {
        return "success"; // Return the name of the HTML template for success page
    }
}

