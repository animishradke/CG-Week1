import java.util.Scanner;

public class calculatesum {
    public static int calculateSum(int num) {
        int total = 0;
        for (int i = 1; i <= num; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the natural number: ");
        int num = scanner.nextInt();

        int result = calculateSum(num);
        System.out.printf("The sum of numbers from 1 to %d is %d\n", num, result);

        scanner.close();
    }
}
