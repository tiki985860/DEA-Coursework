/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Praveen Thavendran
 */
@WebServlet(name = "signupServlet", urlPatterns = {"/signupServlet"})
public class signupServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet signupServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet signupServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String uname = request.getParameter("username");
        
        //out.println("Username"+uname);
        
        javaBeans.AllUsers user = new javaBeans.AllUsers();
        
        
        boolean check = user.usernameCheckup(uname);
        try{
           
        if(check)
        {
            String type = request.getParameter("usertype");
            String pass = request.getParameter("password");
            
            if(type.equals("Customer")){
               user.createUser(uname, pass, type);
               request.setAttribute("loginError","Signup successful. Enter credentials to continue ");
               RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request,response); 
            }
            else{
               String name = request.getParameter("name");
               int eid = Integer.parseInt(request.getParameter("eid"));
               user.staffSignup(uname, pass, name, eid, type);
               request.setAttribute("loginError","Signup request submitted. Please wait till you get approval.");
               RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
               rd.forward(request,response);
            }
        }
        else
        {
            request.setAttribute("message","Username Already taken!!");
            RequestDispatcher rd = request.getRequestDispatcher("Signup.jsp");
            rd.forward(request,response);
        }
        }catch(Exception e){out.println(e);}
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
