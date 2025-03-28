import java.util.Scanner;

class StringHandler {
    public static String removeCharacter(String str, char ch) {
        if (str == null) {
            return null;
        }
        return str.replace(Character.toString(ch), "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        System.out.println("Enter the character to remove:");
        String charToRemoveStr = scanner.nextLine();
        if (charToRemoveStr.length() == 1) {
            char charToRemove = charToRemoveStr.charAt(0);
            String updatedString = removeCharacter(inputString, charToRemove);
            System.out.println("Updated:" + updatedString);
        } else {
            System.out.println("Invalid input for character to remove. Please enter a single character.");
        }
        scanner.close();
    }
}