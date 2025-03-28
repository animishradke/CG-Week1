import java.util.Scanner;

public class HarshadNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int num = Math.abs(number);  // Handle negative inputs safely

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }

        if (sum != 0 && number % sum == 0) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is NOT a Harshad number.");
        }

        scanner.close();
    }
}
