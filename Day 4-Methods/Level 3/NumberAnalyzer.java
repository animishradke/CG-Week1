import java.util.Arrays;
import java.util.Scanner;

public class NumberAnalyzer {

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

    public static int sumOfDigits(int[] digitsArray) {
        int sum = 0;
        for (int digit : digitsArray) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int[] digitsArray) {
        int sum = 0;
        for (int digit : digitsArray) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digitsArray) {
        int sum = sumOfDigits(digitsArray);
        return number % sum == 0;
    }

    public static int[][] getDigitFrequency(int[] digitsArray) {
        int[] frequency = new int[10];
        for (int digit : digitsArray) {
            frequency[digit]++;
        }
        int uniqueDigitCount = 0;
        for (int freq : frequency) {
            if (freq > 0) {
                uniqueDigitCount++;
            }
        }
        int[][] digitFrequencyArray = new int[uniqueDigitCount][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                digitFrequencyArray[index][0] = i;
                digitFrequencyArray[index][1] = frequency[i];
                index++;
            }
        }
        return digitFrequencyArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        int[] digits = getDigitsArray(inputNumber);
        System.out.println("Count of digits: " + countDigits(inputNumber));
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad Number? " + isHarshadNumber(inputNumber, digits));
        int[][] frequency = getDigitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int[] row : frequency) {
            System.out.println("Digit: " + row[0] + " -> Frequency: " + row[1]);
        }
        scanner.close();
    }
}