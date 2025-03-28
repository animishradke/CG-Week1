import java.util.Scanner;

public class UniqueCharacterFrequency {

    public static char[] findUniqueCharacters(String text) {
        StringBuilder uniqueCharsBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isCharUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isCharUnique = false;
                    break;
                }
            }
            if (isCharUnique) {
                uniqueCharsBuilder.append(currentChar);
            }
        }
        return uniqueCharsBuilder.toString().toCharArray();
    }

    public static String[][] calculateCharacterFrequencies(String text) {
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        char[] uniqueCharactersArray = findUniqueCharacters(text);
        String[][] result = new String[uniqueCharactersArray.length][2];
        for (int i = 0; i < uniqueCharactersArray.length; i++) {
            result[i][0] = Character.toString(uniqueCharactersArray[i]);
            result[i][1] = Integer.toString(frequency[uniqueCharactersArray[i]]);
        }
        return result;
    }

    public static void displayCharacterFrequencies(String[][] frequencyData) {
        System.out.printf("%-10s%-10s\n", "Character", "Frequency");
        System.out.println("----------------------");
        for (String[] row : frequencyData) {
            System.out.printf("%-10s%-10s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = inputScanner.nextLine().replaceAll("\\s", "").toLowerCase();
        String[][] frequencies = calculateCharacterFrequencies(inputText);
        System.out.println("\nFrequency of Unique Characters:");
        displayCharacterFrequencies(frequencies);
        inputScanner.close();
    }
}