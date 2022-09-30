package javaBeans;
/**
 *
 * @author Praveen Thavendran
 */
public class passenger {
   public void addPassenger( String passportNo, String Name, String Gender, int tp, int UserID)
   {
        String sql = "insert into tblpassegerdetails (passportNo, Name, Gender, tp, UserId) values ('"+passportNo+"','"+Name+"','"+Gender+"','"+tp+"','"+UserID+"')"; 
        try{
            connectdb.Db().executeUpdate(sql);
        }catch(Exception e){System.out.println("Error: "+e);}
   } 
   
   public void deletePass(int passID){
       String sql = "delete from tblpassengerdetails where PassId = '"+passID+"' ";
       try{
            connectdb.Db().executeUpdate(sql);
        }catch(Exception e){System.out.println("Error: "+e);}
   }
   
   public void updatePass(String passportNo, String Name, String Gender, int tp, int UserID){
       String sql = "update tblpassengerdetails set passportNo = '"+passportNo+"', Name = '"+Name+"', Gender = '"+Gender+"', tp = '"+tp+"' where UserId = '"+UserID+"' ";
       try{
            connectdb.Db().executeUpdate(sql);
        }catch(Exception e){System.out.println("Error: "+e);}
   }
   
   
}
//