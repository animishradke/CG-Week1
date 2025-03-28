import java.util.Scanner;

public class CharacterFrequency {

    public static String[] getCharFrequencies(String text) {
        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length];
        for (int i = 0; i < characters.length; i++) {
            frequency[i] = 1;
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j] && characters[i] != '\0') {
                    frequency[i]++;
                    characters[j] = '\0';
                }
            }
        }
        int uniqueCount = 0;
        for (char character : characters) {
            if (character != '\0') {
                uniqueCount++;
            }
        }
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '\0') {
                result[index] = characters[i] + " = " + frequency[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = scanner.nextLine().replaceAll("\\s", "").toLowerCase();
        String[] frequencyResult = getCharFrequencies(input);
        System.out.println("\nCharacter Frequencies:");
        for (String entry : frequencyResult) {
            System.out.println(entry);
        }
        scanner.close();
    }
}