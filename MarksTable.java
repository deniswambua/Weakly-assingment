public class MarksTable {
    public static void main(String[] args) {

        int[][] marks = {
                {75, 80, 90},
                {65, 70, 85},
                {88, 92, 81}
        };

        System.out.println("Marks Table:");
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        // Average of student 3 (row 2)
        int sum = 0;
        for (int j = 0; j < marks[2].length; j++) {
            sum += marks[2][j];
        }

        double average = sum / 3.0;

        System.out.println("Average marks of Student 3 = " + average);
    }
}

