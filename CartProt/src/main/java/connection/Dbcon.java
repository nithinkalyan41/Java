package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbcon {
    private static Connection con = null;
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if(con==null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce_cart","root","oracle");

        }
        return con;
    }
}
