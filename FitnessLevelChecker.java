// Program to determine fitness level based on daily steps
/*
 * Name: Denis Wambua
 * Reg No: S08-8451-2024
 * Description: This program determines the user's fitness level
 * based on the number of steps taken in a day.
 */
import java.util.Scanner;

public class FitnessLevelChecker {
    public static String getFitnessLevel(int steps) {
        if (steps >= 10000) {
            return "Excellent";
        } else if (steps >= 7000) {
            return "Good";
        } else if (steps >= 4000) {
            return "Average";
        } else {
            return "Poor";
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your steps for today: ");
        int steps = input.nextInt();
        System.out.println("Your fitness level: " + level);
    }
}
