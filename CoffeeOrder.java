// Program to store and display coffee order details
/*
 * Name: Denis Wambua
 * Reg No: S08-8451-2024
 * Description: This program defines a CoffeeOrder class with size and price,
 * creates two objects, and displays their details.
 */

class CoffeeOrder {
    String size;
    double price;

    public CoffeeOrder(String size, double price) {
        this.size = size;
        this.price = price;

    public void displayOrder() {
        System.out.println("Coffee Size: " + size);
        System.out.println("Price: Ksh " + price);

    }
}

public class CoffeeOrderTest {

    public static void main(String[] args) {
        CoffeeOrder order1 = new CoffeeOrder("Large", 250.00);
        CoffeeOrder order2 = new CoffeeOrder("Medium", 180.00);

        System.out.println("Order 1 Details:");
        order1.displayOrder();

        System.out.println("Order 2 Details:");
        order2.displayOrder();
    }
}
