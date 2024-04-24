package com.personalproject.spellingbee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showForm(Model model) {
        return "wordForm";  // This will render the Thymeleaf template at src/main/resources/templates/wordForm.html
    }

    @GetMapping("/result")
    public String showResult(Model model) {
        // You can add model attributes to be used in the view
        model.addAttribute("message", "Type a word and submit to see the result.");
        return "resultPage";  // This will render another view, for example after form submission
    }
}