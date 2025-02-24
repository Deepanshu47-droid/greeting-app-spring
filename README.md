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
