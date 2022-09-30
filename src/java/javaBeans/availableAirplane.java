package javaBeans;
import java.sql.ResultSet;

public class availableAirplane {

    
    int airId, scheduleId, availableseats, ticketprice;
    String name;
    
    public int getAirId() {
        return airId;
    }
    
    public int getscheduleId() {
        return scheduleId;
    }

    public int getAvailableseats() {
        return availableseats;
    }

    public int getTicketprice() {
        return ticketprice;
    }

    public String getName() {
        return name;
    }
    
    public void findPrice_name()
    {
        String sql1 = "select * from tbleairplanedetails where AirpId = '"+getAirId()+"' ";
        String sql2 = "select * from tblflightschedule where ScheduledId = '"+getscheduleId()+"' ";
        ResultSet rs = null ,rs2 = null ;
        try{
            rs = connectdb.Db().executeQuery(sql1);
            while(rs.next()){
                name  = rs.getString(2);
            }
            rs2 = connectdb.Db().executeQuery(sql2);
            while(rs2.next()){
                ticketprice  = rs2.getInt(6);
            }
            
        }catch(Exception e){System.out.println("Error new: "+e);}
        
    }
    
}
