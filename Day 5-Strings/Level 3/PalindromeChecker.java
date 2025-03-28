import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeUsingArrays(String text) {
        char[] originalArray = text.toCharArray();
        char[] reversedArray = reverseCharArray(text);
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static char[] reverseCharArray(String text) {
        char[] reversedArray = new char[text.length()];
        for (int i = text.length() - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = text.charAt(i);
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String inputText = inputScanner.nextLine().replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome1 = isPalindromeIterative(inputText);
        boolean isPalindrome2 = isPalindromeRecursive(inputText, 0, inputText.length() - 1);
        boolean isPalindrome3 = isPalindromeUsingArrays(inputText);

        System.out.println("Is palindrome (iterative)? " + isPalindrome1);
        System.out.println("Is palindrome (recursive)? " + isPalindrome2);
        System.out.println("Is palindrome (using arrays)? " + isPalindrome3);

        inputScanner.close();
    }
}