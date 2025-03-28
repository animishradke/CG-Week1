import java.util.Scanner;

public class DigitFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] frequency = new int[10]; // Array to hold frequencies for digits 0 to 9
        int temp = Math.abs(number);   // Handle negative numbers safely

        while (temp > 0) {
            int digit = temp % 10;
            frequency[digit]++;
            temp /= 10;
        }

        System.out.println("Digit frequencies in " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " time(s)");
            }
        }

        scanner.close();
    }
}
