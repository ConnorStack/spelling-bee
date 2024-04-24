package com.personalproject.spellingbee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController {
    @GetMapping("/home")
    public String showForm(Model model) {
        return "wordForm";  // This will render the Thymeleaf template at src/main/resources/templates/wordForm.html
    }
}
