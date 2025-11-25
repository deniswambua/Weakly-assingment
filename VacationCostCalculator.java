// Program to calculate total vacation cost
/*
 * Name: Denis Wambua
 * Reg No: S08-8451-2024
 * Description: This program calculates the total vacation cost by adding
 * the accommodation cost, meal cost, and activity cost.
 */
public class VacationCostCalculator {
    public static double calculateTotalCost(double accommodationCost, double mealCost, double activityCost) {
        return accommodationCost + mealCost + activityCost;
    }
    public static void main(String[] args) {
        double accommodationCost = 850.00;
        double mealCost = 400.75;
        double activityCost = 200.00;
        double totalCost;totalCost = calculateTotalCost(accommodation, meals, activities);
        System.out.println("Total Vacation Cost: $" + totalCost);
    }
}