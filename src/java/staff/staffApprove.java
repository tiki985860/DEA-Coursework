package staff;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Praveen Thavendran
 */
public class staffApprove {
    public void staffapprovalshow()
    {
        ResultSet rs=null;
        Statement st = connectdb.Db();
        try{
            String sql= "select * from staffapproval";
            rs = st.executeQuery(sql);
            while(rs.next())
            {
                
            }
        }catch(Exception e){System.out.println(e);}
        
    }
    public static void adminApprove(String uName)
    {
        ResultSet rs=null, rs2=null;
        String un=null,pass=null,typ = null,name=null;
        int empid = 0;
        Statement st = connectdb.Db();//,st2=connectdb.Db();
        
        //select data from staffapproval and send to useraccounts table
        try{
            String sql= "select * from staffapproval where Username = '"+uName+"' ";
            rs = st.executeQuery(sql);
            while(rs.next())
            {
                un = rs.getString("Username");
                pass = rs.getString("Password");
                typ = rs.getString("grade");
                empid = rs.getInt("empId");
                name = rs.getString("name");
            }
            String sql2= "Insert into userAccounts (Username, PasswordEncrypted, UserType) values ('"+un+"','"+pass+"','"+typ+"')"; 
            st.executeUpdate(sql2);
            }catch(Exception e){System.out.println(e);}
            
            //select user id from useraccounts and insert into staff table
            String sql3 = "select * from useraccounts where username = '"+uName+"' ";
            try
            {
                int userId=0;
                rs2 = st.executeQuery(sql3);
                while(rs2.next())
                    {userId = rs2.getInt("UserId");}
                String sql2 = "insert into staff values('"+userId+"','"+typ+"','"+empid+"','"+name+"')";
                st.executeUpdate(sql2);
            }catch(Exception e){System.out.println("Error:"+e);}  
            
            //delete the staff entry at staffapproval table
            String sql4 = "delete from staffapproval where Username = '"+uName+"'";
            try{
                st.executeUpdate(sql4);
            }catch(Exception e){System.out.println("Error: "+e);}
    }
}
