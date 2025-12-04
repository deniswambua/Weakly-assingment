public class StudentMarks {
    public static void main(String[] args) {

        int[][] marks = {
                {80, 70, 90},
                {60, 85, 75},
                {88, 92, 79}
        };

        System.out.println("Student Marks (Matrix Form): ");
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        int sumFirstRow = 0;
        for (int j = 0; j < marks[0].length; j++) {
            sumFirstRow += marks[0][j];
        }

        double average = sumFirstRow / 3.0;
        System.out.println("Average of first row = " + average);
    }
}
