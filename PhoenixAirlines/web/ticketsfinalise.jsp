<%-- 
    Document   : ticketsfinalise
    Created on : Oct 5, 2022, 11:26:58 PM
    Author     : Praveen Thavendran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function confirmation(){
            alert("Successfully booked ticket(s) check your mail!");
            location.href = 'index.html';
            }
        </script>
    </head>
    <body>
        <%
            int noofseats = (Integer)request.getAttribute("noofseats");
            int fare = (Integer)request.getAttribute("fare");
            int tot = fare* noofseats;
        %>
        <table>
            <tr>
                <td>Airplane Name: </td>
                <td><%=request.getAttribute("name")%></td>
            </tr>
            <tr>
                <td>No.of seats selected: </td>
                <td><%=noofseats%></td>
            </tr> 
            <tr>
                <td>Ticket rate: </td>
                <td><%=fare%></td>
            </tr>
            <tr>
                <td>Total: </td>
                <td><%=tot%></td>
            </tr> 
        </table>
        Thank you, you will receive an email containing payment procedures. You are required to complete the payment within 2 days.
        <button onclick="confirmation();"><a href = "#">Confirm and continue to home page</a></button>
    </body>
</html>
