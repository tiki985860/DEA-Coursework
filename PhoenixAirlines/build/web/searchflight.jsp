<%@page import="javaBeans.connectdb"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "javaBeans.search" %>
<%@page import= "javaBeans.availableAirplane" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Search trip</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        
        <form action = "#" method="Post">
            
            <select id="country" name="departure">
                <option>select departing country</option>
                <option value="AF">Afghanistan</option>                
                <option value="AR">Argentina</option>
                <option value="AM">Armenia</option>
                
                <option value="AU">Australia</option>
                
                <option value="BD">Bangladesh</option>
                <option value="BE">Belgium</option>
                <option value="BR">Brazil</option>
                <option value="IO">British Indian Ocean Territory</option>
                <option value="CA">Canada</option>
                <option value="CV">Cape Verde</option>
                <option value="CN">China</option>
                <option value="CU">Cuba</option>
                <option value="CW">Curacao</option>
                <option value="DK">Denmark</option>
                <option value="DJ">Djibouti</option>
                <option value="EG">Egypt</option>
                <option value="SV">El Salvador</option>
                <option value="FJ">Fiji</option>
                <option value="FI">Finland</option>
                <option value="FR">France</option>
                <option value="GF">French Guiana</option>
                <option value="DE">Germany</option>
                <option value="GH">Ghana</option>
                <option value="HK">Hong Kong</option>
                <option value="HU">Hungary</option>
                <option value="IN">India</option>
                <option value="ID">Indonesia</option>
                <option value="IQ">Iraq</option>
                <option value="IT">Italy</option>
                <option value="JP">Japan</option>
                <option value="JE">Jersey</option>
                <option value="LV">Latvia</option>
                <option value="LU">Luxembourg</option>
                <option value="MO">Macao</option>
                <option value="MY">Malaysia</option>
                <option value="MV">Maldives</option>
                <option value="MM">Myanmar</option>
                <option value="NP">Nepal</option>
                <option value="NL">Netherlands</option>
                <option value="NZ">New Zealand</option>
                <option value="PK">Pakistan</option>
                <option value="PT">Portugal</option>
                <option value="SC">Seychelles</option>
                <option value="SL">Sierra Leone</option>
                <option value="SG">Singapore</option>
                <option value="ZA">South Africa</option>
                <option value="GS">South Georgia and the South Sandwich Islands</option>
                <option value="SS">South Sudan</option>
                <option value="ES">Spain</option>
                <option value="LK">Sri Lanka</option>
                <option value="TH">Thailand</option>
                <option value="TL">Timor-Leste</option>
                <option value="TG">Togo</option>
                <option value="TK">Tokelau</option>
                <option value="TO">Tonga</option>
                <option value="TT">Trinidad and Tobago</option>
                <option value="TN">Tunisia</option>
                <option value="TR">Turkey</option>
                <option value="UK">United Kingdom</option>
                <option value="US">United States</option>
            </select>
            
            <select id="country" name="destination">
                <option>select departing country</option>
                <option value="AF">Afghanistan</option>                
                <option value="AR">Argentina</option>
                <option value="AM">Armenia</option>
                
                <option value="AU">Australia</option>
                
                <option value="BD">Bangladesh</option>
                <option value="BE">Belgium</option>
                <option value="BR">Brazil</option>
                <option value="IO">British Indian Ocean Territory</option>
                <option value="CA">Canada</option>
                <option value="CV">Cape Verde</option>
                <option value="CN">China</option>
                <option value="CU">Cuba</option>
                <option value="CW">Curacao</option>
                <option value="DK">Denmark</option>
                <option value="DJ">Djibouti</option>
                <option value="EG">Egypt</option>
                <option value="SV">El Salvador</option>
                <option value="FJ">Fiji</option>
                <option value="FI">Finland</option>
                <option value="FR">France</option>
                <option value="GF">French Guiana</option>
                <option value="DE">Germany</option>
                <option value="GH">Ghana</option>
                <option value="HK">Hong Kong</option>
                <option value="HU">Hungary</option>
                <option value="IN">India</option>
                <option value="ID">Indonesia</option>
                <option value="IQ">Iraq</option>
                <option value="IT">Italy</option>
                <option value="JP">Japan</option>
                <option value="JE">Jersey</option>
                <option value="LV">Latvia</option>
                <option value="LU">Luxembourg</option>
                <option value="MO">Macao</option>
                <option value="MY">Malaysia</option>
                <option value="MV">Maldives</option>
                <option value="MM">Myanmar</option>
                <option value="NP">Nepal</option>
                <option value="NL">Netherlands</option>
                <option value="NZ">New Zealand</option>
                <option value="PK">Pakistan</option>
                <option value="PT">Portugal</option>
                <option value="SC">Seychelles</option>
                <option value="SL">Sierra Leone</option>
                <option value="SG">Singapore</option>
                <option value="ZA">South Africa</option>
                <option value="GS">South Georgia and the South Sandwich Islands</option>
                <option value="SS">South Sudan</option>
                <option value="ES">Spain</option>
                <option value="LK">Sri Lanka</option>
                <option value="TH">Thailand</option>
                <option value="TL">Timor-Leste</option>
                <option value="TG">Togo</option>
                <option value="TK">Tokelau</option>
                <option value="TO">Tonga</option>
                <option value="TT">Trinidad and Tobago</option>
                <option value="TN">Tunisia</option>
                <option value="TR">Turkey</option>
                <option value="UK">United Kingdom</option>
                <option value="US">United States</option>
            </select>
            
            <br>
            <br>
            <input id="depdate" type ="date" name="departdate"/>
            <input type="submit" value="search flights"/>
        </form>
        <table border="1">
            <thead>
                <tr>
                    <th>Flight name</th>
                    <th>Fare</th>
                    <th>departure</th>
                    <th>destination</th>
                    
                    <th>Choose</th>
                </tr>
            </thead>
            <tbody>
                
                <% 
                    String name;
                    int fare,airid;
                    
                    String trip = request.getParameter("trip");
                    String dest = request.getParameter("destination");
                    String depart = request.getParameter("departure");
                    String ddate = request.getParameter("departdate");
                    
                    search k = new search();
                    String sql = "select p.*,a.flightname from tblflightschedule as p left join tbleairplanedetails as a on p.flightid = a.airpid where date= '"+ddate+"' && departure = '"+depart+"' && destination = '"+dest+"'; ";
                    ResultSet rs = null;  
                    try{
                        rs = connectdb.Db().executeQuery(sql); 
                    }catch(Exception e){}
                    if(rs == null){
                        out.println("<p> No Flights found!! Please try selecting another day! </p>");
                    }
                    else{ 
                      while(rs.next())
                    {
                        name = rs.getString(7);
                        fare = rs.getInt(6);
                        airid = rs.getInt(2); 
                        out.println("<tr><td>"+name+"</td>");
                        out.println("<td>"+fare+"</td>");
                        out.println("<td>"+depart+"</td>");
                        out.println("<td>"+dest+"</td>");
                    %>
            <form action = "checkbox.jsp">
                    <input type ="hidden" name="date" value="<%= ddate %>" readonly="readonly"  />
                    <input type="hidden" name="airid" value="<%= airid %>" readonly="readonly" />
                    <td><input type="submit" value="book seat" /></td></tr>
            </form>
                    <%    
                        out.println("</tr>");
                    }
                    }

                %>
            </tbody>
        </table>

        
    </body>
</html>

