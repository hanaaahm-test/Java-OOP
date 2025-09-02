import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SrtArr {

    // Method to read integers from the user
    public int[] readNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        // Read the number of integers with error handling
        while (true) {
            try {
                System.out.println("Enter the number of integers:");
                n = scanner.nextInt();
                if (n <= 0) {
                    throw new IllegalArgumentException("Number of integers must be positive.");
                }
                break; // Exit loop if input is valid
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.next(); // Clear invalid input
            }
        }

        // Initialize an array to store the integers
        int[] numbers = new int[n];

        // Read the integers with error handling
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    numbers[i] = scanner.nextInt();
                    break; // Exit loop if input is valid
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next(); // Clear invalid input
                }
            }
        }

        return numbers;
    }

    // Method to sort the array
    public void sortArray(int[] array) {
        Arrays.sort(array);
    }

    // Method to display the array
    public void displayArray(int[] array) {
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
