import java.util.Scanner;

public class StringLengthFinder {

    public static int calculateLengthManually(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
            // End of string reached
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = inputScanner.next();

        int manualLength = calculateLengthManually(inputText);
        int builtInLength = inputText.length();

        System.out.println("Length (manual): " + manualLength);
        System.out.println("Length (built-in): " + builtInLength);

        inputScanner.close();
    }
}