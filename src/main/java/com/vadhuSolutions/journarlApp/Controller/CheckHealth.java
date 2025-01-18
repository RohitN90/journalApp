package com.vadhuSolutions.journarlApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckHealth {
    
    @GetMapping("/check-health")
    public String checkHealth(){
       return "OK";
    }
}
