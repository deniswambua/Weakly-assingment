public class WarehouseStock {
    public static void main(String[] args) {

        int[][][] stock = {
                { {50, 30, 20}, {40, 25, 15} },
                { {60, 35, 25}, {55, 28, 18} }
        };

        System.out.println("All Stock Data:");
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                for (int k = 0; k < stock[i][j].length; k++) {
                    System.out.print(stock[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        int totalWarehouse2 = 0;
        for (int j = 0; j < stock[1].length; j++) {
            for (int k = 0; k < stock[1][j].length; k++) {
                totalWarehouse2 += stock[1][j][k];
            }
        }

        System.out.println("Total stock in Warehouse 2 = " + totalWarehouse2);
    }
}