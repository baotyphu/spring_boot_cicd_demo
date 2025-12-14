package com.example.demo1.resource;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonsController {


    // API get all
    @GetMapping("/get-all")
    public String getAll() throws InterruptedException {
        return "feature remote --- 1";
    }

    @GetMapping("/test")
    public String getHello() throws InterruptedException {
        return "welcome devops -baotyphu -134";
    }

}
