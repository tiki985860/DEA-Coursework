/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javaBeans.*;

/**
 *
 * @author Praveen Thavendran
 */
@WebServlet(name = "seatbookServlet", urlPatterns = {"/seatbookServlet"})
public class seatbookServlet extends HttpServlet {

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
            out.println("<title>Servlet seatbookServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet seatbookServlet at " + request.getContextPath() + "</h1>");
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
        
           //get booked seat details and insert into database
            PrintWriter out = response.getWriter();
            String bookedSeats[] = request.getParameterValues("seat");
            int airid = Integer.parseInt(request.getParameter("airid")); 
            String date = request.getParameter("date");
            int k;
            
            out.println(bookedSeats.length);
            for(int i=0; i<bookedSeats.length; i ++)
            {
               k= Integer.parseInt(bookedSeats[i]);
               try{
               connectdb.Db().executeUpdate("update seat set occupancy= '1' where seatno ='"+k+"' && airplaneid = '"+airid+"' && date = '"+date+"' ");  
               }catch(Exception e) {out.println(e);}
            }   
            
            response.sendRedirect("checkbox.jsp"); 
        
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
