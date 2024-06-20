package Unit2;

import java.sql.*; // Import all classes from the java.sql package

// Class to demonstrate JDBC operations
class JDBCExample {
    Connection conn; // Connection object to hold the database connection

    // Method to create a table in the database
    public void createTable() {
        try {
            // Step 1: Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Define connection parameters
            String url = "jdbc:mysql://localhost:3306/primebcasix";
            String susername = "root";
            String spassword = "";

            // Step 3: Establish the connection
            conn = DriverManager.getConnection(url, susername, spassword);

            // Check if the connection is successful
            if (conn != null) {
                System.out.println("Database connected");
            } else {
                System.out.println("Not connected");
            }

            // Step 4: Create a SQL query to create a table
            String tblQuery = "CREATE TABLE IF NOT EXISTS tbl_std ("
                    + "id INT PRIMARY KEY,"
                    + "name VARCHAR(50),"
                    + "gender VARCHAR(50),"
                    + "faculty VARCHAR(50),"
                    + "fee VARCHAR(50))";

            // Create a Statement object to execute the query
            Statement st = conn.createStatement();
            st.execute(tblQuery); // Execute the query
            System.out.println("Table created");

        } catch (ClassNotFoundException c) {
            // Handle the exception if the JDBC driver class is not found
            System.out.println("JDBC Driver not found: " + c);
        } catch (SQLException s) {
            // Handle SQL-related exceptions
            System.out.println("SQL Exception: " + s);
        } finally {
            // Step 5: Close the connection
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e);
            }
        }
    }

    // Method to insert data into the table
    public void insertData() {
        try {
            // Step 1: Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Define connection parameters
            String url = "jdbc:mysql://localhost:3306/primebcasix";
            String susername = "root";
            String spassword = "";

            // Step 3: Establish the connection
            conn = DriverManager.getConnection(url, susername, spassword);

            // Check if the connection is successful
            if (conn != null) {
                System.out.println("Database connected");
            } else {
                System.out.println("Not connected");
            }

            // Step 4: Create a SQL query to insert data
            String insQuery = "INSERT INTO tbl_std (id, name, gender, faculty, fee) VALUES (1, 'dipesh', 'male', 'bca', '69k')";

            // Create a Statement object to execute the query
            Statement st = conn.createStatement();
            int res = st.executeUpdate(insQuery); // Execute the query

            // Check if the record was inserted
            if (res > 0) {
                System.out.println(res + " row inserted");
            } else {
                System.out.println("No row inserted");
            }

        } catch (ClassNotFoundException c) {
            // Handle the exception if the JDBC driver class is not found
            System.out.println("JDBC Driver not found: " + c);
        } catch (SQLException s) {
            // Handle SQL-related exceptions
            System.out.println("SQL Exception: " + s);
        } 
        
    }
}

// Main class to run the JDBC example
public class JDBCDemo {
    public static void main(String[] args) {
        JDBCExample j = new JDBCExample(); // Create an instance of JDBCExample
        j.createTable(); // Call the method to create the table
        j.insertData(); // Call the method to insert data into the table
    }
}
