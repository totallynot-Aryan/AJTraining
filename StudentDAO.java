package StudentManagementDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static StudentManagementDB.StudentDBConnection.con;

public class StudentDAO {
    public boolean addStudent(Student std) throws SQLException {
        String query = "INSERT INTO StudentDetails (name, email, phoneno) VALUES(?,?,?);";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1,std.getName());
        ps.setString(2,std.getEmail());
        ps.setString(3,std.getPhoneno());

        int count = ps.executeUpdate();
        if(count>0){
            return true;
        }else{
            return false;
        }
    }
    public boolean updateStudentMail(int id,String updatedemail) throws SQLException {
        String query2 = "UPDATE StudentDetails  SET email=? WHERE id=? ;";
        PreparedStatement ps1 = con.prepareStatement(query2);
        ps1.setInt(2, id);
        ps1.setString(1, updatedemail);

        int count = ps1.executeUpdate();
        if(count>0){
            return true;
        }else{
            return false;
        }
    }
    public boolean updateStudentName(int id1,String updatedname) throws SQLException {
        String query3 = "UPDATE StudentDetails SET name=? WHERE id=? ;";
        PreparedStatement ps2 = con.prepareStatement(query3);
        ps2.setInt(2, id1);
        ps2.setString(1, updatedname);

        int count = ps2.executeUpdate();
        if(count>0){
            return true;
        }else{
            return false;
        }
    }
    public boolean updateStudentPhone(int id2,String updatedphoneno) throws SQLException {
        String query4 = "UPDATE StudentDetails SET phoneno WHERE id=?;";
        PreparedStatement ps3 = con.prepareStatement(query4);
        ps3.setInt(2, id2);
        ps3.setString(1, updatedphoneno);

        int count = ps3.executeUpdate();
        if(count>0){
            return true;
        }else{
            return false;
        }
    }
    public boolean deleteStudent(int id) throws SQLException{
        String query5 = "DELETE FROM StudentDetails WHERE id=?;";
        PreparedStatement ps4 = con.prepareStatement(query5);
        ps4.setInt(1,id);

        int count = ps4.executeUpdate();
        if(count>0){
            return true;
        }else{
            return false;
        }
    }
    public static List<Student> displayStudents() throws SQLException{
        List<Student> lst = new ArrayList<>();
        String query6 = "SELECT * FROM StudentDetails;";
        PreparedStatement ps5 = con.prepareStatement(query6);
        ResultSet rs = ps5.executeQuery();
        //Student std = new Student();
        while(rs.next()){
            Student std = new Student();
            std.setId(rs.getInt("id"));
            std.setName(rs.getString("name"));
            std.setEmail(rs.getString("email"));
            std.setPhoneno(rs.getString("phoneno"));
            lst.add(std);
        }
        return lst;
    }
    public static List<Student> displayStudentByID(int id) throws SQLException{
        List<Student> lst = new ArrayList<>();
        String query7 = "SELECT * FROM StudentDetails WHERE id=?;";
        PreparedStatement ps6 = con.prepareStatement(query7);
        ps6.setInt(1,id);
        ResultSet rs = ps6.executeQuery();
        Student std = new Student();
        while(rs.next()){
            std.setId(rs.getInt("id"));
            std.setName(rs.getString("name"));
            std.setEmail(rs.getString("email"));
            std.setPhoneno(rs.getString("phoneno"));
            lst.add(std);
        }
        return lst;
    }
}