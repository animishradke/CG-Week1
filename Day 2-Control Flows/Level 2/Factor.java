import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 99: ");
        int number = scanner.nextInt();

        if (number > 0 && number < 100) {
            System.out.println("Factors of " + number + " (excluding itself):");
            for (int i = number - 1; i > 0; i--) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Invalid input. Number must be between 1 and 99.");
        }

        scanner.close();
    }
}
