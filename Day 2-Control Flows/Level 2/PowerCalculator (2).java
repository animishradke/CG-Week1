import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number and power: ");
        int baseNumber = scanner.nextInt();
        int exponent = scanner.nextInt();

        int result = 1;

        while (exponent > 0) {
            result *= baseNumber;
            exponent--;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
