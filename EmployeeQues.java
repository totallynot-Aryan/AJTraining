import java.sql.*;

public class EmployeeQues {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load the MySQL JDBC driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish a connection to the MySQL database
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SampleDB?useSSL=false","root","pswd@1234");
        System.out.println(conn);

        // Create a Statement object for executing SQL queries using Statement Interface
        Statement stmt = conn.createStatement();

        // SQL query to create a table named Employee
        String createTable = "Create Table Employee(EID INT AUTO_INCREMENT PRIMARY KEY, NAME VARCHAR(100) NOT NULL, ADDRESS VARCHAR(150) NOT NULL, SALARY INT NOT NULL);";

        // Execute the SQL query to create the table
        stmt.executeQuery(createTable);

        // SQL query to check if Employee table exists or not.
        boolean isTableCreated = stmt.execute("SHOW TABLES LIKE 'Employee'");
        if (isTableCreated) {
            System.out.println("Table creation done successfully");
        } else {
            System.out.println("Table is not created");
        }

        // SQL query to insert values into the Employee table
        String valueTable = "INSERT INTO Employee VALUES" +
                "(101, 'Aryan', 'A16, New Delhi' , 5000000)," +
                "(102, 'Kuldeep', 'G17, Gurugram' , 4900000);";

        // Execute the SQL query to insert values into the table
        stmt.executeUpdate(valueTable);

        // SQL query to select all records from the Employee table
        String selectQuery = "SELECT * FROM Employee";

        // Execute the SQL query to select all records
        ResultSet rs = stmt.executeQuery(selectQuery);

        System.out.println();
        // Iterate over the result set and print each record
        while(rs.next()){
            int EID = rs.getInt("EID");
            String name = rs.getString("NAME");
            String address = rs.getString("ADDRESS");
            String salary = rs.getString("SALARY");

            System.out.println("Employee ID: "+ EID);
            System.out.println("Name: "+name);
            System.out.println("Address: "+address);
            System.out.println("Salary: "+salary);
            System.out.println("==========================");
        }

        // Close the ResultSet, Statement, and Connection objects
        rs.close();
        stmt.close();
        conn.close();
    }
}
