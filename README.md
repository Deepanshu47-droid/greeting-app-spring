📌 UC1 - GreetingController with JSON Responses

This use case (UC1) involves implementing a GreetingController to return JSON responses for different HTTP methods. The API will handle GET, POST, PUT, and DELETE requests, and the responses will be in JSON format. Testing will be done using cURL.


📂 Project Structure

spring_greeting_app/

│── src/main/java/greetingapp/spring_greeting_app/

│   ├── controller/

│   │   ├── GreetingController.java

│   ├── dto/

│   │   ├── GreetingDTO.java

│   ├── SpringGreetingAppApplication.java

│── src/main/resources/

│   ├── application.properties

│── pom.xml

🛠 Implementation Overview

1️⃣ Create a DTO Class

The GreetingDTO class will be created to define the structure of the JSON response.

It will contain a single field (message) along with getter and setter methods.

2️⃣ Implement GreetingController

The GreetingController will be created to handle HTTP requests.

It will contain endpoints for:

GET - Returning a default greeting message.

POST - Accepting a custom message from the user.

PUT - Updating the greeting message.

DELETE - Acknowledging the deletion of a greeting.

🔬 Testing using cURL

✅ GET Request - Fetch Default Greeting

Sends a GET request to retrieve a default greeting message.

✅ POST Request - Send Custom Greeting

Sends a POST request with a JSON payload to store a custom greeting message.

✅ PUT Request - Update Greeting

Sends a PUT request to modify the existing greeting message.

✅ DELETE Request - Delete Greeting

Sends a DELETE request to acknowledge the removal of the greeting.

🚀 Run the Application

To start the Spring Boot application, use:

mvn spring-boot:run
