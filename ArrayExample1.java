public class ArrayExample1 {

    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20, 25};

        System.out.println("Array Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum of all elements: " + sum);
    }
}

