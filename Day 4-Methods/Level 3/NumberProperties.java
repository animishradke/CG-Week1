import java.util.Scanner;

public class NumberProperties {

    public static int countTotalDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] getDigitArray(int number) {
        String numberString = String.valueOf(number);
        int[] digits = new int[numberString.length()];
        for (int i = 0; i < numberString.length(); i++) {
            digits[i] = Character.getNumericValue(numberString.charAt(i));
        }
        return digits;
    }

    public static boolean isDuck(int number) {
        String numberString = String.valueOf(number);
        return numberString.contains("0");
    }

    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigitArray(number);
        int sumOfPowers = 0;
        int power = digits.length;
        for (int digit : digits) {
            sumOfPowers += Math.pow(digit, power);
        }
        return sumOfPowers == number;
    }

    public static int[] findMaximumAndSecondMaximum(int[] digits) {
        int maximum = Integer.MIN_VALUE;
        int secondMaximum = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > maximum) {
                secondMaximum = maximum;
                maximum = digit;
            } else if (digit > secondMaximum && digit != maximum) {
                secondMaximum = digit;
            }
        }
        return new int[]{maximum, secondMaximum};
    }

    public static int[] findMinimumAndSecondMinimum(int[] digits) {
        int minimum = Integer.MAX_VALUE;
        int secondMinimum = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < minimum) {
                secondMinimum = minimum;
                minimum = digit;
            } else if (digit < secondMinimum && digit != minimum) {
                secondMinimum = digit;
            }
        }
        return new int[]{minimum, secondMinimum};
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = inputScanner.nextInt();
        inputScanner.close();

        int digitCount = countTotalDigits(number);
        System.out.println("Total Digits: " + digitCount);

        boolean isDuckNumber = isDuck(number);
        System.out.println("Is Duck Number: " + isDuckNumber);

        boolean isArmstrong = isArmstrongNumber(number);
        System.out.println("Is Armstrong Number: " + isArmstrong);

        int[] largestDigits = findMaximumAndSecondMaximum(getDigitArray(number));
        System.out.println("Largest Digit: " + largestDigits[0] + ", Second Largest Digit: " + largestDigits[1]);

        int[] smallestDigits = findMinimumAndSecondMinimum(getDigitArray(number));
        System.out.println("Smallest Digit: " + smallestDigits[0] + ", Second Smallest Digit: " + smallestDigits[1]);
    }
}