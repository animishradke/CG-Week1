import java.util.Scanner;

public class GreatestFactorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        int greatestFactor = 1;  // Default if no factor other than 1 is found

        // Loop from number-1 down to 2 to find the greatest factor
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;  // Found the greatest factor, so exit loop
            }
        }

        System.out.println("Greatest factor (other than the number itself): " + greatestFactor);

        scanner.close();
    }
}
