import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        
        // Choose to enter an array or use a constant array
        System.out.println("Do you want to enter an array? (yes/no): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        int[] array;

        if (choice.equals("yes")) {
            // User-defined array
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            array = new int[n];

            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
        } else {
            // Constant array
            array = new int[]{5, 2, 9, 1, 5, 6};
            System.out.println("Using constant array: " + Arrays.toString(array));
        }

        // Sort the array
        Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));

        // Calculate sum and average
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / array.length;

        // Display results
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        scanner.close();
    }
}
}
