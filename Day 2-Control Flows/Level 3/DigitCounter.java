import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        int count = 0;
        int num = Math.abs(number);  // Handle negative numbers

        if (num == 0) {
            count = 1;  // 0 has 1 digit
        } else {
            while (num > 0) {
                num = num / 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);

        scanner.close();
    }
}
