import java.util.Scanner;
 class Level21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.printf("The Quotient is %d and Reminder is %d of two numbers %d and %d%n", quotient, remainder, number1, number2);

        scanner.close();
    }
}
