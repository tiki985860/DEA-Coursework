package javaBeans;
import java.sql.ResultSet;
import java.util.*;

public class search {
    
    public List<availableAirplane> searchAirplane(String from, String to, String date)
    {   
        int airpid=0, count = 0, totcount = 0;
        List<availableAirplane> availables = new ArrayList<availableAirplane>();
        
        String sql = "select * from tblflightschedule where departure = '"+from+"' && destination = '"+to+"' && date = '"+date+"'";
        try{
            ResultSet rs = connectdb.Db().executeQuery(sql);
            while(rs.next())
            {
                availableAirplane a = new availableAirplane();
                
                
                a.airId = rs.getInt(2);
                airpid = rs.getInt(2);
                a.scheduleId = rs.getInt(1);
                
                
                String sql2 = "select count(*) from tblseatdetails where occupancy = 0 && AirplaneId = '"+airpid+"' && date = '"+date+"' ";
                ResultSet rs2 = connectdb.Db().executeQuery(sql2);
                while(rs2.next()){a.availableseats = rs2.getInt(1);
                    count = rs2.getInt(1);
                }
                a.findPrice_name();
                availables.add(a);
                
                totcount += count;
            }
            
            System.out.println("Total available seats: "+totcount);
        }catch(Exception e){System.out.println(e);}
        
        return availables;   
    }
        
    public void displayflights(List<availableAirplane> k)
    {
        //availableAirplane a = new availableAirplane();
        for(availableAirplane a:k){
            System.out.println("Name: "+a.getName());
            System.out.println("Ticket price: "+a.getTicketprice());
            System.out.println("Available seats: "+a.getAvailableseats());
            System.out.println("\n");
        }
    
        
    }
    public ResultSet quickSearch(String from, String to, String date)
    {
      String sql = "select p.*,a.flightname from tblflightschedule as p left join tbleairplanedetails as a on p.flightid = a.airpid where date= '"+date+"' && departure = '"+from+"' && destination = '"+to+"'; ";
      ResultSet rs = null; 
              try{
                  rs = connectdb.Db().executeQuery(sql);
              }catch(Exception e){}
     return rs;
    }
    
}