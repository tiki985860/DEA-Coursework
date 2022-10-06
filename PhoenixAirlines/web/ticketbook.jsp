<!DOCTYPE html>
<html>

<head>

  <title> Book Ticket
  </title>

  <meta name="viewport" content="width=device-width, initial-scale=1">

  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

  <link rel="stylesheet" type="text/css" href="css/home.css">

  <link rel="stylesheet" href="css/footer.css">
  <!-- Fontawesome CDN Link -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"/>


</head>
<body>
<div clas="navigationMenu">
<div id="topnav" class="navbar" >

  <a href="index.html" class="logo">

    <span style="color: black">Phoenix</span>
    <span style="color: rgb(0, 225, 255)">Airlines</span>

  </a>
  <div class="navbar-right menu" >
    <a href="index.html">Home</a>
    <a href="#">Ticket Booking</a>
    <a href="#search_flights">Check Flights</a>
    <a href="#">Chat with us</a>
    <a href='#'>About</a>
    <a href="#">Help</a>
    <a href = "login.html">login</a>

  </div>
  <div class="navbar-right">
    <a href="javascript:void(0);" class="icon" onclick="showMenu()">

      <i class="fa fa-bars"></i>
</a>
  </div>
</div>
</div>
  <div class = "search" id="search">
    <center><h1>Book ticket </h1></center>
    <div class= "search_flights" id = "search_flights">
      <h2 style = "color:white">Search your flights</h2>
      <br>
      <form action = "searchflight.jsp" method="Post">
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
              <option>select destination</option>
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
          &emsp; Select departing date: <input id="depdate" type ="date" name="departdate"/>
          &emsp;
          <input id = "submit" type="submit" value="search flights"/>
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
                  <input type="hidden" name="name" value="<%= name %>" readonly="readonly" />
                  <input type="hidden" name="fare" value="<%= fare %>" readonly="readonly" />
                  <td><input type="submit" value="book seat" /></td></tr>
          </form>
                  <%
                      out.println("</tr>");
                  }
                  }

              %>
          </tbody>
      </table>

    </div>
  </div>
  <footer>

    <div class="content">

      <div class="top">

        <div class="logo-details">
          <i class="fab fa-slack"></i>
          <span class="logo_name">Phoenix Airlines</span>
        </div>

        <div class="media-icons">
          <a href="#"><i class="fab fa-facebook-f"></i></a>
          <a href="#"><i class="fab fa-twitter"></i></a>
          <a href="#"><i class="fab fa-instagram"></i></a>
          <a href="#"><i class="fab fa-linkedin-in"></i></a>
          <a href="#"><i class="fab fa-youtube"></i></a>
        </div>

      </div>

      <div class="link-boxes">

        <ul class="box">
          <li class="link_name">About Us</li>
          <li><a href="#">About Phoenix Airlines</a></li>
          <li><a href="#">Right to Information Act</a></li>
          <li><a href="#">Tender & GSA notices</a></li>
          <li><a href="#">Advertise with us</a></li>
          <li><a href="#">Phoenix Tourism</a></li>
          <li><a href="#">Media Center</a></li>
          <li><a href="#">Careers</a></li>
        </ul>

        <ul class="box">
          <li class="link_name">Help</li>
          <li><a href="#">24 Hours Contact Center</a></li>
          <li><a href="#">Online Chat Support</a></li>
          <li><a href="#">FAQs</a></li>
        </ul>

        <ul class="box">
          <li class="link_name">Services</li>
          <li><a href="#">MICE</a></li>
          <li><a href="#">Cargo</a></li>
          <li><a href="#">Training</a></li>
          <li><a href="#">Ground Handling</a></li>
          <li><a href="#">Phoenix Holidays</a></li>
          <li><a href="#">Phoenix Catering</a></li>
          <li><a href="#">Phoenix Air Taxi</a></li>
        </ul>

        <ul class="box">
          <li class="link_name">Terms & Conditions</li>
          <li><a href="#">Online Booking Terms of use</a></li>
          <li><a href="#">Conditions of carriage</a></li>
          <li><a href="#">Notices for Travel Agents</a></li>
          <li><a href="#">Permission Center</a></li>
          <li><a href="#">Service Fees at Ticket Office</a></li>
        </ul>

        <ul class="box input-box">
          <li class="link_name">Subscribe</li>
          <li><input type="text" placeholder="Enter your email"></li>
          <li><input type="text" placeholder="Select Departure City"></li>
          <li><input type="button" value="Subscribe"></li>
        </ul>

      </div>

    </div>

    <div class="bottom-details">

      <div class="bottom_text">

        <span class="copyright_text">Copyright © 2022 <a href="#">Phoenix Airlines.</a>All rights reserved</span>
        <span class="policy_terms">
          <a href="#">Privacy policy</a>
          <a href="#">Terms & condition</a>
        </span>

      </div>

    </div>

  </footer>
</body>
