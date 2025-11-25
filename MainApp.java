// Program to manage bank accounts using inheritance
/*
 * Name: Denis Wambua
 * Reg No: S08-8451-2024
 * Description: This program creates a SavingsAccount, accepts a deposit from
 * the user, applies 5% interest, and displays the final balance.
 */

import java.util.Scanner;

class BankAccount {
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    public void addInterest() {
        balance = balance + (balance * 0.05);
    }
}

public class MainApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SavingsAccount account = new SavingsAccount(0);
        System.out.print("Enter amount to deposit: ");
        double amount = input.nextDouble();
        account.deposit(amount);
        account.addInterest();
        System.out.println("Final balance after interest: Ksh " + account.balance);
    }
}