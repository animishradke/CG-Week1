import java.util.Scanner;

public class CharacterFrequencyCounter {

    public static String[][] calculateCharacterFrequencies(String text) {
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            frequency[character]++;
        }

        int uniqueCharacterCount = 0;
        for (int count : frequency) {
            if (count > 0) {
                uniqueCharacterCount++;
            }
        }

        String[][] frequencyTable = new String[uniqueCharacterCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                frequencyTable[index][0] = Character.toString((char) i);
                frequencyTable[index][1] = Integer.toString(frequency[i]);
                index++;
            }
        }
        return frequencyTable;
    }

    public static void printFrequencyTable(String[][] frequencyTable) {
        System.out.printf("%-10s%-10s\n", "Character", "Frequency");
        System.out.println("----------------------");
        for (String[] row : frequencyTable) {
            System.out.printf("%-10s%-10s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = inputScanner.nextLine().replaceAll("\\s", "").toLowerCase();
        String[][] frequencies = calculateCharacterFrequencies(inputText);
        System.out.println("\nCharacter Frequency Table:");
        printFrequencyTable(frequencies);
        inputScanner.close();
    }
}