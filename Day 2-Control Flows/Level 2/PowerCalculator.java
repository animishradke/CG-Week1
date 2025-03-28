import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number and power: ");
        int baseNumber = scanner.nextInt();
        int exponent = scanner.nextInt();

        int result = 1;

        if (baseNumber > 0) {
            for (int i = 1; i <= exponent; i++) {
                result *= baseNumber;
            }
            System.out.println("Result: " + result);
        } else {
            System.out.println("Please enter a positive base number.");
        }

        scanner.close();
    }
}
