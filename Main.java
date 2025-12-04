public class ShoppingCart {

    public static void main(String[] args) {

        int[] prices = {120, 80, 150, 60, 200, 90};

        System.out.println("Item Prices:");

        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }

        int total = 0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }