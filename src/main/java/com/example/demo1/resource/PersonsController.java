package com.example.demo1.resource;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonsController {



    @GetMapping("/get-all")
    public String getAll() throws InterruptedException {
        return "hello";
    }

    @GetMapping("/test")
    public String getHello() throws InterruptedException {
        return "welcome devops training6";
    }

}
