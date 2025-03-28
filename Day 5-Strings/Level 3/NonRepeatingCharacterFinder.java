import java.util.Scanner;

public class NonRepeatingCharacterFinder {

    public static char findFirstUniqueCharacter(String text) {
        int[] charFrequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            charFrequency[character]++;
        }
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (charFrequency[character] == 1) {
                return character;
            }
        }
        return '\0'; // Null character if no non-repeating character is found
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = inputScanner.nextLine().replaceAll("\\s", "").toLowerCase();
        char firstUniqueChar = findFirstUniqueCharacter(inputText);
        if (firstUniqueChar != '\0') {
            System.out.println("First non-repeating character: " + firstUniqueChar);
        } else {
            System.out.println("No non-repeating character found.");
        }
        inputScanner.close();
    }
}