package StudentManagementDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;
import java.sql.*;


public class Authentication {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        boolean isAuthenticated=false;
        do {
            String username;
            String password;
            System.out.print("Enter the username: ");
            username = sc.nextLine();
            System.out.print("Enter the password: ");
            password=sc.nextLine();
            isAuthenticated= loginChecker(username,password);
            if(isAuthenticated){
                System.out.println("! Login Successful !");
            }
            else{
                System.out.println("username and password does not match");
            }
        }
        while(!isAuthenticated);
        System.out.println("========== Welcome to Student DataBase ==========");
        while(true){
            System.out.println("====== Student Database Menu ======");
            System.out.println("Select 1 to ADD Student");
            System.out.println("Select 2 to UPDATE Student details");
            System.out.println("Select 3 to DELETE a Student");
            System.out.println("Select 4 to DISPLAY all Student");
            System.out.println("Select 5 to DISPLAY Student by ID");
            System.out.println("Select 6 to exit");
            System.out.println();
            System.out.print("Enter your Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if(choice==1) {
                StudentDBConnection conn = new StudentDBConnection();
                System.out.print("Enter Name: ");
                String name = sc.next();
                System.out.print("Enter Email: ");
                String email = sc.next();
                System.out.print("Enter Phone No.: ");
                String phoneno = sc.next();

                Student std = new Student(0,name, email, phoneno);

                StudentDAO stdDAO = new StudentDAO();

                boolean result = stdDAO.addStudent(std);

                if (result) {
                    System.out.println("Student Added");
                } else {
                    System.out.println("Student not added");
                }
                System.out.println();

            } else if (choice==2) {
                System.out.print("Enter ID of the student: ");
                int id=sc.nextInt();
                sc.nextLine();
                System.out.println("Select 1 to Update Email");
                System.out.println("Select 2 to Update Name");
                System.out.println("Select 3 to Update Phone Number");
                System.out.print("Enter Choice: ");
                int option=sc.nextInt();
                sc.nextLine();
                if(option==1){
                    StudentDBConnection con=new StudentDBConnection();

                    System.out.print("Enter Email to be updated:");
                    String updatedemail=sc.nextLine();

                    StudentDAO stdDAO = new StudentDAO();

                    boolean result = stdDAO.updateStudentMail(id, updatedemail);

                    if (result) {
                        System.out.println("Student Details Updated");
                    } else {
                        System.out.println("Student not updated!");
                    }
                    System.out.println();

                } else if (option==2) {
                    StudentDBConnection con=new StudentDBConnection();

                    System.out.println("Enter Name to be updated:");
                    String updatedname=sc.nextLine();

                    StudentDAO stdDAO = new StudentDAO();

                    boolean result = stdDAO.updateStudentName(id, updatedname);

                    if (result) {
                        System.out.println("Student Details Updated");
                    } else {
                        System.out.println("Student not updated!");
                    }
                    System.out.println();

                } else if (option==3) {
                    StudentDBConnection con=new StudentDBConnection();
                    System.out.println("Enter Phone No. to be updated:");
                    String updatedphoneno=sc.nextLine();

                    StudentDAO stdDAO = new StudentDAO();

                    boolean result = stdDAO.updateStudentPhone(id, updatedphoneno);

                    if (result) {
                        System.out.println("Student Details Updated");
                    } else {
                        System.out.println("Student not updated!");
                    }
                    System.out.println();
                }
            } else if (choice==3) {
                System.out.print("Enter ID of the student: ");
                int id=sc.nextInt();
                sc.nextLine();
                StudentDAO stdDAO = new StudentDAO();

                boolean result = stdDAO.deleteStudent(id);

                if (result) {
                    System.out.println("Student with ID " +id+ " is Deleted!");
                } else {
                    System.out.println("ID not found!");
                }
                System.out.println();

            } else if (choice==4) {
                StudentDBConnection con = new StudentDBConnection();
                System.out.println("=== All Students ===");
                /*
                StudentDAO stdDAO = new StudentDAO();
                System.out.println(stdDAO.displayStudents());
                */
                //optional both

                List<Student> lst = StudentDAO.displayStudents();
                if (!lst.isEmpty()) {
                    for (Student student : lst) {
                        System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Email: " + student.getEmail() + ", Phone: " + student.getPhoneno());
                    }
                } else {
                    System.out.println("Database Empty.");
                }
                System.out.println();


            } else if (choice==5) {
                StudentDBConnection con = new StudentDBConnection();
                System.out.print("Enter ID of the Student: ");
                int id = sc.nextInt();
                //StudentDAO stdDAO = new StudentDAO();
                //System.out.println(stdDAO.displayStudentByID(id));

                //optional for view

                List<Student> lst = StudentDAO.displayStudentByID(id);
                if (!lst.isEmpty()) {
                    for (Student student : lst) {
                        System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Email: " + student.getEmail() + ", Phone: " + student.getPhoneno());
                    }
                } else {
                    System.out.println("Not Found with the given ID.");
                }
                System.out.println();
            } else if(choice==6){
                break;
            }else{
                System.out.println("Wrong Input.");
            }
            System.out.println();
        }

    }
    public static boolean loginChecker(String username, String password) throws Exception{
        StudentDBConnection obj=new StudentDBConnection();
        PreparedStatement ps=obj.con.prepareStatement("Select * from StudentLogin Where username=? AND password=?");
        ps.setString(1,username);
        ps.setString(2,password);
        ResultSet rs= ps.executeQuery();
        if(rs.next()){
            return true;
        }
        return false;
    }
}
