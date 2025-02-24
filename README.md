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