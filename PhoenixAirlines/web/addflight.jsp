
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javaBeans.connectdb"%>
<%@page import="javaBeans.airplane"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function toggle()
            {
                document.getElementByID('add_flight').style.display = "block";
            }
        </script>
    </head>
    <body>
        <h1>Flights available and add new flights</h1>
        <h2>authority only for staff g2</h2>
        
        <table border="1">
            <thead>
                <tr>
                    <th>Airplane ID</th>
                    <th>Flight Name</th>
                    <th>no. of seat rows</th>
                    <th>no. of seat columns</th>
                    <th>Seat count</th>
                    <th>Created by</th>
                </tr>
            </thead>
            <tbody>
                
                    <%
                        String sql = "select * from tbleairplanedetails";
                        ResultSet rs = connectdb.Db().executeQuery(sql);
                        while(rs.next())
                        {
                         out.println("<tr><td>"+rs.getInt(1)+"</td>");  
                         out.println("<td>"+rs.getString(2)+"</td>");
                         out.println("<td>"+rs.getInt(3)+"</td>");
                         out.println("<td>"+rs.getInt(4)+"</td>");
                         out.println("<td>"+rs.getInt(5)+"</td>");
                         out.println("<td>"+rs.getInt(6)+"</td></tr>");
                        }
                    %>
                
                <tr id = "add_flight" style: display="none">
                    <td>hi</td>
                    <td>hi</td>
                    <td>hi</td>
                    <td>hi</td>
                    <td>hi</td>
                    <td>hi</td>
                </tr>
            </tbody>
        </table>
                <button onclick = "toggle();">Add flight</button>

    </body>
</html>
