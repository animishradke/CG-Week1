import java.util.Scanner;

public class FizzBuzzChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + ": FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println(i + ": Fizz");
                } else if (i % 5 == 0) {
                    System.out.println(i + ": Buzz");
                } else {
                    System.out.println(i + ": Not divisible by 3 or 5");
                }
            }
        } else {
            System.out.println("Invalid input. Please enter a positive number.");
        }

        scanner.close();
    }
}
