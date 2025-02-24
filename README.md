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

{
"id": 1,
"message": "Hello, Deepanshu!"
}

🔹 If ID does not exist:

{
"error": "Greeting not found!"
}

🎯 Key Benefits

✅ Allows modification of existing greeting messages

✅ Ensures data integrity in the repository

✅ Provides an easy way to update user messages

This ensures that your Greeting App now supports updating messages dynamically! 🚀