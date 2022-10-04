package javaBeans;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.List;
/**
 *
 * @author Praveen Thavendran
 */
public class testapp {
    
    
    
    public static void main(String Args[]){
       
       //AllUsers.adminSignup("AdminPadmini", "helloworld", "Padmini", 7845639);
       AllUsers user = new AllUsers();
       //user.createUser("Chainy", "abcd1234", "cust");
       //user.staffSignup("Yash111","praveen111","Yasho", 1266774, "st2");
       //user.addStaffbyAdmin("Desh112", "1234", "DeshmiyDev", 111938, "st2");
       //staffApprove stf = new staffApprove();
       //stf.adminApprove("Yash111");
       
       //airplane a = new airplane();
       //a.createAirplane(1001, "Wing 03", 3, 3, 1.0, 1029);
       //a.updateAirplane(1000,"Wing 02",5 , 4, 1.3, 1017);
       //a.updateAirplane(0, fName, 0, 0, 0, 0);
       //scheduleFlight a = new scheduleFlight();
       //Date d = new Date(2020/10/10);
       
       // a.deleteSchedule(1003); 
       //a.updateSchedule(1002, d, 1000, "UK", "SL", 20000);
       
       //seats s = new seats();
       //s.createSeats(4, 4, 999, "2020/10/10");
       
       //scheduleFlight k1 = new scheduleFlight();
       //k1.schedule("2022/10/12", 1000, "LK", "IN",30000 );
       //k1.schedule("2022/10/12", 1001, "LK", "UK", 25000);
       //k1.schedule("2022/10/13", 1001, "UK", "LK", 25000);
       //k1.schedule("2022/10/12", 999, "LK", "UK", 10000);
       
       //tripdata l = new tripdata();
       //l.generateTripData(166, 100, "2022/10/12");
       
       //service p = new service();
       //p.createService("Music", 500);
       //p.createService("Bevereges", 1000);
       
       //userActivities as = new userActivities();
       //as.addActivity("Delete plane", 1028,"asd:1234:567");
       
       //payment pay = new payment();
       //pay.newPayment(1007, 1000, "null");
       
       
       search k = new search();
       
                    String name;
                    int fare, seats;
                    
                    //String trip = "lk";
                    String dest = "uk";
                    String depart = "lk";
                    String ddate="2022/10/12";
                    String sql = "select p.*,a.flightname from tblflightschedule as p left join tbleairplanedetails as a on p.flightid = a.airpid where date= '"+ddate+"' && departure = '"+depart+"' && destination = '"+dest+"'; ";
                    ResultSet rs = null;  
                    try{
                        rs = connectdb.Db().executeQuery(sql); 
                    
                    if(rs == null){
                        System.out.println("<p> No Flights found!! Please try selecting another day! </p>");
                    }
                    else{ 
                      while(rs.next())
                    {
                        name = rs.getString(7);
                        fare = rs.getInt(6);
                        System.out.println("<tr><td>"+name+"</td>");
                        System.out.println("<td>"+fare+"</td>");
                        System.out.println("<td>"+depart+"</td>");
                        System.out.println("<td>"+dest+"</td></tr>");
                        
                    }
                    }
                    }catch(Exception e){}
       //passenger n = new passenger();
       //n.addPassenger("234567dfg", "Praveen", "Male", 789654435, 1017);
       //n.updatePass("234567dfg", "Desh", "Female",789654435 , 1017);
       //n.deletePass(7701);
       
       loginVerify lg = new loginVerify();
        //System.out.println(lg.verify("Chaini", "abcd1234"));
        AllUsers a = new AllUsers();
        
        /*if(a.adminSignup("Praveen", "12wre", "Devendran",1234)){
            System.out.println("added");
        }
        else{
            System.out.println("similar match");
        };
        
        */
        
        int p  = a.getUserId("praveen");
        //System.out.println(""+p);
        
    } 
}
