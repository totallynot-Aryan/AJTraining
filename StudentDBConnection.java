package StudentManagementDB;
import java.sql.Connection;
import java.sql.DriverManager;
public class StudentDBConnection {
    static Connection con;
    StudentDBConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_world?useSSL=false","root","root");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
