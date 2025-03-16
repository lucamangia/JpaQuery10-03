package com.exercise.GreetingApplication.controller;

import com.exercise.GreetingApplication.entity.Greeting;
import com.exercise.GreetingApplication.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v3/ciao")
public class GreetingController {
    @Autowired
    private GreetingService greetingService;

    @GetMapping("/{id}")
    public Greeting greet(@PathVariable Long id) {
        return greetingService.getGreetingById(id);
    }
}
