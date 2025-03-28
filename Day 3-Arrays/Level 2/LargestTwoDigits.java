import java.util.Scanner;

public class LargestTwoDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] digits = new int[10]; // Max 10 digits in an int
        int index = 0;

        int num = Math.abs(number); // Handle negative input

        while (num > 0) {
            digits[index++] = num % 10;
            num /= 10;
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
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest digit: Not found (all digits are the same)");
        } else {
            System.out.println("Second largest digit: " + secondLargest);
        }

        scanner.close();
    }
}
