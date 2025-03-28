import java.util.Scanner;

public class ArrayIndexExceptionDemo {

    public static void causeArrayIndexOutOfBoundsException(String[] data, int index) {
        System.out.println("\n-- Generating Exception (No try-catch) --");
        System.out.println("Accessing index " + index + ": " + data[index]);
    }

    public static void handleArrayIndexOutOfBoundsException(String[] data, int index) {
        System.out.println("\n-- Handling Exception (With try-catch) --");
        try {
            System.out.println("Accessing index " + index + ": " + data[index]);
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + arrayIndexOutOfBoundsException.getMessage());
        } catch (RuntimeException runtimeException) {
            System.out.println("Caught generic RuntimeException: " + runtimeException.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String[] names = { "Alice", "Bob", "Charlie", "David" };
        System.out.println("Array length is: " + names.length);
        System.out.print("Enter an index to access (e.g., 0 to 5): ");
        int index = inputScanner.nextInt();

        handleArrayIndexOutOfBoundsException(names, index);
        inputScanner.close();
    }
}