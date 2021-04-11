package connectionClass;

import java.sql.*;

public class MainProgram {
    public static void main(String args[]) {
        ResultSet rst;
        PreparedStatement pst;
        String Query;
        Connection Conn = ConnectionClass.Connection_Method();
        if (Conn == null) {
            System.out.println("Error in Opening a Connection");
            System.exit(0);
        }
        Query = "select *from user";
        try {
            pst = Conn.prepareStatement(Query);
            rst = pst.executeQuery();
            while (rst.next()) {
                System.out.println(rst.getInt(1) + "\t" + rst.getString(2) + "\t" + rst.getString(3));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
