package com.springboot.jobapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.springboot.jobapp.model.JobPost;

@Controller
public class JobController {

    @GetMapping({"/","home"})  // Maps to root URL: http://localhost:8080/
    public String home(){
        System.out.println("home comming");
        return "home"; 
    }
    @GetMapping("addjob")
    public String addjob(){
        return "addjob";
    }
    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){  //mention class and object name
        return "success";
    }

}
