package com.example.kkk04;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class contact {

    @GetMapping("/contact")
    public String info(){
        return "KSKamburova18";
    }
}