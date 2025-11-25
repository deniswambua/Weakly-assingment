// Program to demonstrate inheritance with Vehicle and Car classes
/*
 * Name: Denis Wambua
 * Reg No: S08-8451-2024
 * Description: This program creates a Car object, assigns values to its
 * attributes inherited from Vehicle, and prints all details.
 */

// Parent class
class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}

class Car extends Vehicle {
    int seats;

    public Car(String brand, int year, int seats) {
        super(brand, year); // calling parent constructor
        this.seats = seats;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Number of Seats: " + seats);
    }
}

public class MainApp {
    public static void main(String[] args) {

        Car myCar = new Car("Toyota", 2020, 5);

        myCar.displayDetails();
    }
}
