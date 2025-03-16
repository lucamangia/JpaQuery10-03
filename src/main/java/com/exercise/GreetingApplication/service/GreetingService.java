package com.exercise.GreetingApplication.service;

import com.exercise.GreetingApplication.entity.Greeting;
import com.exercise.GreetingApplication.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    @Autowired
    private GreetingRepository greetingRepository;

    public Greeting getGreetingById(Long id) {
        return greetingRepository.findById(id).orElseThrow(() -> new RuntimeException("Greeting not found"));
    }
}