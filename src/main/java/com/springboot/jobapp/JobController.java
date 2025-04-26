package com.springboot.jobapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobController {

    @GetMapping("/")  // Maps to root URL: http://localhost:8080/
    public String home(){
        System.out.println("ki");
        return "home"; // Resolves to /WEB-INF/views/home.jsp
    }
}
