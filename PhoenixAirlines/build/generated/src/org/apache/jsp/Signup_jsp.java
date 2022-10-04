package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Sign Up</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/signup1.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <script src=\"JS/signup1.js\"></script>\n");
      out.write("    <div class=\"form-modal\">\n");
      out.write("    \n");
      out.write("        <div class=\"form-toggle\">\n");
      out.write("            <button id=\"staff-toggle\" onclick=\"toggleStaff()\">STAFF SIGN UP</button>\n");
      out.write("            <button id=\"user-toggle\" onclick=\"toggleUser()\">USER SIGN UP</button>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("        <div id=\"staff-form\">\n");
      out.write("            <form action = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/signupServlet\" method=\"Post\">\n");
      out.write("                <p style = 'color:red;'> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                <input type=\"text\" name = \"username\" placeholder=\"Enter username\"/>\n");
      out.write("                <input type=\"password\" name = \"password\" placeholder=\"Create password\"/>\n");
      out.write("                <select id=\"usertype\" name=\"usertype\" required>\n");
      out.write("                    <option value=\"null\">Select User Type</option>\n");
      out.write("                    <option value=\"st1\">Staff 1</option>\n");
      out.write("                    <option value=\"st2\">Staff 2</option>\n");
      out.write("                </select>\n");
      out.write("                <input type=\"text\" name = \"eid\" placeholder=\"Enter Employee ID\"/>\n");
      out.write("                <input type=\"text\" name= \"name\" placeholder=\"Enter your Name\"/>                \n");
      out.write("                <button type=\"submit\" class=\"btn signup\">create account</button>\n");
      out.write("                <p>Clicking <strong>create account</strong> means that you are agree to our <a href=\"javascript:void(0)\">terms of services</a>.</p>\n");
      out.write("    \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("        <div id=\"user-form\">\n");
      out.write("            <form action = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/signupServlet\" method=\"Post\">\n");
      out.write("                <p style = 'color:red;'> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                <input type=\"text\" name = \"username\" placeholder=\"Enter username\"/>\n");
      out.write("                <input type=\"password\" name = \"password\" placeholder=\"Create password\"/>\n");
      out.write("                <input type=\"text\" name=\"usertype\" value=\"Customer\" readonly=\"readonly\" />\n");
      out.write("                <button type=\"submit\" class=\"btn signup\">create account</button>\n");
      out.write("                <p>Clicking <strong>create account</strong> means that you are agree to our <a href=\"javascript:void(0)\">terms of services</a>.</p>\n");
      out.write("                <hr/>\n");
      out.write("               \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("</body>\n");
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
