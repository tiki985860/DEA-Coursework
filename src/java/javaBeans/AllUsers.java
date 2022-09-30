package javaBeans;
import java.sql.*;
/**
 *
 * @author Praveen Thavendran
 */
public class AllUsers {
       
    public void staffSignup(String Username, String pass, String name, int empId, String grade)
    {
     Statement st;
     String encpass = md5encryption.md5encrypt(pass);
     String sql = "insert into staffapproval values ('"+Username+"','"+encpass+"','"+grade+"','"+empId+"','"+name+"')";
     try{
         st=connectdb.Db();
         st.executeUpdate(sql);
     }
     catch(Exception e){System.out.println("Error: "+e);} 
    }
    
    //customer signup and all other user account details
    public void createUser(String uName, String pass, String uType)
    {
        Statement st;
        //encrypted password
        String encPass = md5encryption.md5encrypt(pass); 
        try
        {
            st = connectdb.Db();
            String sql = "insert into userAccounts (Username,PasswordEncrypted,UserType) values('"+uName+"','"+encPass+"','"+uType+"')"; 
            st.executeUpdate(sql);
        }
        catch(Exception e){}
    }
    
    public void adminSignup(String Username, String pass, String name, int empId)
    {
        String encPass = md5encryption.md5encrypt(pass);
        ResultSet rs;
        int userId = 0;
        
        //enter data straight to user accounts table
        createUser(Username,encPass,"admin");
        
        //fetch user id of admin and insert into admin details table
        Statement st = connectdb.Db();// st2 =connectdb.Db();
        String sql = "select * from useraccounts where username = '"+Username+"' ";
        try
        {
            rs = st.executeQuery(sql);
            while(rs.next())
            {userId = rs.getInt("UserId");                }
            String sql2 = "insert into admin (userId, name, employeeId) values('"+userId+"','"+name+"','"+empId+"')";
            st.executeUpdate(sql2);
        }catch(Exception e){System.out.println("Error:"+e);}  
    }
    
    public void addStaffbyAdmin(String Username, String pass, String name, int empId, String grade)
    {       
        staffSignup(Username, pass, name, empId,grade);
        //staffApprove stf = new staffApprove();
        //stf.adminApprove(Username); 
        staffApprove.adminApprove(Username);
    }
    
    public boolean checkUser(String username, String pass){
        String sql ="select * from useraccounts where username = '"+username+"' && password = '"+pass+"'";
        
        try{
            connectdb.Db().executeQuery(sql);
        }catch(Exception e)
        {
            return false;
        }
        return false;
        
    }
    
}
