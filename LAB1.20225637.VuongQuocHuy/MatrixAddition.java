import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        
        // Ask the user if they want to enter the matrices or use constant matrices
        System.out.println("Do you want to enter matrices? (yes/no): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        int rows, columns;
        int[][] matrix1, matrix2;

        if (choice.equals("yes")) {
            // User-defined matrices
            System.out.print("Enter the number of rows: ");
            rows = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            columns = scanner.nextInt();
            
            // Initialize matrices
            matrix1 = new int[rows][columns];
            matrix2 = new int[rows][columns];

            // Input the first matrix
            System.out.println("Enter the elements of the first matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix1[i] = new int[columns];
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            // Input the second matrix
            System.out.println("Enter the elements of the second matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }
        } else {
            // Constant matrices
            matrix1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            matrix2 = new int[][]{
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
            };
            rows = matrix1.length;
            columns = matrix1[0].length;

            System.out.println("Using constant matrices:");
            System.out.println("Matrix 1:");
            printMatrix(matrix1);
            System.out.println("Matrix 2:");
            printMatrix(matrix2);
        }

        // Adding two matrices
        int[][] resultMatrix = addMatrices(matrix1, matrix2, rows, columns);

        // Display the result
        System.out.println("Resulting matrix after addition:");
        printMatrix(resultMatrix);

        scanner.close();
    }
    }
    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2, int rows, int columns) {
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
