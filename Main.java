package DBConnectivity;

import java.sql.*;
import java.util.Scanner;
/*
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SampleDB?useSSL=false","root","pswd@1234");
        System.out.println("Connection Established");

        //Scanner sc = new Scanner(System.in);
        //int StudentID = sc.nextInt();
        //System.out.println("Enter StudentID: ");
        //sc.nextLine();
        //String StudentName = sc.next();
        //System.out.println("Enter StudentName: ");
        //String StudentEmailID = sc.next();
        //System.out.println("Enter StudentEmailID: ");

        //PreparedStatement ps = conn.prepareStatement("INSERT INTO Student VALUES(102 , 'Donny' , 'donnyz102@gmail.com')");
        //OR
        //PreparedStatement ps = conn.prepareStatement("INSERT INTO Student VALUES(?,?,?)");
        //ps.setInt(1,103);
        //ps.setString(2,"Lazy");
        //ps.setString(3,"lazzy103@gmail.com");

//        PreparedStatement ps = conn.prepareStatement("UPDATE Student SET StudentEmailID = ? WHERE StudentID = ?");
//        ps.setString(1,"Lazzy103@gmail.com");
//        ps.setInt(2,103);

        //PreparedStatement ps = conn.prepareStatement("INSERT INTO Student VALUES('"+StudentID+"', '"+StudentName+"' , '"+StudentEmailID+"')");

        PreparedStatement ps = conn.prepareStatement("SELECT * FROM Student");
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            System.out.print(rs.getInt("StudentID")+" ");
            System.out.print(rs.getString("StudentName")+" ");
            System.out.println(rs.getString("StudentEmailID")+" ");
        }

//        int res = ps.executeUpdate();
//        if(rs>0){
//            System.out.println("Great Success!");
//        }else{
//            System.out.println("Great Failure!");
//        }
    }
}
*/


public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SampleDB?useSSL=false","root","pswd@1234");
        System.out.println("Connection Established");

        //Scanner sc = new Scanner(System.in);
        //int StudentID = sc.nextInt();
        //System.out.println("Enter StudentID: ");
        //sc.nextLine();
        //String StudentName = sc.next();
        //System.out.println("Enter StudentName: ");
        //String StudentEmailID = sc.next();
        //System.out.println("Enter StudentEmailID: ");

        Statement stmt = conn.createStatement();
        String createTable = "Create Table Employee(EID INT AUTO_INCREMENT PRIMARY KEY, NAME VARCHAR(100), ADDRESS VARCHAR(150), SALARY INT);";
        stmt.executeQuery(createTable);
        System.out.println("Table is created!");

        String valueTable = "INSERT INTO Employee VALUES(101, 'Aryan', 'A17, New Delhi' , '50L');";
        stmt.executeUpdate(valueTable);
        System.out.println("Table is Updated with new records!");

        String selectQuery = "SELECT * FROM Employee";
        ResultSet rs = stmt.executeQuery(selectQuery);
        System.out.println("Inserted Data: ");
        while(rs.next()){
            int EID = rs.getInt("EID");
            String name = rs.getString("NAME");
            String address = rs.getString("ADDRESS");
            String salary = rs.getString("SALARY");
            System.out.println("Employee ID: "+EID+"Name: "+name+"Address: "+address+"Salary: "+salary);
        }

//        int res = ps.executeUpdate();
//        if(rs>0){
//            System.out.println("Great Success!");
//        }else{
//            System.out.println("Great Failure!");
//        }

    }
}
