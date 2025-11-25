// Program: Library Fine Calculation
/*
 * Name: Jeremiah Murimi
 * Reg No: S08-8414-2024
 * Description: Program to calculate library fine for overdue books
 */

import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        String bookID = input.nextLine();

        System.out.print("Enter Due Date (in days, e.g. 10): ");
        int dueDate = input.nextInt();

        System.out.print("Enter Return Date (in days, e.g. 15): ");
        int returnDate = input.nextInt();
        int daysOverdue = returnDate - dueDate;
        if (daysOverdue < 0) {
            daysOverdue = 0;
        }
        int fineRate;
        if (daysOverdue <= 7 && daysOverdue > 0) {
            fineRate = 20;
        } else if (daysOverdue >= 8 && daysOverdue <= 14) {
            fineRate = 50;
        } else if (daysOverdue >= 15) {
            fineRate = 100;
        } else {
            fineRate = 0;
        }
        int fineAmount = fineRate * daysOverdue;
        System.out.println("\n--- Library Fine Report ---");
        System.out.println("Book ID: " + bookID);
        System.out.println("Due Date: " + dueDate);
        System.out.println("Return Date: " + returnDate);
        System.out.println("Days Overdue: " + daysOverdue);
        System.out.println("Fine Rate: Ksh " + fineRate);
        System.out.println("Total Fine Amount: Ksh " + fineAmount);

        input.close();
    }
}