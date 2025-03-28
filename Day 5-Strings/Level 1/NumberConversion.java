import java.util.Scanner;

public class NumberConversion {

    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Converted Number: " + number);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted Number: " + number);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Caught NumberFormatException: " + numberFormatException);
        } catch (RuntimeException runtimeException) {
            System.out.println("Caught RuntimeException: " + runtimeException);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        handleException(input);
        scanner.close();
    }
}