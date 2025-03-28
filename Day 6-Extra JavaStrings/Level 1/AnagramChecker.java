import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static boolean areAnagrams(String firstString, String secondString) {
        if (firstString == null || secondString == null || firstString.length() != secondString.length()) {
            return false;
        }
        char[] firstCharArray = firstString.toCharArray();
        char[] secondCharArray = secondString.toCharArray();
        Arrays.sort(firstCharArray);
        Arrays.sort(secondCharArray);
        return Arrays.equals(firstCharArray, secondCharArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String string2 = scanner.nextLine();

        if (areAnagrams(string1, string2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
        scanner.close();
    }
}