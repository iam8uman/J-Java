import java.beans.Statement;
import java.io.IOError;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class displaydataDB {
    public static void main(String[]args)
    {
        try{
            String url="jdbc:mysql://localhost:3306/sumannn";

            String uname="root";    
            String password="abc";

            Class.forName("com.mysql.jdbc.Driver");

            Connection c=DriverManager.getConnection(url, uname, password);

            Statement stmt=c.createStatement(); 
             String query="Select * from Alpha where age>=35";

             ResultSet rs=stmt.executeQuery(query); 

             while(rs.next())
             {
                System.out.println("Name="+rs.getString(1));

                System.out.println("Roll="+rs.getInt(2));
                System.out.println("Age="+rs.getInt(3));
             }

             c.close();


        }catch(SQLException e)
        {

        }catch(IOException e)
        {

        }
    }
}
