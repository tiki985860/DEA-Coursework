package staff;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Praveen Thavendran
 */
public class testapp {
    public static void main(String Args[]){
       
       //AllUsers.adminSignup("AdminPadmini", "helloworld", "Padmini", 7845639);
       //AllUsers user = new AllUsers();
       //user.staffSignup("Yash111","praveen111","Yasho", 1266774, "st2");
       //user.addStaffbyAdmin("Desh112", "1234", "DeshmiyDev", 111938, "st2");
       //staffApprove stf = new staffApprove();
       //stf.adminApprove("Yash111");
       
       airplane a = new airplane();
       a.updateAirplane(1000,"Wing 02",5 , 4, 1.3, 1017);
       //a.updateAirplane(0, fName, 0, 0, 0, 0);
    }
}
