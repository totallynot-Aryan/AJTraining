// Parent class User
class User {
    // Properties
    private int id;
    private String name;

    // Parameterized constructor
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter method for calling
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

//Child Class creation Employee
class Employee extends User {
    // Additional property
    private double salary;

    // Parameterized constructor
    public Employee(int id, String name, double salary) {
        super(id, name); // Call to superclass constructor
        this.salary = salary;
    }

    // Method to calculate annual salary
    public double calculateAnnualSalary() {
        return salary * 12;
    }
}

public class SalaryCalculator {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "John", 20000);
        double annualSalary = emp.calculateAnnualSalary();
        System.out.println("Annual salary: " + annualSalary);
    }
}
