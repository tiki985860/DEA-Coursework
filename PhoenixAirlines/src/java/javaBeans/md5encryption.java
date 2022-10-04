package javaBeans;
import java.math.BigInteger;
import java.security.MessageDigest;

/**
 *
 * @author Praveen Thavendran
 */
public class md5encryption {
    
    public static String md5encrypt(String pass){
        String hashword = null;
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
           md.update(pass.getBytes());
           BigInteger hash = new BigInteger(1,md.digest());
           hashword = hash.toString(16);
            }
        catch(Exception e){}
        return hashword;    
    }
}
