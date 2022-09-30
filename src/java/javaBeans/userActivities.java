package javaBeans;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.sql.ResultSet;
/**
 *
 * @author Praveen Thavendran
 */
public class userActivities {
    
    public String getDateTime()
    {
        String d=null;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return d= dtf.format(now).toString();
        
    } 
    public void addActivity(String activity, int UserId, String IP)
    {
        String userType = null; 
        String time = getDateTime();
        String sql2 = "select * from useraccounts where UserId = '"+UserId+"'";
        try
        {
            ResultSet rs = connectdb.Db().executeQuery(sql2);
            while(rs.next())
            {
                userType = rs.getString("UserType");
            }
            String sql = "insert into useractvities values ('"+time+"','"+activity+"','"+UserId+"','"+userType+"','"+IP+"')";
            connectdb.Db().executeUpdate(sql);
        }catch(Exception e){System.out.println(e);}
    }
}
