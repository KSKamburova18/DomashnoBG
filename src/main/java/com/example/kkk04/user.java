package com.example.kkk04;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class user {

    @GetMapping("/about")
    public String info(){
        return "Красияна";
    }
}
