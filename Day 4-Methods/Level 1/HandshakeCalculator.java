import java.util.Scanner;

public class HandshakeCalculator {

    public static double calculateMaxHandshakes(double numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        double numberOfStudents = scanner.nextDouble();

        double maxHandshakes = calculateMaxHandshakes(numberOfStudents);

        System.out.printf("The maximum number of handshakes is %.2f%n", maxHandshakes);

        scanner.close();
    }
}
