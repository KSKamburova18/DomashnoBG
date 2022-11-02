package com.example.kkk04;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {

    @GetMapping("/home")
    public String info(){
        return "Welcome user!";
    }
}
