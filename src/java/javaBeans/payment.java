package javaBeans;
import java.sql.ResultSet;
/**
 *
 * @author Praveen Thavendran
 */
public class payment {
    public void newPayment(int scheduleid, int serviceCharge, String status)
    {   
        
        int ticket = 0;
        int tot = ticket + serviceCharge;
        String sql2 = "select * from tblflightschedule where ScheduledId = '"+scheduleid+"'";
        try{
            ResultSet rs = connectdb.Db().executeQuery(sql2);
            while(rs.next())
            {
                ticket = rs.getInt("ticketrate");
            }
            String sql = "insert into payments (TicketPrice,ServiceCharge, totalAmt,status) values ('"+ticket+"','"+serviceCharge+"', '"+tot+"','"+status+"')";
            connectdb.Db().executeUpdate(sql);
        }catch(Exception e){System.out.println("Ex:"+e);}
    }
    public int returnPayId(){
        int id = 0;
        return id;
    }
}
