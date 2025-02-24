package greetingapp.spring_greeting_app.dto;

public class GreetingDTO {
    private String message;

    // Constructors
    public GreetingDTO() {
    }

    public GreetingDTO(String message) {
        this.message = message;
    }

    // Getter & Setter
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
