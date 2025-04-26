package com.springboot.jobapp.model;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor

public class JobPost {

    private int PostID;
    private String PostProfile;
    private String PostDesc;
    private int ReqExperience;
    private List<String> PostTechStack;
    

    
}
