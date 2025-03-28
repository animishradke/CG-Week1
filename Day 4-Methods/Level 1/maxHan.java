import java.util.Scanner;

public class maxHan {
    public static double calculateMaxHandshakes(double num) {
        return (num * (num - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        double num = scanner.nextDouble();
        double handshakes = calculateMaxHandshakes(num);
        System.out.printf("The maximum number of handshakes is: %.2f\n", handshakes);
        scanner.close();
    }
}
