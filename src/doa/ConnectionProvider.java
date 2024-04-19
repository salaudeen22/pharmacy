package doa;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharamacy?useSSL=false", "root", "S@l@udeen2002");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
