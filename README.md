📌 UC1 - GreetingController with JSON Responses

This use case (UC1) involves implementing a GreetingController to return JSON responses for different HTTP methods. The API will handle GET, POST, PUT, and DELETE requests, and the responses will be in JSON format. Testing will be done using cURL.

📂 Project Structure

spring_greeting_app/

│── src/main/java/greetingapp/spring_greeting_app/

│ ├── controller/

│ │ ├── GreetingController.java

│ ├── dto/

│ │ ├── GreetingDTO.java

│ ├── SpringGreetingAppApplication.java

│── src/main/resources/

│ ├── application.properties

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
--------------------------------------------------------------------------------------------------------------------------------
🚀 UC2: Extend GreetingController with Service Layer

📌 Objective

🔹 Modify GreetingController to use a Service Layer for returning a simple greeting message: "Hello World".

⚙️ Implementation Steps

✅ Create GreetingService – A service class that generates the greeting message.

✅ Inject GreetingService into GreetingController using @Autowired.

✅ Modify GreetingController to call the service method instead of directly returning the message.

🔬 Testing Using cURL

📌 Run the following command:

curl -X GET http://localhost:8080/greeting

📌 Expected JSON Response: { "message": "Hello World" }

🛠 Why Use a Service Layer?

✅ Separation of concerns – Keeps business logic separate from the controller.

✅ Scalability – Easier to expand functionalities in the future.

✅ Reusability – Service methods can be reused across multiple controllers.
--------------------------------------------------------------------------------------------------------------------------------
🚀 UC3: Personalized Greeting Message with UserDTO (POST Request)

📌 Objective

🔹 Implement UserDTO to handle user data for generating a personalized greeting.

🔹 Update the POST request (/greeting) to accept UserDTO as input.

⚙️ Implementation Steps

✅ Create UserDTO with firstName and lastName attributes.

✅ Modify GreetingController to accept UserDTO in the request body.

✅ Generate a greeting message based on the provided attributes.

🔬 Testing Using cURL

📌 Full Name Greeting:

curl -X POST "http://localhost:8080/greeting" \

 -H "Content-Type: application/json" \

 -d '{"firstName": "Raj", "lastName": "Sharma"}'
📌 First Name Only:

curl -X POST "http://localhost:8080/greeting" \

 -H "Content-Type: application/json" \

 -d '{"firstName": "Raj"}'
📌 Last Name Only:

curl -X POST "http://localhost:8080/greeting" \

 -H "Content-Type: application/json" \

 -d '{"lastName": "Sharma"}'
📌 Default Greeting (No Name Provided):

curl -X POST "http://localhost:8080/greeting" \

 -H "Content-Type: application/json" \

 -d '{}'
🎯 Key Benefits

✅ Uses DTO for Better Data Handling

✅ More Organized and Reusable Code

✅ Easier Future Enhancements
--------------------------------------------------------------------------------------------------------------------------------
🚀 UC4: Storing Greeting Messages in the Database

📌 Objective

🔹 Implement a Greeting Repository to store greeting messages.

🔹 Save each generated greeting message in a MySQL database.

🔹 Retrieve stored messages through API calls.

🛠 Steps to Implement

✅ Add MySQL Dependency – Ensure required dependencies for database connectivity are included.

✅ Configure MySQL Database – Set up database properties like URL, username, and password in the application configuration.

✅ Create MySQL Database – Set up a new database to store greeting messages.

✅ Define GreetingEntity – Create an entity class representing stored messages.

✅ Implement GreetingRepository – Extend repository interface to interact with the database.

✅ Modify GreetingService – Ensure messages are stored before responding to API requests.

✅ Test the API – Use Postman or cURL to save and retrieve greeting messages.

🎯 Key Benefits

✅ Persistent Storage – Saves messages in MySQL for future access.

✅ Data Consistency – Ensures reliable message retrieval.

✅ Scalability – Supports efficient message management in larger applications.

Let me know if you need modifications! 🚀🔥
--------------------------------------------------------------------------------------------------------------------------------
🚀 UC5: Find Greeting Message by ID

🎯 Objective

Enable the application to retrieve a specific greeting message from the database using its unique ID.

🛠 Implementation Steps

✅ Step 1: Update Greeting Repository

Extend JpaRepository to include a method for fetching a greeting by its ID.

✅ Step 2: Modify Greeting Service

Implement a method to retrieve a greeting message by its ID.

Handle cases where the ID does not exist by returning a meaningful response.

✅ Step 3: Create API Endpoint in Controller

Define a GET API endpoint that accepts an ID as a path variable.

Call the service method to fetch and return the greeting message.

✅ Step 4: Test the API

🔹 Find Greeting Message by ID using cURL or Postman:

GET http://localhost:8080/greeting/find/{id}

🔹 Example Request:

curl -X GET "http://localhost:8080/greeting/find/1"

🔹 Expected Response (if found):➡️respective message for given id

🔹 Response if ID is not found: ➡️ "Greeting not found for ID: 1"

🎯 Key Benefits

✅ Enables retrieval of stored greetings

✅ Enhances API functionality and user interaction

✅ Handles invalid ID scenarios gracefully
--------------------------------------------------------------------------------------------------------------------------------
🚀 UC6: List All Greeting Messages

🎯 Objective

Enable the application to retrieve and display all stored greeting messages from the database.

🛠 Implementation Steps

✅ Step 1: Update Greeting Repository

Extend JpaRepository to provide built-in methods for fetching all records.

✅ Step 2: Modify Greeting Service

Implement a method to retrieve all greeting messages from the database.

Ensure it returns an empty list if no messages are found.

✅ Step 3: Create API Endpoint in Controller

Define a GET API endpoint that fetches all greetings.

Call the service method and return the list of messages.

✅ Step 4: Test the API

🔹 Fetch All Greeting Messages using cURL or Postman:

GET http://localhost:8080/greeting/find/all

🔹 Example Request:

curl -X GET "http://localhost:8080/greet/find/all"

🔹 Expected Example Response (if greetings exist):

[ { "id": 1, "message": "Hello, Deepanshu!" }, { "id": 2, "message": "Welcome to the Greeting App!" } ]

🔹 Response if no messages are found:

[]

🎯 Key Benefits

✅ Enables retrieval of all stored greetings

✅ Enhances API functionality and data visibility

✅ Handles empty database scenarios smoothly
----------------------------------------------------------------------------------------------------
📝 UC7: Edit a Greeting Message in the Repository

🎯 Objective

Enable the Greeting App to update an existing greeting message in the database using its ID.

🛠 Implementation Steps

✅ Step 1: Update the Greeting Repository

Extend JpaRepository to include a method for finding a greeting by ID.

✅ Step 2: Modify the Greeting Service

Implement a method to retrieve a greeting by ID.

Update the message if the greeting exists.

✅ Step 3: Create API Endpoint in Controller

Define a PUT API endpoint to edit an existing greeting.

Fetch the greeting by ID, update its message, and save it back.

🔗 API Endpoints

1️⃣ Edit a Greeting Message

🔹 Endpoint:

PUT http://localhost:8080/greeting/edit/{id}?newMessage=Hello, Updated!

🔹 Example Request:

curl -X PUT "http://localhost:8080/greeting/edit/1?newMessage=Hello, Deepanshu!"

🔹 Expected Response (if ID exists):

{ "id": 1, "message": "Hello, Deepanshu!" }

🔹 If ID does not exist:

{ "error": "Greeting not found!" }

🎯 Key Benefits

✅ Allows modification of existing greeting messages

✅ Ensures data integrity in the repository

✅ Provides an easy way to update user messages

This ensures that your Greeting App now supports updating messages dynamically! 🚀
----------------------------------------------------------------------------------------------------------------------
📝 UC8: Delete a Greeting Message from the Repository

🎯 Objective

Enable the Greeting App to delete an existing greeting message from the database using its ID.

🛠 Implementation Steps

✅ Step 1: Update the Greeting Repository

Extend JpaRepository to include a method for deleting a greeting by ID.

✅ Step 2: Modify the Greeting Service

Implement a method to find and delete a greeting by ID.

Handle cases where the greeting ID does not exist.

✅ Step 3: Create API Endpoint in Controller

Define a DELETE API endpoint to remove a greeting from the repository.

🔗 API Endpoints

1️⃣ Delete a Greeting Message

🔹 Endpoint:

DELETE http://localhost:8080/greeting/delete/{id}

🔹 Example Request:

curl -X DELETE "http://localhost:8080/greeting/delete/1"

🔹 Expected Response (if ID exists):

{
"message": "Greeting with ID 1 deleted successfully!"
}

🔹 If ID does not exist:

{
"error": "Greeting not found!"
}

🎯 Key Benefits

✅ Enables message deletion from the database

✅ Ensures proper resource management

✅ Handles invalid ID cases gracefully

