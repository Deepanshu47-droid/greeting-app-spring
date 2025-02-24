package greetingapp.spring_greeting_app.service;

import greetingapp.spring_greeting_app.entity.GreetingEntity;
import greetingapp.spring_greeting_app.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    //Method to create and save a greeting message
    public GreetingEntity saveGreeting(String message) {
        GreetingEntity greeting = new GreetingEntity(message);
        return greetingRepository.save(greeting);
    }
    public GreetingEntity findGreetingById(Long id) {
        return greetingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Greeting message not found!"));
    }

    // Method to fetch all greetings
    public List<GreetingEntity> getAllGreetings() {
        return greetingRepository.findAll();
    }
    // Method to update a greeting message
    public GreetingEntity updateGreeting(Long id, String newMessage) {
        Optional<GreetingEntity> optionalGreeting = greetingRepository.findById(id);
        if (optionalGreeting.isPresent()) {
            GreetingEntity greeting = optionalGreeting.get();
            greeting.setMessage(newMessage);
            return greetingRepository.save(greeting);
        }
        return null;
    }

    public String getGreetingMessage() {
        return "Hello World";
    }
}
