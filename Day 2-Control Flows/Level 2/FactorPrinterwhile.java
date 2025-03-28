import java.util.*;

class FactorPrinterWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();

        int i = number;

        if (number > 0) {
            while (i > 0) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i--;
            }
        } else {
            System.out.println("Please enter a positive number.");
        }
    }
}
