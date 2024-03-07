/*
public class Main{
    int x = 1; //instance variable
    static int z = 4; //static variable
    public static void main(String[] args) {
        int y = 2; //Local Variable

        Main obj = new Main();

        System.out.println("Instance Variable x:" +obj.x);
        System.out.println("Local Variable y:" +y);
        System.out.println("Static Variable z:" +Main.z);
    }
}
*/

/*
public class Main{
    static int a = 5; //static var
    void fun(){
        int x = 9; //Local Var
        System.out.println(x+ " " +Main.a);
        x = x+1;
        a = a+1;
    }
    public static void main(String[] args){
        Main obj = new Main();
        obj.fun();
        obj.fun();
    }
}
*/

/*
public class Main {
   static int x = 10;
   static int y = 10;

    public static void main(String[] args){
        System.out.println("Addition:" +(x+y));
        System.out.println("Subtraction:" +(x-y));
        System.out.println("Multiplication:" +(x*y));
        System.out.println("Division:" +(x/y));
        System.out.println("Remainder:" +(x%y));
    }
}
*/

/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
*/
/*
public class Main{
    public static void main(String[] args){
        int n=13;
        int i;
        System.out.println("Even Odd");
        for(i=0; i<=n; i++){
            if(i%2==0) {
                System.out.print(i+ "    ");
            }
            else{
                System.out.println(" " +i);
                }
            }
        }
    }

 */

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Enter Range: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        System.out.println("Even");
        for (i=0; i<=n; i+=2){
            System.out.println(i);
        }
        System.out.println("Odd");
        for (i=1; i<=n; i+=2) {
            System.out.println(i);
        }
    }

}
*/

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Enter Age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("You are ineligible to vote");
        }

    }
}
*/
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("Monday");//condition
                break;
            case 2:
                System.out.println("Tuesday");//condition
                break;
            case 3:
                System.out.println("Wednesday");//condition
                break;
            case 4:
                System.out.println("Thursday");//condition
                break;
            case 5:
                System.out.println("Friday");//condition
                break;
            case 6:
                System.out.println("Saturday");//condition
                break;
            case 7:
                System.out.println("Sunday");//condition
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
*/
/*
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter First number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("Monday");//condition
                break;
            case 2:
                System.out.println("Tuesday");//condition
                break;
            case 3:
                System.out.println("Wednesday");//condition
                break;
            case 4:
                System.out.println("Thursday");//condition
                break;
            case 5:
                System.out.println("Friday");//condition
                break;
            case 6:
                System.out.println("Saturday");//condition
                break;
            case 7:
                System.out.println("Sunday");//condition
                break;
            default:
                System.out.println("Invalid");
                break;
    }
}
 */

/*
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter First number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.print("Enter Second number: ");
        int y = sc.nextInt();

        System.out.println("Enter Choice: ");
        System.out.println("Enter 1 for Addition ");
        System.out.println("Enter 2 for Subtraction ");
        System.out.println("Enter 3 for Multiplication ");
        System.out.println("Enter 4 for Division ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Addition:" + (x + y));//condition
                break;
            case 2:
                System.out.println("Subtraction:" + (x - y));//condition
                break;
            case 3:
                System.out.println("Multiplication:" + (x * y));//condition
                break;
            case 4:
                System.out.println("Division:" + (x / y));//condition
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
 */

/*
public class Main {
    public static void main(String[] args) {
        int i;
        int[] x= new int[10];
        for (i=0; i<x.length; i++){
            System.out.println("Count is: " +i);
        }
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        //int i;
        int[] x= {1,2,3,4,5,6,7,8,9}; //int[] x= new int[10];
        for (int i : x){
            System.out.println("Count is: " +i);
        }
    }
}
*/
/*
public class Main {
    public static void main(String[] args) {
        int i;
        int[] x= new int[10];
        System.out.println("Enter Elements for Array: ");
        for (int j=0; j<x.length; j++){
            Scanner sc = new Scanner(System.in);
            x[j]=sc.nextInt();
        }
        for (i=0; i<x.length; i++){
            System.out.println(x[i]);
            if (x[i]==5){
                break;
            }
            else{
                System.out.println("Element not found in the array");
            }
        }
    }
}

 */

/*
public class Main {
    public static void main(String[] args) {
        int[] x={1,2,4,5,0,9,7};
        int i;
        for(i=0; i<x.length; i++){
            if (x[i]==5){
                System.out.println("Element found at index: "+i);
                break;
            }
        }
    }
}
*/
/*
public class Main {
    public static void main(String[] args) {
        int i;
        int k = 1;
        for (i = 1; i <= 4; i++) {
            System.out.println();
            int j;
            for (j = 0; j < i; j++)
                System.out.print(k++);
        }

    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        String x= "peter picked a pen";
        int l= x.length();
        int i;
        int count=0;
        for(i=0; i<l; i++){
            if (x.charAt(i) !='p') {
                continue;
            }
            count++;
        }
        System.out.println("Count of p is: " +count);
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if(i==2) {
                System.out.println(" ");
                continue;
            }
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 */
/*
public class Main {
    int square(int num) {
        return num * num; // return a square value.
    }
    public static void main(String[] args) {

        Main m = new Main();
        int squareOfNumber = m.square(20);
        System.out.println("Square of 20: " +squareOfNumber);

        }
    }
}
*/

/*
public class Main {
    public int fun() {
        String x = "peter picked a pen";
        int l = x.length();
        int i;
        int count = 0;
        for (i = 0; i < l; i++) {
            if (x.charAt(i) != 'p') {
                continue;
            }
            count++;
        }
        //System.out.println("Count of p is: " +count);
        return count;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.fun());
    }
}
*/

/* //Incomplete Code
class Solution{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                long y=sc.nextLong();
                long z=sc.nextLong();
                long a=sc.nextLong();
                long b=sc.nextLong();
                long c=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127) {
                    System.out.println("* byte");
                }
                if(x>= -32768 && x<= 32767){
                   System.out.println("* short");
                }
                if (x>=-2147483648 && x<=2147483647) {
                   System.out.println("* int");
                }
                System.out.println(y+" can be fitted in:");
                if(y>=-128 && y<=127) {
                    System.out.println("* byte");
                }
                    if(y>=-32768 && y<=32767){
                        System.out.println("* short");
                    }
                    if (y>=-2147483648 && y<=2147483647) {
                        System.out.println("* int");
                    }

                System.out.println(z+" can be fitted in:");
                if(z>=-128 && z<=127) {
                    System.out.println("* byte");
                }
                    if(z>=-32768 && z<=32767){
                        System.out.println("* short");
                    }
                    if (z>=-2147483648 && z<=2147483647) {
                        System.out.println("* int");
                    }

                System.out.println(a+" can be fitted in:");
                if(a>=-128 && a<=127) {
                    System.out.println("* byte");
                }
                    if(a>=-32768 && a<=32767){
                        System.out.println("* short");
                    }
                    if (a>=-2147483648 && a<=2147483647) {
                        System.out.println("* int");
                    }

                System.out.println(b+" can be fitted in:");
                if(b>=-128 && b<=127) {
                    System.out.println("* byte");
                }
                    if(b>=-32768 && b<=32767){
                        System.out.println("* short");
                    }
                    if (b>=-2147483648 && b<=2147483647) {
                        System.out.println("* int");
                    }

                System.out.println(c+" can be fitted in:");
                if(c>=-128 && c<=127) {
                    System.out.println("* byte");
                }
                    if(c>=-32768 && c<=32767){
                        System.out.println("* short");
                    }
                    if (c>=-2147483648 && c<=2147483647) {
                        System.out.println("* int");
                    }
            }
                catch (Exception e)
                {
                    System.out.println(sc.next()+" can't be fitted anywhere.");
                }
        }
    }
}
 */
/*
class A{
    void display()
    {
        System.out.println("Display func of A");
    }
}
class B extends A{
    void display(){
        System.out.println("Display func of B");
    }
}
/*
class C extends A,B{
    void display(){
        System.out.println("Hello");
    }
}
*/
/*
public class Main {
    public static void main(String[] args) {
        A obj=new A();
        B obj1=new B();
//        C obj2=new C();

        obj.display();
        obj1.display();
        obj1.display();
//        obj.display();
    }
}
*/

/*
//Method Overloading
class AddFunc{
    static int add(int x, int y){
        return x+y;
    }
    static int add(int x, int y, int z){
        return x+y+z;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(AddFunc.add(34,35));
        System.out.println(AddFunc.add(23,23,23));
    }
}
*/

/*
//Method Overriding
class Car{
    void run(){
        System.out.println("Engine is running");
    }
}
class Bike extends Car{
    void name(){
        System.out.println("Yamaha");
    }
}
public class Main {
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
    }
}
*/

/*
class Shape{
    void area(){
        System.out.println("Finding Area");
    }
    void area(int r){
        System.out.println("Area of Circle: "+(3.14*r*r));
    }
    void area(int l, int b){
        System.out.println("Area of Rectangle: "+(l*b));
    }
    void area(double b, double h){
        System.out.println("Area of Triangle: "+(0.5*b*h));
    }
    void area(float r, float h){
        System.out.println("Area of Cylinder: "+(3.14*r*h+3.14*r*r));
    }
}
public class Main {
    public static void main(String[] args) {
        Shape ar = new Shape();
        ar.area();
        ar.area(5);
        ar.area(4.2,6.2);
        ar.area(9,2);
    }
}
*/

/*
class Student {
    String name;
    String email;
    int rollno;
    int age;

    Student() {
        System.out.println("Default Constructor Called!");
    }
    Student(String name, String email, int rollno, int age) {
        this.name = name;
        this.email = email;
        this.rollno = rollno;
        this.age = age;
    }
    //Constructor Overloading
    Student(String name, String email) {
        this.name = name;
        this.email = email;
    }
    Student(int rollno, int age) {
        this.rollno = rollno;
        this.age = age;
    }
}
public class Main{
    public static void main(String[] args) {
        Student s = new Student("Aryan","abc123@gmail.com",1,22);
        Student s1 = new Student();
        Student s2 = new Student(2,20);
        Student s3 = new Student("Atul","panday@bbc.com");

        System.out.println("Student name: "+s.name);
        System.out.println("Student Email ID: "+s.email);
        System.out.println("Student Roll No.: "+s.rollno);
        System.out.println("Student Age: "+s.age);

        System.out.println("Student name: "+s3.name);
        System.out.println("Student Email ID: "+s3.email);

        System.out.println("Student Roll No.: "+s2.rollno);
        System.out.println("Student Age: "+s2.age);
    }
}
*/
/*
class A{
    void fun(){
        System.out.println("Parent Class");
    }
    static void sfun(){
        System.out.println("Static Func of Parent Class");
    }
}
class B extends A{
    void fun(){
        System.out.println("Child Class");
    }
    static void sfun(){
        System.out.println("Static Func of Child Class");
    }
}
public class Main {
    public static void main(String[] args) {
        A obj1= new A();
        B obj2 = new B();
        A obj3 = new B();

        obj1.fun();
        obj2.fun();

        obj1.sfun(); //A.sfun();
        obj2.sfun(); //B.sfun();

        obj3.sfun(); //A.sfun();

    }
}
*/

/*
public abstract class A{
    abstract void fun();
    public void funn(){
        System.out.println("A's Funn method");
    }
}
public class B extends class A{
    public void fun(){
        System.out.println("B's Fun Method");
    }
}
public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.funn();
    }
}
 */

/*
abstract class Shape{
    String color;
    abstract double area();
    abstract public String toString();

    public Shape(String color){
        System.out.println("Shape Constructor Called!");
        this.color=color;
    }
    public String getColor(){
        return color;
    }

}

class Circle extends Shape {
    double r;

    Circle(String color, double r) {
        super(color);
        System.out.println("Circle Constructor Called!");
        this.r = r;
    }

    @Override
    double area() {
        double x = (3.14 * r * r);
        return x;
    }

    @Override
    public String toString() {
        return "Circle color is " + super.getColor() + " Area is: " + area();
    }
}

class Rectangle extends Shape {
    double l;
    double w;

    Rectangle(String color, double l, double w) {
        super(color);
        System.out.println("Rectangle Constructor Called!");
        this.l = l;
        this.w = w;
    }

    @Override
    double area() {
        double y = (l * w);
        return y;
    }

    @Override
    public String toString() {
        return "Rect color is " + super.getColor() + " Area is: " + area();
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle("Red", 2.5);

        Rectangle r = new Rectangle("White", 5.2, 2.5);

        System.out.println(c.toString());
        System.out.println(r.toString());

    }
}
*/

/*
import java.util.Scanner;

interface Client {
    void input();

    void output();
}
class Server implements Client {
    String name;
    int salary;

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Salary: ");
        salary = sc.nextInt();
    }

    @Override
    public void output() {
        System.out.println(name);
        System.out.println(salary*12+" LPA");
    }
}

public class Main {
    public static void main(String[] args) {
        Client c = new Server();
        c.input();
        c.output();
    }
}
*/