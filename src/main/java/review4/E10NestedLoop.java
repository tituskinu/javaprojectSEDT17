package review4;

import java.util.Scanner;

public class E10NestedLoop {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int[] numbers = new int[5];

            // Take input from the user and store in the array
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = scanner.nextInt();
            }

            System.out.println("Elements in reverse order:");

            // Print the elements in reverse order
            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.print(numbers[i] + " ");
            }

            scanner.close();

    }
}
