package bean;

/**
 *
 * @author pc
 */
    import java.sql.*;  
public class BuyerLoginDao {  
  
public static boolean validate(LoginBean bean){  
boolean status=false;  
try{  
Connection con=ConnectionProvider.getCon();  
              
PreparedStatement ps=con.prepareStatement(  
    "select * from buyer where phn=? and pass=?");  
  
ps.setString(1,bean.getPhn());  
ps.setString(2, bean.getPass());  
              
ResultSet rs=ps.executeQuery();  
status=rs.next();  
              
}catch(Exception e){}  
  
return status;  
  
}  
}  