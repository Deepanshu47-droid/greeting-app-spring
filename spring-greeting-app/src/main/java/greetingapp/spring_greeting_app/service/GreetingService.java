package greetingapp.spring_greeting_app.service;

import greetingapp.spring_greeting_app.entity.GreetingEntity;
import greetingapp.spring_greeting_app.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    //Method to create and save a greeting message
    public GreetingEntity saveGreeting(String message) {
        GreetingEntity greeting = new GreetingEntity(message);
        return greetingRepository.save(greeting);
    }

    public String getGreetingMessage() {
        return "Hello World";
    }
}
