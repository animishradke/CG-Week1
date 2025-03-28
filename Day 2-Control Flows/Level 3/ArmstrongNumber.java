import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        int tempNum = number;
        int sum = 0;

        while (tempNum > 0) {
            int digit = tempNum % 10;
            sum += digit * digit * digit;
            tempNum /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }

        scanner.close();
    }
}
