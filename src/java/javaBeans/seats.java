package javaBeans;
import java.sql.*; 
/**
 * @author Praveen Thavendran
 */
public class seats { 
    Statement st; 
   
    
    public void createSeats(int row, int column, int airID, String date)
    {
        //connecttoDB();
        st = connectdb.Db();
        int seatno=1;
        try {
            for(int r = 0; r< row; r++)
                {
                    for(int c=0; c< column; c++)
                    { 
                        st.executeUpdate("insert into tblseatdetails (SeatNo,Occupancy,col,row,AirplaneId, date, paymentStat) values ('"+seatno+"','0','"+c+"','"+r+"','"+airID+"','"+date+"','null')");
                        seatno++;
                    }   
                }        
            } catch (SQLException ex) {
            System.out.println("Error: "+ex);
        }
    }
             
            
}
