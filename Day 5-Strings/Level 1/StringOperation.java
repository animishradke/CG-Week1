import java.util.Scanner;

public class StringOperation { // Changed class name to StringOperations

    public static char[] getCharacters(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        char[] customArray = getCharacters(input);
        char[] builtInArray = input.toCharArray();

        boolean isEqual = compareArrays(customArray, builtInArray);

        System.out.println("\nCustom Array: ");
        for (char c : customArray) {
            System.out.print(c + " ");
        }

        System.out.println("\nBuilt-in Array: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nAre both arrays equal? " + isEqual);
        scanner.close();
    }
}