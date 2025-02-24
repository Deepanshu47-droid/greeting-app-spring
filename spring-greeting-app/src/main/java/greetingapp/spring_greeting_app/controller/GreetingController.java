package greetingapp.spring_greeting_app.controller;


import greetingapp.spring_greeting_app.dto.GreetingDTO;
import greetingapp.spring_greeting_app.dto.UserDTO;
import greetingapp.spring_greeting_app.entity.GreetingEntity;
import greetingapp.spring_greeting_app.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    private GreetingDTO greeting = new GreetingDTO("Hello, Welcome to Spring Boot!");

    @Autowired
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    // GET API - Fetch the greeting message
    @GetMapping
    public GreetingDTO getGreeting() {
        return greeting;
    }

    // POST API - Set a new greeting message
    @PostMapping("/addUser")
    public GreetingEntity setGreeting(@RequestBody UserDTO newGreeting) {
        return greetingService.saveGreeting("Hello " + newGreeting.getFirstName() + " " + newGreeting.getLastName());
    }

    //  POST API - accept JSON and save greeting message
    @PostMapping("/add")
    public GreetingEntity saveGreeting(@RequestBody GreetingDTO greetingDTO) {
        return greetingService.saveGreeting(greetingDTO.getMessage());
    }

    // PUT API - Update the greeting message
    @PutMapping
    public String updateGreeting(@RequestBody GreetingDTO updatedGreeting) {
        greeting.setMessage(updatedGreeting.getMessage());
        return "✅ Greeting modified successfully!";
    }

    // DELETE API - Reset the greeting to default
    @DeleteMapping
    public String deleteGreeting() {
        greeting.setMessage("Hello, Welcome to Spring Boot!");
        return "✅ Greeting reset to default!";
    }
}
