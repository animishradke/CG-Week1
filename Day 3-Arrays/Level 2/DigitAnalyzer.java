import java.util.Scanner;

public class DigitAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int maxDigits = 10; // Max possible digits in a number (0-9)
        int[] digits = new int[maxDigits];
        int index = 0;

        number = Math.abs(number); // Handle negative inputs

        while (number > 0 && index < maxDigits) {
            digits[index++] = number % 10;
            number /= 10;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }

        scanner.close();
    }
}
