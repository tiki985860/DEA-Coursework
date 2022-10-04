package javaBeans;
import java.sql.ResultSet;
/**
 *
 * @author Praveen Thavendran
 */
public class loginVerify {
    public boolean verify(String uname, String pass)
    {
        String un = null, encpassword =null;
        String encpass = md5encryption.md5encrypt(pass);
        
        String sql = "select * from useraccounts where username = '"+uname+"' ";
        try{
            ResultSet rs = connectdb.Db().executeQuery(sql);
            while(rs.next()){
                un = rs.getString(2);
                encpassword = rs.getString(3);
            }
        }catch(Exception e){System.out.println("error"+e);}
        
        //validation
        if(uname.equals(un) && encpass.equals(encpassword)){
                return true;
        }
        return false; 
    
    }
    
}
