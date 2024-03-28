import java.sql.*;

public class JDBCUpdateQuery {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load the MySQL JDBC driver class
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            // Establish a connection to the MySQL database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SampleDB?useSSL=false","root","pswd@1234");

            // Prepare a PreparedStatement with the UPDATE query
            PreparedStatement ps = conn.prepareStatement("UPDATE customers SET email = ? WHERE id = ?");

            // Set the values of the parameters in the prepared statement
            ps.setString(1,"abc@gmail.com"); // Set the email value
            ps.setInt(2,101); // Set the id value

            // Execute the UPDATE query
            int query = ps.executeUpdate();

            // Check if any record was updated
            if(query > 0){
                System.out.println("Values Updated Successfully");
            }else{
                System.out.println("No Customer was found with the provided ID");
            }

            conn.close();
            ps.close();

        }catch(SQLException se){
            se.printStackTrace();
        }
    }
}
