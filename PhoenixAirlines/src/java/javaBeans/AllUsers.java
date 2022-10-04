package javaBeans;
import java.sql.*;
/**
 *
 * @author Praveen Thavendran
 */
public class AllUsers {
    
    public boolean usernameCheckup(String uname){
        String un = null;
        String sql = "select * from useraccounts where username = '"+uname+"' ";
        try{
            ResultSet rs = connectdb.Db().executeQuery(sql);
            while(rs.next()){
                un = rs.getString(2);
            }
        }catch(Exception e){System.out.println("error"+e);}
        if(uname.equals(un)){
                return false;
        }
        return true;
    }
       
    public boolean staffSignup(String Username, String pass, String name, int empId, String grade)
    {
        if(usernameCheckup(Username)){
            System.out.println("hi");
            Statement st;
            String encpass = md5encryption.md5encrypt(pass);
            String sql = "insert into staffapproval values ('"+Username+"','"+encpass+"','"+grade+"','"+empId+"','"+name+"')";
            try{
                st=connectdb.Db();
                st.executeUpdate(sql);
            }
            catch(Exception e){System.out.println("Error: "+e);}
            return true;
               }
        return false;
    }
    
    //customer signup and all other user account details
    public boolean createUser(String uName, String pass, String uType)
    {
        if(usernameCheckup(uName)){
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
            return true;
        }
        return false;    
    
    }
    
    
    public boolean adminSignup(String Username, String pass, String name, int empId)
    {
        if(usernameCheckup(Username)){      
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
        
        return true;
        }
        return false;
    }
    
    public void addStaffbyAdmin(String Username, String pass, String name, int empId, String grade)
    {       
        staffSignup(Username, pass, name, empId,grade);
        staffApprove.adminApprove(Username);
    }
    
    public int getUserId(String un)
    {
        ResultSet rs;
        int userId=0; 
        Statement st = connectdb.Db();// st2 =connectdb.Db();
        String sql = "select * from useraccounts where username = '"+un+"' ";
        try
        {
            rs = st.executeQuery(sql);
            while(rs.next())
            {
                userId = rs.getInt("UserId");                
            }
            
        }catch(Exception e){System.out.println("Error:"+e);}        
      return userId;
    }
   
    
}
