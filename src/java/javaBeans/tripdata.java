package javaBeans;
import java.sql.*;

/**
 *
 * @author Praveen Thavendran
 */
public class tripdata {
   public void generateTripData(int sid,int serid, String date)
   {
        int aid =0;
        int pid=0; 
        
        ResultSet rs;
        //String sql = "insert into tripdata (passID, seatId, airId, serviceId, date) values ('"+pid+"','"+sid+"','"+aid+"', '"+serid+"','"+date+"')"; 
        String sql2 = "select * from tblseatdetails where SeatId = '"+sid+"'";
        
        try{
            
            rs = connectdb.Db().executeQuery(sql2);
            while(rs.next())
            {
                aid = rs.getInt("AirplaneId");
                pid = rs.getInt("PassengerId");
                System.out.println("air:"+aid);
            }
            connectdb.Db().executeUpdate("insert into tripdata (passID, seatId, airId, serviceId, date) values ('"+pid+"','"+sid+"','"+aid+"', '"+serid+"','"+date+"')"); 
        }
        catch(Exception e){System.out.println(e);}
   } 
}
