import java.sql.*;
import java.util.Scanner;

public class DepartmentQues {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load the MySQL JDBC driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish a connection to the MySQL database
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DepartmentDB?useSSL=false","root","root");

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter department details
        System.out.print("Enter Department ID: ");
        String dptID = sc.next();
        System.out.print("Enter Department Name: ");
        String dptName = sc.next();
        System.out.print("Enter Department Location: ");
        String dptLocation = sc.next();

        // Prepare a PreparedStatement to insert department details into the database
        PreparedStatement ps = conn.prepareStatement("INSERT INTO department VALUES (?, ?, ?)");
        ps.setString(1, dptID);
        ps.setString(2, dptName);
        ps.setString(3, dptLocation);

        // Execute the INSERT query and get the number of records inserted
        int recordInserted = ps.executeUpdate();

        // Check if records were successfully inserted
        if(recordInserted > 0){
            System.out.println("New Record Inserted.");
        }else{
            System.out.println("Failed to insert the new record.");
        }
    }
}
