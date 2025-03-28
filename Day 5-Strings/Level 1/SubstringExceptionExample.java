import java.util.Scanner;

public class SubstringExceptionExample {

    public static void causeSubstringException(String text) {
        String sub = text.substring(5, 2);
        System.out.println("Substring: " + sub);
    }

    public static void handleSubstringException(String text) {
        try {
            String sub = text.substring(5, 2);
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Caught IllegalArgumentException: " + illegalArgumentException);
        } catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + stringIndexOutOfBoundsException);
        } catch (RuntimeException runtimeException) {
            System.out.println("Caught RuntimeException: " + runtimeException);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputText = scanner.nextLine();
        handleSubstringException(inputText);
        scanner.close();
    }
}