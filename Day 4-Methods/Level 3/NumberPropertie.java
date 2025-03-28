import java.util.Arrays;
import java.util.Scanner;

public class NumberPropertie {

    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] getDigitsArray(int number) {
        String numberString = String.valueOf(Math.abs(number));
        int[] digitsArray = new int[numberString.length()];
        for (int i = 0; i < numberString.length(); i++) {
            digitsArray[i] = numberString.charAt(i) - '0';
        }
        return digitsArray;
    }

    public static int[] reverseDigitsArray(int[] digitsArray) {
        int[] reversedArray = new int[digitsArray.length];
        for (int i = 0; i < digitsArray.length; i++) {
            reversedArray[i] = digitsArray[digitsArray.length - 1 - i];
        }
        return reversedArray;
    }

    public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int[] digitsArray) {
        int[] reversedArray = reverseDigitsArray(digitsArray);
        return areArraysEqual(digitsArray, reversedArray);
    }

    public static boolean isDuckNumber(int[] digitsArray) {
        for (int i = 1; i < digitsArray.length; i++) {
            if (digitsArray[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        int[] digits = getDigitsArray(inputNumber);
        System.out.println("Count of digits: " + countDigits(inputNumber));
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Reversed Digits: " + Arrays.toString(reverseDigitsArray(digits)));
        System.out.println("Is Palindrome Number? " + isPalindrome(digits));
        System.out.println("Is Duck Number? " + isDuckNumber(digits));
        scanner.close();
    }
}