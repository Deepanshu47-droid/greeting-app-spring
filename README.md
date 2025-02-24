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

📌 Expected JSON Response:
{
"message": "Hello World"
}

🛠 Why Use a Service Layer?

✅ Separation of concerns – Keeps business logic separate from the controller.

✅ Scalability – Easier to expand functionalities in the future.

✅ Reusability – Service methods can be reused across multiple controllers.
