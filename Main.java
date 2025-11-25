// Program to calculate student grade
/*
 * Name: Denis Wambua
 * Reg No: S08-8451-2024
 * Description: This program accepts student details, calculates the grade
 * using GradeCalculator, and displays the results.
 */

import java.util.Scanner;

class Student {
    String name;
    double mark;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class GradeCalculator {

    public String calculateGrade(double marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "D";
        }
    }
}
public class MainApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student marks: ");
        double marks = input.nextDouble();

        Student student = new Student(name, marks);

        GradeCalculator calculator = new GradeCalculator();

        String grade = calculator.calculateGrade(marks);

        System.out.println("\n--- Student Details ---");
        student.displayDetails();
        System.out.println("Grade: " + grade);
    }
}
