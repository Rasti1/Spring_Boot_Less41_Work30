package com.example.app.Spring_Boot_Less41_Work30.controller;

import com.example.app.Spring_Boot_Less41_Work30.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    ContactService contactService;

    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("contacts", contactService.getAllContacts());
        return "home";
    }
}
