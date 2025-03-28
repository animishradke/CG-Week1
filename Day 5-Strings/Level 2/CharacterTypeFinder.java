import java.util.Scanner;

public class CharacterTypeFinder {

    public static String getCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    public static String[][] findCharacters(String str) {
        int length = str.length();
        String[][] result = new String[length][2];
        for (int i = 0; i < length; i++) {
            char character = str.charAt(i);
            result[i][0] = String.valueOf(character);
            result[i][1] = getCharacterType(character);
        }
        return result;
    }

    public static void displayCharacterTable(String[][] data) {
        System.out.printf("%-10s%-20s%n", "Character", "Type");
        System.out.println("----------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s%-20s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String[][] characterData = findCharacters(inputString);
        displayCharacterTable(characterData);
        scanner.close();
    }
}