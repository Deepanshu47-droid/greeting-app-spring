package greetingapp.spring_greeting_app.controller;


import greetingapp.spring_greeting_app.dto.GreetingDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    private GreetingDTO greeting = new GreetingDTO("Hello, Welcome to Spring Boot!");

    // ✅ GET API - Fetch the greeting message
    @GetMapping
    public GreetingDTO getGreeting() {

        return greeting;
    }

    // ✅ POST API - Set a new greeting message
    @PostMapping
    public String setGreeting(@RequestBody GreetingDTO newGreeting) {
        greeting.setMessage(newGreeting.getMessage());
        return "✅ Greeting updated successfully!";
    }

    // ✅ PUT API - Update the greeting message
    @PutMapping
    public String updateGreeting(@RequestBody GreetingDTO updatedGreeting) {
        greeting.setMessage(updatedGreeting.getMessage());
        return "✅ Greeting modified successfully!";
    }

    // ✅ DELETE API - Reset the greeting to default
    @DeleteMapping
    public String deleteGreeting() {
        greeting.setMessage("Hello, Welcome to Spring Boot!");
        return "✅ Greeting reset to default!";
    }
}
