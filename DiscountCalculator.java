// Program to compute discount
/*
* Name: Denis Wambua
* Reg No: S08-8451-2024
* Description: Program to compute discount
 */
import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double discount;
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter the purchase amount: ");
        double amount = input.nextDouble();
        if (amount > 5000) {
            discount = 0.10 * amount;
        } else if (amount > 1000 && amount <= 5000) {
            discount = 0.05 * amount;
        } else {
            discount = 0;
        }
        double amounttopay = amount - discount;

        System.out.println("Purchase Amount: " + amount);
        System.out.println("Discount: " + discount);
        System.out.println("Amount to pay: " + amounttopay);

        input.close();
    }
}
