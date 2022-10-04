package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javaBeans.connectdb;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javaBeans.search;
import javaBeans.availableAirplane;

public final class searchflight_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Search trip</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <form action = \"#\" method=\"Post\">\n");
      out.write("            \n");
      out.write("            <select id=\"country\" name=\"departure\">\n");
      out.write("                <option>select departing country</option>\n");
      out.write("                <option value=\"AF\">Afghanistan</option>                \n");
      out.write("                <option value=\"AR\">Argentina</option>\n");
      out.write("                <option value=\"AM\">Armenia</option>\n");
      out.write("                \n");
      out.write("                <option value=\"AU\">Australia</option>\n");
      out.write("                \n");
      out.write("                <option value=\"BD\">Bangladesh</option>\n");
      out.write("                <option value=\"BE\">Belgium</option>\n");
      out.write("                <option value=\"BR\">Brazil</option>\n");
      out.write("                <option value=\"IO\">British Indian Ocean Territory</option>\n");
      out.write("                <option value=\"CA\">Canada</option>\n");
      out.write("                <option value=\"CV\">Cape Verde</option>\n");
      out.write("                <option value=\"CN\">China</option>\n");
      out.write("                <option value=\"CU\">Cuba</option>\n");
      out.write("                <option value=\"CW\">Curacao</option>\n");
      out.write("                <option value=\"DK\">Denmark</option>\n");
      out.write("                <option value=\"DJ\">Djibouti</option>\n");
      out.write("                <option value=\"EG\">Egypt</option>\n");
      out.write("                <option value=\"SV\">El Salvador</option>\n");
      out.write("                <option value=\"FJ\">Fiji</option>\n");
      out.write("                <option value=\"FI\">Finland</option>\n");
      out.write("                <option value=\"FR\">France</option>\n");
      out.write("                <option value=\"GF\">French Guiana</option>\n");
      out.write("                <option value=\"DE\">Germany</option>\n");
      out.write("                <option value=\"GH\">Ghana</option>\n");
      out.write("                <option value=\"HK\">Hong Kong</option>\n");
      out.write("                <option value=\"HU\">Hungary</option>\n");
      out.write("                <option value=\"IN\">India</option>\n");
      out.write("                <option value=\"ID\">Indonesia</option>\n");
      out.write("                <option value=\"IQ\">Iraq</option>\n");
      out.write("                <option value=\"IT\">Italy</option>\n");
      out.write("                <option value=\"JP\">Japan</option>\n");
      out.write("                <option value=\"JE\">Jersey</option>\n");
      out.write("                <option value=\"LV\">Latvia</option>\n");
      out.write("                <option value=\"LU\">Luxembourg</option>\n");
      out.write("                <option value=\"MO\">Macao</option>\n");
      out.write("                <option value=\"MY\">Malaysia</option>\n");
      out.write("                <option value=\"MV\">Maldives</option>\n");
      out.write("                <option value=\"MM\">Myanmar</option>\n");
      out.write("                <option value=\"NP\">Nepal</option>\n");
      out.write("                <option value=\"NL\">Netherlands</option>\n");
      out.write("                <option value=\"NZ\">New Zealand</option>\n");
      out.write("                <option value=\"PK\">Pakistan</option>\n");
      out.write("                <option value=\"PT\">Portugal</option>\n");
      out.write("                <option value=\"SC\">Seychelles</option>\n");
      out.write("                <option value=\"SL\">Sierra Leone</option>\n");
      out.write("                <option value=\"SG\">Singapore</option>\n");
      out.write("                <option value=\"ZA\">South Africa</option>\n");
      out.write("                <option value=\"GS\">South Georgia and the South Sandwich Islands</option>\n");
      out.write("                <option value=\"SS\">South Sudan</option>\n");
      out.write("                <option value=\"ES\">Spain</option>\n");
      out.write("                <option value=\"LK\">Sri Lanka</option>\n");
      out.write("                <option value=\"TH\">Thailand</option>\n");
      out.write("                <option value=\"TL\">Timor-Leste</option>\n");
      out.write("                <option value=\"TG\">Togo</option>\n");
      out.write("                <option value=\"TK\">Tokelau</option>\n");
      out.write("                <option value=\"TO\">Tonga</option>\n");
      out.write("                <option value=\"TT\">Trinidad and Tobago</option>\n");
      out.write("                <option value=\"TN\">Tunisia</option>\n");
      out.write("                <option value=\"TR\">Turkey</option>\n");
      out.write("                <option value=\"UK\">United Kingdom</option>\n");
      out.write("                <option value=\"US\">United States</option>\n");
      out.write("            </select>\n");
      out.write("            \n");
      out.write("            <select id=\"country\" name=\"destination\">\n");
      out.write("                <option>select departing country</option>\n");
      out.write("                <option value=\"AF\">Afghanistan</option>                \n");
      out.write("                <option value=\"AR\">Argentina</option>\n");
      out.write("                <option value=\"AM\">Armenia</option>\n");
      out.write("                \n");
      out.write("                <option value=\"AU\">Australia</option>\n");
      out.write("                \n");
      out.write("                <option value=\"BD\">Bangladesh</option>\n");
      out.write("                <option value=\"BE\">Belgium</option>\n");
      out.write("                <option value=\"BR\">Brazil</option>\n");
      out.write("                <option value=\"IO\">British Indian Ocean Territory</option>\n");
      out.write("                <option value=\"CA\">Canada</option>\n");
      out.write("                <option value=\"CV\">Cape Verde</option>\n");
      out.write("                <option value=\"CN\">China</option>\n");
      out.write("                <option value=\"CU\">Cuba</option>\n");
      out.write("                <option value=\"CW\">Curacao</option>\n");
      out.write("                <option value=\"DK\">Denmark</option>\n");
      out.write("                <option value=\"DJ\">Djibouti</option>\n");
      out.write("                <option value=\"EG\">Egypt</option>\n");
      out.write("                <option value=\"SV\">El Salvador</option>\n");
      out.write("                <option value=\"FJ\">Fiji</option>\n");
      out.write("                <option value=\"FI\">Finland</option>\n");
      out.write("                <option value=\"FR\">France</option>\n");
      out.write("                <option value=\"GF\">French Guiana</option>\n");
      out.write("                <option value=\"DE\">Germany</option>\n");
      out.write("                <option value=\"GH\">Ghana</option>\n");
      out.write("                <option value=\"HK\">Hong Kong</option>\n");
      out.write("                <option value=\"HU\">Hungary</option>\n");
      out.write("                <option value=\"IN\">India</option>\n");
      out.write("                <option value=\"ID\">Indonesia</option>\n");
      out.write("                <option value=\"IQ\">Iraq</option>\n");
      out.write("                <option value=\"IT\">Italy</option>\n");
      out.write("                <option value=\"JP\">Japan</option>\n");
      out.write("                <option value=\"JE\">Jersey</option>\n");
      out.write("                <option value=\"LV\">Latvia</option>\n");
      out.write("                <option value=\"LU\">Luxembourg</option>\n");
      out.write("                <option value=\"MO\">Macao</option>\n");
      out.write("                <option value=\"MY\">Malaysia</option>\n");
      out.write("                <option value=\"MV\">Maldives</option>\n");
      out.write("                <option value=\"MM\">Myanmar</option>\n");
      out.write("                <option value=\"NP\">Nepal</option>\n");
      out.write("                <option value=\"NL\">Netherlands</option>\n");
      out.write("                <option value=\"NZ\">New Zealand</option>\n");
      out.write("                <option value=\"PK\">Pakistan</option>\n");
      out.write("                <option value=\"PT\">Portugal</option>\n");
      out.write("                <option value=\"SC\">Seychelles</option>\n");
      out.write("                <option value=\"SL\">Sierra Leone</option>\n");
      out.write("                <option value=\"SG\">Singapore</option>\n");
      out.write("                <option value=\"ZA\">South Africa</option>\n");
      out.write("                <option value=\"GS\">South Georgia and the South Sandwich Islands</option>\n");
      out.write("                <option value=\"SS\">South Sudan</option>\n");
      out.write("                <option value=\"ES\">Spain</option>\n");
      out.write("                <option value=\"LK\">Sri Lanka</option>\n");
      out.write("                <option value=\"TH\">Thailand</option>\n");
      out.write("                <option value=\"TL\">Timor-Leste</option>\n");
      out.write("                <option value=\"TG\">Togo</option>\n");
      out.write("                <option value=\"TK\">Tokelau</option>\n");
      out.write("                <option value=\"TO\">Tonga</option>\n");
      out.write("                <option value=\"TT\">Trinidad and Tobago</option>\n");
      out.write("                <option value=\"TN\">Tunisia</option>\n");
      out.write("                <option value=\"TR\">Turkey</option>\n");
      out.write("                <option value=\"UK\">United Kingdom</option>\n");
      out.write("                <option value=\"US\">United States</option>\n");
      out.write("            </select>\n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <input id=\"depdate\" type =\"date\" name=\"departdate\"/>\n");
      out.write("            <input type=\"submit\" value=\"search flights\"/>\n");
      out.write("        </form>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Flight name</th>\n");
      out.write("                    <th>Fare</th>\n");
      out.write("                    <th>departure</th>\n");
      out.write("                    <th>destination</th>\n");
      out.write("                    \n");
      out.write("                    <th>Choose</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                \n");
      out.write("                ");
 
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
                    
      out.write("\n");
      out.write("            <form action = \"checkbox.jsp\">\n");
      out.write("                    <input type =\"hidden\" name=\"date\" value=\"");
      out.print( ddate );
      out.write("\" readonly=\"readonly\"  />\n");
      out.write("                    <input type=\"hidden\" name=\"airid\" value=\"");
      out.print( airid );
      out.write("\" readonly=\"readonly\" />\n");
      out.write("                    <td><input type=\"submit\" value=\"book seat\" /></td></tr>\n");
      out.write("            </form>\n");
      out.write("                    ");
    
                        out.println("</tr>");
                    }
                    }

                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
