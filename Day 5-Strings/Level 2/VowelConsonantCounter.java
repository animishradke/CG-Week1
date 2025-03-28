import java.util.Scanner;

public class VowelConsonantCounter {

    public static String getCharacterType(char character) {
        char lowerCaseChar = Character.toLowerCase(character);
        if (lowerCaseChar >= 'a' && lowerCaseChar <= 'z') {
            if (lowerCaseChar == 'a' || lowerCaseChar == 'e' || lowerCaseChar == 'i' || lowerCaseChar == 'o' || lowerCaseChar == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static int[] countVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            String type = getCharacterType(currentChar);
            if (type.equals("Vowel")) {
                vowelCount++;
            } else if (type.equals("Consonant")) {
                consonantCount++;
            }
        }
        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = inputScanner.nextLine();
        int[] counts = countVowelsAndConsonants(inputString);
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);
        inputScanner.close();
    }
}