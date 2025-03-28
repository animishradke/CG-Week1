import java.util.Scanner;

public class NumberChecker {

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigitsArray(int num) {
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static boolean isDuckNumber(int num) {
        String numStr = String.valueOf(num);
        return numStr.contains("0");
    }

    public static boolean isArmstrong(int num) {
        int[] digits = getDigitsArray(num);
        int sum = 0;
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == num;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2 && digit != max1) {
                max2 = digit;
            }
        }
        return new int[]{max1, max2};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < min1) {
                min2 = min1;
                min1 = digit;
            } else if (digit < min2 && digit != min1) {
                min2 = digit;
            }
        }
        return new int[]{min1, min2};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int[] digits = getDigitsArray(number);

        System.out.println("Number of digits: " + countDigits(number));
        System.out.println("Duck Number: " + isDuckNumber(number));
        System.out.println("Armstrong Number: " + isArmstrong(number));

        int[] largestValues = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestValues[0] + ", Second Largest digit: " + largestValues[1]);

        int[] smallestValues = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestValues[0] + ", Second Smallest digit: " + smallestValues[1]);
    }
}
