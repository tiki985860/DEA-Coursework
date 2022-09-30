/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaBeans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Praveen Thavendran
 */
public class connectdb {
    private static connectdb cdb = new connectdb();
    
    public static Statement Db()
    {
        Statement st = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");     
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/phoenixairs","root", "");
            st = con.createStatement();
            }
       catch(ClassNotFoundException | SQLException ex){
           System.out.println("Error: "+ex);}
        return st;
        
    }
}
