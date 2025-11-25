// Program to manage university employees using inheritance
/*
 * Name: Denis Wambua
 * Reg No: S08-8451-2024
 * Description: This program accepts details for a Lecturer, creates an object,
 * and displays all information using an overridden displayInfo() method.
 */

import java.util.Scanner;

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Lecturer extends Employee {
    String department;

    public Lecturer(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter salary: ");
        double salary = input.nextDouble();
        input.nextLine();

        System.out.print("Enter department: ");
        String department = input.nextLine();

        Lecturer lecturer = new Lecturer(name, salary, department);
        
        System.out.println("\n--- Lecturer Information ---");
        lecturer.displayInfo();
    }
}