import java.util.Scanner;

public class AnagramChecker {

    public static boolean isAnagram(String text1, String text2) {
        text1 = text1.replaceAll("\\s", "").toLowerCase();
        text2 = text2.replaceAll("\\s", "").toLowerCase();
        if (text1.length() != text2.length()) {
            return false;
        }
        int[] frequency1 = new int[26];
        int[] frequency2 = new int[26];
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i) - 'a']++;
            frequency2[text2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first text: ");
        String text1 = scanner.nextLine();
        System.out.print("Enter second text: ");
        String text2 = scanner.nextLine();
        if (isAnagram(text1, text2)) {
            System.out.println("✅ The texts are anagrams.");
        } else {
            System.out.println("❌ The texts are NOT anagrams.");
        }
        scanner.close();
    }
}