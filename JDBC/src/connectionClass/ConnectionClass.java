package connectionClass;

import java.sql.*;

public class ConnectionClass {
    static Connection Connection_Method() {
        Connection Conn;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306" +
                    "/covoco_prod", "root", "root");
            return Conn;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
