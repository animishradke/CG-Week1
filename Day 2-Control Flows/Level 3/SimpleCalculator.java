import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();

        System.out.print("Enter the operation (+, -, *, /): ");
        scanner.nextLine(); // consume leftover newline
        String op = scanner.nextLine();

        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));  // fixed order
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                if (second != 0) {
                    System.out.println("Result: " + (first / second));  // fixed order and division by zero check
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }

        scanner.close();
    }
}
