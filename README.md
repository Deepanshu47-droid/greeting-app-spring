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

[
    {
        "id": 1,
        "message": "Hello, Deepanshu!"
    },
    {
        "id": 2,
        "message": "Welcome to the Greeting App!"
    }
]

🔹 Response if no messages are found:

[]

🎯 Key Benefits

✅ Enables retrieval of all stored greetings

✅ Enhances API functionality and data visibility

✅ Handles empty database scenarios smoothly   