import java.util.Scanner;

class Convert2DTo1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get rows and columns from user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Declare 2D array (matrix)
        int[][] matrix = new int[rows][columns];

        // Taking input for 2D array
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at (" + i + "," + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Convert 2D array to 1D array
        int[] array = new int[rows * columns];
        int index = 0; // Index for 1D array

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j]; // Copy elements
                index++;
            }
        }

        // Display the original 2D matrix
        System.out.println("\nThe original 2D matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Display the converted 1D array
        System.out.println("\nThe converted 1D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close(); // Close scanner
    }
}
