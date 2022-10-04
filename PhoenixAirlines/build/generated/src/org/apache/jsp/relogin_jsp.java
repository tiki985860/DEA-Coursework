package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class relogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Animated Login Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div class=\"box\">\n");
      out.write("            <div class=\"form\">\n");
      out.write("               <h2>Login</h2>\n");
      out.write("               \n");
      out.write("               <form action = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/loginServlet\" method=\"Post\">\n");
      out.write("                <div class = \"inputBox\">\n");
      out.write("                    <input type=\"text\" name =\"username\" required=\"required\">\n");
      out.write("                    <span>Username</span>\n");
      out.write("                <i></i>\n");
      out.write("                </div>\n");
      out.write("                <div class = \"inputBox\">\n");
      out.write("                    <input type=\"password\" name = \"pass\" required=\"required\">\n");
      out.write("                    <span>password</span>\n");
      out.write("                <i></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"links\">\n");
      out.write("                    <a href='#'>Forgot Password</a>\n");
      out.write("                    <a href='#'>Sign up</a>\n");
      out.write("                </div>\n");
      out.write("                <input type=\"submit\" value=\"Login\">\n");
      out.write("               </form>\n");
      out.write("                <br>\n");
      out.write("                <span style =\"color:red\">");
 
                  String msg = (String)(request.getAttribute("msg"));
                  out.println(msg); 
                
      out.write("</span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("       \n");
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
