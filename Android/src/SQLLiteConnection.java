import java.sql.*;
public class SQLLiteConnection {
    public static void main(String[] args) {
	        Connection conn = null;
	        try {
	            // Register the JDBC driver
	            Class.forName("org.sqlite.JDBC");
	            // Open a connection to the database
	            conn = DriverManager.getConnection("jdbc:sqlite:example.db");
	            System.out.println("Connection established successfully!");
	            // Perform database operations here...
	        } catch (ClassNotFoundException e) {
	            System.out.println("SQLite JDBC driver not found");
	        } catch (SQLException e) {
	            System.out.println("Connection failed: " + e.getMessage());
	        } finally {
	            if (conn != null) {
	                try {
	                    // Close the connection
	                    conn.close();
	                    System.out.println("Connection closed.");
	                } catch (SQLException e) {
	                    System.out.println("Error closing connection: " + e.getMessage());
	                }
	            }
	        }
	    }
	}


