import java.util.Scanner;

public class SumCalculator {
    public static int recursiveSum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + recursiveSum(n - 1);
        }
    }

    public static int formulaSum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n * (n + 1)) / 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number, enter a positive number");
            scanner.close();
            return;
        }

        int recursiveResult = recursiveSum(n);
        int formulaResult = formulaSum(n);

        System.out.println("Sum using recursive method is: " + recursiveResult);
        System.out.println("Sum using formula method is: " + formulaResult);

        if (recursiveResult == formulaResult) {
            System.out.println("\nVerification: The results from both computations are correct.");
        } else {
            System.out.println("\nVerification: The results from both computations do NOT match. There might be an error.");
        }

        scanner.close();
    }
}
