import java.util.Scanner;

public class HandshakeCalculator {
    public static double maxStudents(double num) {
        return (num * (num - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        double num = scanner.nextDouble();
        double handshakes = maxStudents(num);
        System.out.printf("Maximum number of handshakes are %.2f\n", handshakes);
        scanner.close();
    }
}
