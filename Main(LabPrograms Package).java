package LabPrograms;
import java.awt.*;
import java.util.*;

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

import interfaceDemo.Test;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

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

/*
//I1.java
package interfaceDemo;
public interface I1 {
    void fun();
    void show();
}

//I2.java
package interfaceDemo;
public interface I2 {
    void fun1();
    void show();
}

//Test.java
package interfaceDemo;
public class Test implements I1,I2{
    @Override
    public void fun1(){
        System.out.println("Fun1 is called");
    }
    @Override
    public void fun(){
        System.out.println("Fun is called");
    }
    @Override
    public void show(){
        System.out.println("Show is called");
    }
}

//Main.java
public class Main {
    public static void main(String[]args){
        Test t = new Test();
        t.fun();
        t.fun1();
        t.show();
    }
}
*/

/*
interface Vehicle{
    void changeGear(int g);
    void speedUp(int u);
    void speedDown(int d);
}

class Cycle implements Vehicle{
    int speed=0;
    int gear=0;

    @Override
    public void changeGear(int g) {
        this.gear=g;
        //gear=changeGear();

    }

    @Override
    public void speedUp(int u) {
        speed=speed+u;

    }

    @Override
    public void speedDown(int d) {
        speed=speed-d;
    }

    /*
    @Override
    public String toString() {
        return "Gear is " + gear + " " + "Speed is " + speed;
        //return super.toString();
    }
    */
/* //continued of above
    void display(){
        System.out.println("Gear is " + gear + " & " + "Speed is " + speed);
    }
}

public class Main {
    public static void main(String[] args) {
        Cycle c = new Cycle();

        c.changeGear(0);
        c.speedUp(0);
        c.display();

        c.changeGear(2);
        c.speedUp(5);
        c.display();
    }
}
*/

/*
//Default Abstract Method
interface I1{
    int a = 1;
    default void display(){
        System.out.println("Default Called!");
    }
}
class DefaultDemo implements I1{
    public static void main(String[] args) {
        DefaultDemo dd = new DefaultDemo();
        dd.display();
    }
}
*/
/*
//double <- float <- long <- int <- char <- short <- byte
//Widening Type Casting
public class Main {
    public static void main(String[] args){
        int x = 10;
        long y = x;
        float z = y;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
*/

/*
//double -> float -> long -> int -> char -> short -> byte
//Narrowing Type Casting
public class Main {
    public static void main(String[] args) {
        int x = 10;
        byte y = (byte)x;
        long z = (long)x;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
*/
/*
public class Main {
    public static void main(String[] args) {
        byte x = 5;
        byte y = 10;
        byte c = (byte)(x+y);
        //int c = x+y;

        System.out.println(c);
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        int x = 100;
        System.out.println(x++);
        System.out.println(++x);

        System.out.println();

        System.out.println(x--);
        System.out.println(--x);

        System.out.println();

        System.out.println(x<<2);
        System.out.println(x>>2);
    }
}
*/

// ABSENT ON 12/03/24

/*
class Box{
    Object container; //For String Data Type, use String instead of Object in the code.

    Box(Object container){
        this.container=container;
    }

    public Object getContainer() {
        System.out.println();
        return container;
    }
}
public class Main {
    public static void main(String[] args) {
        Box b = new Box("Hello");
        System.out.println(b.getContainer());

        Box c = new Box(1234);
        System.out.println(c.getContainer());
    }
}
*/

/*
class Box<T>{ //for instantiating constraints
    T container;

    Box(T container){
        this.container=container;
    }

    public T getContainer() {
        System.out.println();
        return container;
    }
}
public class Main {
    public static void main(String[] args) {
        Box<String> b = new Box("Hello");
        //b.container="Hello";
        System.out.println(b.getContainer());

        Box<Integer> c = new Box(1234);
        //b.container=1234;
        System.out.println(c.getContainer());
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(20);
        stk.push(40);
        stk.push(60);

        System.out.println(stk);
        stk.pop();
        System.out.println(stk);
        System.out.println("Peek Element: "+stk.peek());
        System.out.println(stk.isEmpty());
        System.out.println(stk.add(80));
        System.out.println(stk);
        System.out.println("Available at Index: "+stk.search(80));
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(20);
        que.add(40);
        que.add(60);

        System.out.println("Original Queue: "+que);
        que.poll();
        System.out.println("Updated Queue: "+que);
        System.out.println("Peek Element: "+que.element());
        System.out.println("Queue empty or not? True or False- "+que.isEmpty());
        que.offer(80);
        System.out.println("Updated Queue: "+que);
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);

        minHeap.add(40);
        minHeap.add(20);
        minHeap.add(60);
        minHeap.add(5);
        System.out.println("minHeap: "+minHeap);
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }

        System.out.println();

        maxHeap.add(4);
        maxHeap.add(2);
        maxHeap.add(6);
        maxHeap.add(5);
        System.out.println("maxHeap: "+maxHeap);
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }

    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(5);
        s.add(2);
        s.add(5);
        s.add(6);
        System.out.println(s);
        System.out.println(s.size());

    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("D");
        lhs.add("1");
        lhs.add("C");
        lhs.add("K");
        lhs.add("$");

        System.out.println(lhs);
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        System.out.println("HashSet:");
        hs.add("Apple");
        hs.add("Mango");
        hs.add("Pineapple");
        hs.add("Grapes");

        for(String Fruit: hs){
            System.out.println(Fruit);
        }

        System.out.println();

        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        System.out.println("LinkedHashSet:");
        lhs.add("Grapes");
        lhs.add("Apple");
        lhs.add("Pineapple");
        lhs.add("Mango");

        for(String Fruit: lhs){
            System.out.println(Fruit);
        }
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        String S1 = new String("Aryan");
        String S2 = new String("Aryan");
        String S3 = S1;

        System.out.println(S1==S2); //false, because it compares the memory reference
        System.out.println(S1==S3); //true, because they have same memory reference
        System.out.println(S1.equals(S2)); //true, because it compares the value
        System.out.println(S2.equals(S3)); //true, because it compares the value
        System.out.println(S1.equals(S3)); //true, because it compares the value
    }
}
 */

/*
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(101,"Aryan");
        hm.put(102,"Sumit");
        hm.put(103,"Kuldeep");
        hm.put(104,"Atul");
        hm.put(104,"Aniket");
        System.out.println(hm);

        System.out.println("================================================");

        //Set set = hm.entrySet(); //Enters values inside the map. //optional either this or that
        //Iterator itr = set.iterator(); //optional either this or that
        Iterator itr = hm.entrySet().iterator(); //hm.iterator() cannot be used because hashmap doesn't inherit iterator.
        while(itr.hasNext()){
            Map.Entry mentry = (Map.Entry)itr.next(); //separates key and value
            System.out.println("Value: "+mentry.getValue()+", "+"Key: "+mentry.getKey());
            //System.out.println(mentry.getValue());
            //System.out.println(mentry.getKey());
            //System.out.println(itr.next());
        }
        System.out.println("================================================");
        for(Map.Entry mentry:hm.entrySet()){
            System.out.println("Value: "+mentry.getValue()+" --> "+"Key: "+mentry.getKey());
        }
    }
}
*/

/*
class Car implements Comparable<Car>{
    int speed;
    int power;

    public Car(int speed, int power) {
        this.speed = speed;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car {" +
                "Speed=" + speed +
                ", Power=" + power +
                '}';
    }
    @Override
    public int compareTo(Car c){
        return this.power-c.power; //for power.
        //return this.speed-c.speed; //for speed.
    }
}

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Car> pq = new PriorityQueue<>();
        pq.add(new Car(180,200));
        pq.add(new Car(300,400));
        pq.add(new Car(220,300));

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
*/

//ABSENT ON 14/03/24 (second half)
//ABSENT ON 15/03/24

/*
class NumPrint implements Runnable {
    private int start;
    private int end;

    public NumPrint(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }

    public static void main(String[] args) {
        int threadCount = 2; // Number of threads
        int numbersPerThread = 10; // Numbers to print per thread
        Thread[] thrd = new Thread[threadCount];

        for (int i = 0; i < threadCount; i++) {
            int start = i * numbersPerThread + 1;
            int end = (i + 1) * numbersPerThread;
            thrd[i] = new Thread(new NumPrint(start, end), "Thread-" + (i + 1));
            thrd[i].start();
        }

        // Wait for all threads to finish
        try {
            for (Thread thread : thrd) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
*/

/*
class NumPrint implements Runnable {
    Lock lck;

    NumPrint(Lock lck) {
        this.lck = lck;
    }

    @Override
    public void run() {
        lck.lock();
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        } finally {
            lck.unlock();
        }
    }

    public static void main(String[] args) {
        Lock lck = new ReentrantLock();
        //NumPrint t = new NumPrint(lck);
        ExecutorService es = Executors.newFixedThreadPool(10);
//        for(int i=0; i<10; i++){
//            NumPrint t = new NumPrint(lck);
//            es.submit(t);
//        }
//        es.shutdown();
        //Thread thrd = new Thread(new NumPrint());
        //thread.start();
//        es.submit(t);
//        es.shutdown();
    }
}
*/

//ABSENT ON 19/03/24

/*
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        Frame fr = new Frame("AWT Example");
        Button bt = new Button("Click");
        fr.add(bt);
        fr.setSize(200,200);
        fr.setVisible(true);
    }
}
*/

/*
import javax.swing.*;

class Swing extends JFrame{
    Swing(){
        setLayout(null);

        setSize(500,500);
        setVisible(true);//makes the frame visible
        setDefaultCloseOperation(EXIT_ON_CLOSE);//used for closing the swing app
        setTitle("AWT Program");
        setLocation(300, 300);
        //getContentPane().setBackground(Color.LIGHT_GRAY);

        JLabel jltitle = new JLabel("Useless Form");
        jltitle.setBounds(550,0,500,100);
        jltitle.setFont(new Font("Bradley Hand ITC", Font.BOLD, 50));
        add(jltitle);

        JLabel jlname = new JLabel("Name: ");
        jlname.setBounds(0,100,500,100);
        jlname.setFont(new Font("Bradley Hand ITC", Font.BOLD, 50));
        add(jlname);

        JTextField jtfname = new JTextField();
        jtfname.setBounds(250, 120, 400, 50);
        add(jtfname);

        JLabel jladdress = new JLabel("Roll No.: ");
        jladdress.setBounds(0,200,500,100);
        jladdress.setFont(new Font("Bradley Hand ITC", Font.BOLD, 50));
        add(jladdress);

        JTextField jtfaddress = new JTextField();
        jtfaddress.setBounds(250, 220, 400, 50);
        add(jtfaddress);

        JButton jb = new JButton("Submit");
        jb.setBounds(590, 275, 75, 30);
        add(jb);

        JRadioButton jrbm = new JRadioButton("Male");
        jrbm.setBounds(250, 275, 75, 30);
        add(jrbm);

        JRadioButton jrbf = new JRadioButton("Female");
        jrbf.setBounds(325, 275, 75, 30);
        add(jrbf);

        ButtonGroup gender = new ButtonGroup();
        gender.add(jrbm);
        gender.add(jrbf);

        JCheckBox jcb1 = new JCheckBox("Happy?");
        jcb1.setBounds(400, 275, 75, 30);
        add(jcb1);

        JCheckBox jcb2 = new JCheckBox("Depressed?");
        jcb2.setBounds(475, 275, 100, 30);
        add(jcb2);

        ButtonGroup choice = new ButtonGroup();
        choice.add(jcb1);
        choice.add(jcb2);

        JOptionPane.showMessageDialog(null, "Submit the form!");
    }

    public static void main(String[] args) {
        new Swing();
    }
}
*/

//ABSENT ON 22/03/24
//ABSENT ON 27/03/24

