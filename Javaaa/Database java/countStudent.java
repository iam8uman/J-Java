import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class countStudent{
    public static void main(String[] args)
    {
        try
        {
            String url="jdbc:mysql://localhost:3306/sumannn";   
            String uname="root";
            String password="";

            Class.forName("com.mysql.jdbc.Driver"); 
            Connection c=DriverManager.getConnection(url, uname, password);

            String query="Select count(*) from Alpha where name='SumanTheProgrammer'"  ;
            PreparedStatement stmt=c.prepareStatement(query); 

            ResultSet rs=stmt.executeQuery(query);

            rs.next();  
            System.out.println("NO of Student having name is SumanTheProgrammer="+rs.getInt(1));
            c.close();

        }catch(SQLException e)
        {
            System.out.print(e.getMessage());
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
}