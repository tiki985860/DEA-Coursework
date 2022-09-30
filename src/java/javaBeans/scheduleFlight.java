package javaBeans;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.time.*;
/**
 *
 * @author Praveen Thavendran
 */
public class scheduleFlight {
    
    public void schedule(String date, int flightid, String depart, String dest,int ticketrate)
    {
        Statement st = connectdb.Db();
        ResultSet res;
        int cols = 0, rows = 0;
        String sql = "INSERT INTO tblflightschedule (FlightId, departure, destination, ticketrate, date) VALUES ('"+flightid+"','"+depart+"','"+dest+"','"+ticketrate+"', '"+date+"')";
        String sql2 = "select * from tbleairplanedetails where AirpId = '"+flightid+"'";
        try{
            st.executeUpdate(sql);
            res = st.executeQuery(sql2);
            while(res.next())
            {
                rows = res.getInt("RowCount");
                cols = res.getInt("ColumnCount");
            }
        }catch(Exception e){System.out.println("Error: "+e);}
        
        seats s = new seats();
        
        s.createSeats(rows, cols, flightid, date);
    }
    
    public ResultSet displaySchedule()
    {
        ResultSet rs = null;
        String sql = "Select * from tblflightschedule";
        try{
            rs = connectdb.Db().executeQuery(sql);
            
        }catch(Exception e){System.out.println(e);}
        return rs;
    }
    public void deleteSchedule(int id)
    {
        Statement st = connectdb.Db();
        String sql = "Delete FROM tblflightschedule WHERE ScheduledId = '"+id+"' ";
        try{
            st.executeUpdate(sql);
        }catch(Exception e ){System.out.println(e);}
    }
    
    
} 
