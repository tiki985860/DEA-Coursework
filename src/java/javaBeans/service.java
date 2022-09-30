package javaBeans;

/**
 *
 * @author Praveen Thavendran
 */
public class service {
    public void createService(String type, int charge)
    {
        String sql = "insert into tblservice (Service, serviceCharge) values ('"+type+"','"+charge+"')";
        try{
            connectdb.Db().executeUpdate(sql);
        }
        catch(Exception e){System.out.println(e);}
    }
}
