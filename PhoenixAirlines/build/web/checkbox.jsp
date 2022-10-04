<%@page import="java.sql.*"%>
<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "javaBeans.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Select your seats: 
        <form action = "seatbookServlet" method="post">
            <table border ="0">
                <tr>
            <%
                int airid = Integer.parseInt(request.getParameter("airid")); 
                String date = request.getParameter("date");
                int seatno=1; 
                String disabled="";
                int occupancy =0;
                out.println("<table border = 0>"+"<tr>");
                for(int x = 0; x<4; x++)
                {
                   for(int y =0;y<4;y++){
                    
                    //retreive seat occupany from database of relevant seat no  
                    ResultSet resultset = connectdb.Db().executeQuery("select occupancy from tblseatdetails where seatno = '"+seatno+"' && airplaneid = '"+airid+"' && date = '"+date+"'"); 
                    
                    out.println("<td>"+seatno+"</td>");
                    
                    while(resultset.next()){
                        occupancy = Integer.parseInt(resultset.getString(1));}
                    if(occupancy == 0)   
                        {disabled = "";}
                    else
                        {disabled = "disabled";} 
            %>
                    <td><input type="checkbox" name="seat" value="<%=seatno%>" <%=disabled%>/></td>
                   <%
                       seatno++;
                        }
                   out.println("</tr>");
                }
            %>
        <input type ="hidden" name="date" value="<%= date %>" readonly="readonly"  />
        <input type="hidden" name="airid" value="<%= airid %>" readonly="readonly" />
            
        </table><input type ="submit" value="Submit"/>
        
        </form>
        
        
            
       
    </body>
</html>
