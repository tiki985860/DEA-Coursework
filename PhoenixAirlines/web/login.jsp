<%-- 
    Document   : login
    Created on : Oct 1, 2022, 8:55:28 AM
    Author     : Praveen Thavendran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Animated Login Page</title>
        <link rel="stylesheet" href="css/style.css" />
    </head>
    <body>
       <div class="box">
            <div class="form">
               <h2>Login</h2>
               <form action = "${pageContext.request.contextPath}/loginServlet" method="Post">
                <div class = "inputBox">
                    <input type="text" name ="username" required="required">
                    <span>Username</span>
                <i></i>
                </div>
                <div class = "inputBox">
                    <input type="password" name = "pass" required="required">
                    <span>password</span>
                <i></i>
                </div>
                <div class="links">
                    <a href='#'>Forgot Password</a>
                    <a href='#'>Sign up</a>
                </div>
                <input type="submit" value="Login">
                
                
               </form>
                <br>
                <p style = 'color:red;'> ${loginError}</p>
            </div>
        </div>
    
    </body>
</html>

       

