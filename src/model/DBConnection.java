package model;


import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    private static Connection conn;

    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/hospital";
            conn = DriverManager.getConnection(url, "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static Statement getStatementConnection() {
        try {
            conn = getConnection();
            if (conn != null) {
                return conn.createStatement();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Close the connection
    public static void closeCon() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }
}







