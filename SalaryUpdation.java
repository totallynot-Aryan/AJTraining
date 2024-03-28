import java.sql.*;

public class SalaryUpdation {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load the MySQL JDBC driver class
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            // Establish a connection to the MySQL database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB?useSSL=false","root","root");

            // Prepare a PreparedStatement with the UPDATE query
            PreparedStatement ps = conn.prepareStatement("UPDATE Employee SET salary= ? WHERE employee_id= ?;");

            // Set the values of the parameters in the prepared statement
            ps.setInt(1,500000); // Set the email value
            ps.setInt(2,1); // Set the id value

            // Execute the UPDATE query
            int query = ps.executeUpdate();

            // Check if any record was updated
            if(query > 0){
                System.out.println("Salary Updated Successfully");
            }else{
                System.out.println("No Employee was found with the provided ID");
            }

            conn.close();
            ps.close();

        }catch(SQLException se){
            se.printStackTrace();
        }
    }
}
