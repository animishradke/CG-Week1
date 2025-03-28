import java.util.Scanner;

public class UniqueCharacters {

    public static int getLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (Exception exception) {
            // Reached end of string
        }
        return length;
    }

    public static char[] findUniqueCharacters(String text) {
        int length = getLength(text);
        char[] tempUniqueChars = new char[length];
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                tempUniqueChars[uniqueCount++] = currentChar;
            }
        }
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = tempUniqueChars[i];
        }
        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();
        char[] uniqueCharacters = findUniqueCharacters(inputText);
        System.out.print("Unique characters: ");
        for (char character : uniqueCharacters) {
            System.out.print(character + " ");
        }
        System.out.println();
        scanner.close();
    }
}