package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.PrintWriter;
import javaBeans.*;

public final class checkbox_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        Select your seats: \n");
      out.write("        <form action = \"#\">\n");
      out.write("            <table border =\"0\">\n");
      out.write("                <tr>\n");
      out.write("            ");

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
            
      out.write("\n");
      out.write("                    <td><input type=\"checkbox\" name=\"seat\" value=\"");
      out.print(seatno);
      out.write('"');
      out.write(' ');
      out.print(disabled);
      out.write("/></td>\n");
      out.write("                   ");

                       seatno++;
                        }
                   out.println("</tr>");
                }
            
      out.write("\n");
      out.write("        <input type =\"hidden\" name=\"date\" value=\"");
      out.print( date );
      out.write("\" readonly=\"readonly\"  />\n");
      out.write("        <input type=\"hidden\" name=\"airid\" value=\"");
      out.print( airid );
      out.write("\" readonly=\"readonly\" />\n");
      out.write("            \n");
      out.write("        </table><input type =\"submit\" value=\"Submit\"/>\n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            \n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
