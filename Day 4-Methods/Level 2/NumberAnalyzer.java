import java.util.*;

public class NumberAnalyzer {

    // Check if number is positive
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Check if number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Compare first and last number in array
    public static void compare(int firstNumber, int lastNumber) {
        if (firstNumber > lastNumber) {
            System.out.println("First number is greater");
        } else if (firstNumber == lastNumber) {
            System.out.println("First number and Last number both are equal");
        } else {
            System.out.println("Last number is greater");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the number at index " + i + ":");
            numbers[i] = input.nextInt();
        }

        int firstNumber = numbers[0];
        int lastNumber = numbers[numbers.length - 1];

        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.println("The number " + numbers[i] + " is positive");
                if (isPrime(numbers[i])) {
                    System.out.println("The number " + numbers[i] + " is a prime number");
                }
            }
        }

        compare(firstNumber, lastNumber);

        input.close();
    }
}
