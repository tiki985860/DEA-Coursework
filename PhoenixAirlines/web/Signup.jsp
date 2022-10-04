<%-- 
    Document   : custSignup
    Created on : Oct 1, 2022, 8:23:20 PM
    Author     : Praveen Thavendran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up</title>
    <link rel="stylesheet" href="css/signup1.css">
</head>
<body>
    <script src="JS/signup1.js"></script>
    <div class="form-modal">
    
        <div class="form-toggle">
            <button id="staff-toggle" onclick="toggleStaff()">STAFF SIGN UP</button>
            <button id="user-toggle" onclick="toggleUser()">USER SIGN UP</button>
        </div>
    
        <div id="staff-form">
            <form action = "${pageContext.request.contextPath}/signupServlet" method="Post">
                <p style = 'color:red;'> ${message}</p>
                <input type="text" name = "username" placeholder="Enter username"/>
                <input type="password" name = "password" placeholder="Create password"/>
                <select id="usertype" name="usertype" required>
                    <option value="null">Select User Type</option>
                    <option value="st1">Staff 1</option>
                    <option value="st2">Staff 2</option>
                </select>
                <input type="text" name = "eid" placeholder="Enter Employee ID"/>
                <input type="text" name= "name" placeholder="Enter your Name"/>                
                <button type="submit" class="btn signup">create account</button>
                <p>Clicking <strong>create account</strong> means that you are agree to our <a href="javascript:void(0)">terms of services</a>.</p>
    
            </form>
        </div>
    
        <div id="user-form">
            <form action = "${pageContext.request.contextPath}/signupServlet" method="Post">
                <p style = 'color:red;'> ${message}</p>
                <input type="text" name = "username" placeholder="Enter username"/>
                <input type="password" name = "password" placeholder="Create password"/>
                <input type="text" name="usertype" value="Customer" readonly="readonly" />
                <button type="submit" class="btn signup">create account</button>
                <p>Clicking <strong>create account</strong> means that you are agree to our <a href="javascript:void(0)">terms of services</a>.</p>
                <hr/>
               
            </form>
        </div>
    
    </div>
    
</body>
</html>

