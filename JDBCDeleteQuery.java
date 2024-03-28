import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDeleteQuery {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load the MySQL JDBC driver class
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            // Establish a connection to the MySQL database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SampleDB?useSSL=false", "root", "pswd@1234");

            // Prepare a PreparedStatement with the DELETE query
            PreparedStatement ps = conn.prepareStatement("DELETE from customers WHERE id = ?");

            // Set the value of the parameter in the prepared statement
            ps.setInt(1, 101);

            // Execute the DELETE query
            int query = ps.executeUpdate();

            // Check if any record was deleted
            if (query > 0) {
                System.out.println("Customer Record Deleted Successfully");
            } else {
                System.out.println("No Customer was found with the provided ID");
            }

            conn.close();
            ps.close();

        }catch(SQLException se){
            se.printStackTrace();
        }
    }
}