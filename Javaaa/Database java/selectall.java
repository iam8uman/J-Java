import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.management.Query;
import javax.sql.StatementEvent;

public class selectall {
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver"); 

        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/sumannn", "root", "");    

        Statement s=c.createStatement();    
        String query="Select * from employee where salary>250000";  

        ResultSet rs=s.excuteQuery(query);  

        while(rs.next())
        {
            System.out.println(rs.getInt(1)+rs.getString(2));
        }
        c.close();

    }
}
