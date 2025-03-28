import java.util.Scanner;

public class ExceptionHandling {

    public static void generateException(String str) {
        char ch = str.charAt(str.length());
        System.out.println("Character at invalid index: " + ch);
    }

    public static void handleException(String str) {
        try {
            char ch = str.charAt(str.length());
            System.out.println("Character at invalid index: " + ch);
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("Caught Exception: " + exception);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        handleException(input);
        scanner.close();
    }
}