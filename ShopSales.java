public class ShopSales {
    public static void main(String[] args) {

        int[][][] sales = {
                { {10, 20, 30}, {15, 25, 35} },
                { {5, 10, 15}, {8, 16, 24} }
        };

        System.out.println("All Sales Data:");
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                for (int k = 0; k < sales[i][j].length; k++) {
                    System.out.print(sales[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        int totalBranch1 = 0;
        for (int j = 0; j < sales[0].length; j++) {
            for (int k = 0; k < sales[0][j].length; k++) {
                totalBranch1 += sales[0][j][k];
            }
        }

        System.out.println("Total sales for Branch 1 = " + totalBranch1);
    }
}