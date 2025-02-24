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

