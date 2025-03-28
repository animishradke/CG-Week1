import java.util.Scanner;

public class AbundantNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int sumOfDivisors = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        if (sumOfDivisors > number) {
            System.out.println(number + " is an Abundant number");
        } else {
            System.out.println(number + " is not an Abundant number");
        }

        input.close();
    }
}
