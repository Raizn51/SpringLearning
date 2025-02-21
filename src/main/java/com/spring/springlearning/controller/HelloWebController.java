package com.spring.springlearning.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HelloWebController {

    // Mapping to display "Hello World" page
    @GetMapping("/web")
    public String hello() {
        return "hello"; // Refers to hello.html in templates folder
    }

    // Mapping to pass a custom message to the view
    @GetMapping("/web/message")
    public String message(Model model) {
        model.addAttribute("message", "This is a custom message");
        return "message"; // Refers to message.html in templates folder
    }
}
