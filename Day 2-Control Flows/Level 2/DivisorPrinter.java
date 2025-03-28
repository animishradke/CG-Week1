import java.util.Scanner;

public class DivisorPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        int i = number;

        if (number > 0 && number < 100) {
            System.out.println("Divisors of " + number + " are:");
            while (i > 0) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i--;
            }
        } else {
            System.out.println("Please enter a positive number less than 100.");
        }

        scanner.close();
    }
}
