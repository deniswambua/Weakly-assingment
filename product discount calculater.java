// Program to calculate a discounted product price
/*
 * Name: Denis Wambua
 * Reg No: S08-8451-2024
 * Description: This program defines a Product class with name and price.
 * It allows the user to enter a discount percentage, applies the discount,
 * and displays the updated product price.
 */

import java.util.Scanner;

class Product {
    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void applyDiscount(double percentage) {
        double discountAmount = (percentage / 100) * price;
        price = price - discountAmount;
    }

    public double getPrice() {
        return price;
    }
}

public class ProductDiscountTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Product product = new Product("Laptop Bag", 2500.00);

        System.out.print("Enter discount percentage: ");
        double discount = input.nextDouble();

        product.applyDiscount(discount);

        System.out.println("New price after discount: Ksh " + product.getPrice());
    }
}
