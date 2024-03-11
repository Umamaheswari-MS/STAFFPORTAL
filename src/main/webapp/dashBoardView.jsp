<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Staff Profile</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            display: flex;
            justify-content: space-between;
            padding: 20px;
            background: linear-gradient(to right, #3498db, #2ecc71);
            color: #fff;
            margin: 0;
        }

        section {
            width: 45%;
            padding: 20px;
            background-color: rgba(255, 255, 255, 0.9);
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 5px;
        }

        h1, h2 {
            color: #333;
        }

        p {
            margin-bottom: 10px;
        }

        textarea, input {
            width: 100%;
            padding: 10px;
            box-sizing: border-box;
        }

        button {
            padding: 10px;
            background-color: #fff;
            color: #333;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        button:hover {
            background-color: #ecf0f1;
        }
    </style>
</head>
<body>

    <section>
        <h1>Contact Details</h1>
        <!-- Editable contact details -->
        <label for="email">Email:</label>
        <input type="text" id="email" value="${staffEmail}">
        
        <label for="phone">Phone:</label>
        <input type="text" id="phone" value="${staffPhone}">
        
        <label for="office">Office:</label>
        <input type="text" id="office" value="${staffOffice}">
        <button onclick="saveContactDetails()">Save Contact Details</button>
    </section>

    <section>
        <h1>Staff Information</h1>
        <!-- Display staff information -->
        <p><strong>Full Name:</strong> ${staffFullName}</p>
        <p><strong>Department:</strong> ${staffDepartment}</p>
        <p><strong>Designation:</strong> ${staffDesignation}</p>
        <p><strong>Qualification:</strong> ${staffQualification}</p>
        <p><strong>Area of Expertise:</strong> ${staffExpertise}</p>
        <p><strong>Experience:</strong> ${staffExperience}</p>

        <h2>Brief Bio</h2>
        <textarea id="bio" rows="6">${staffBio}</textarea>
        <button onclick="saveBio()">Save Bio</button>
        
        <h2>Availability</h2>
        <textarea id="availability" rows="3">${staffAvailability}</textarea>
        <button onclick="saveAvailability()">Save Availability</button>
    </section>

    <script>
        function saveContactDetails() {
            var email = document.getElementById("email").value;
            var phone = document.getElementById("phone").value;
            var office = document.getElementById("office").value;
            
            // Send an AJAX request or perform any necessary logic to save the contact details to the server
            alert("Contact details saved:\nEmail: " + email + "\nPhone: " + phone + "\nOffice: " + office);
        }

        function saveBio() {
            var bioText = document.getElementById("bio").value;
            // Send an AJAX request or perform any necessary logic to save the bio to the server
            alert("Bio saved: " + bioText);
        }

        function saveAvailability() {
            var availabilityText = document.getElementById("availability").value;
            // Send an AJAX request or perform any necessary logic to save the availability to the server
            alert("Availability saved: " + availabilityText);
        }
    </script>

</body>
</html>
