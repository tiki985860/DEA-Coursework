package staff;
import java.sql.*;
/**
 *
 * @author Praveen Thavendran
 */
public class airplane {
   Statement st = connectdb.Db();
   
   public void createAirplane(int airId, String fName, int rows, int cols, double busi, int userid)
   {
       int seatcount = rows*cols;
       String sql = "insert into tbleairplanedetails (AirpId, FlightName, RowCount, ColumnCount, seatCount, business_rate, createdUserId) VALUES ("
               + "'"+airId+"',"
               + " '"+fName+"',"
               + " '"+rows+"',"
               + " '"+cols+"', "
               + "'"+seatcount+"',"
               + " '"+busi+"',"
               + " '"+userid+"');";
       try{st.executeUpdate(sql);}
       catch(Exception e){System.out.println("Error: "+e);}
       
       //auto creates the relevant seats info
       seats s = new seats();
       s.createSeats(rows, cols, airId);
   }
   
   public void deleteAirplane(int airid)
   {
       String sql = "delete from tbleairplanedetails where AirpId = '"+airid+"'";
       try{st.executeUpdate(sql);}
       catch(Exception e){System.out.println("Error: "+e);}
   }
   public void updateAirplane(int airId, String fName, int rows, int cols, double buss, int userid)
   {
       int seatcount = rows*cols;
       String sql = "update tbleairplanedetails set FlightName = '"+fName+"', RowCount = '"+rows+"', ColumnCount = '"+cols+"',seatCount = '"+seatcount+"',business_rate = '"+buss+"', CreatedEmpId='"+userid+"' where airpId = '"+airId+"' ";
       try{st.executeUpdate(sql);}
       catch(Exception e){System.out.println("Error: "+e);}

}
}
    