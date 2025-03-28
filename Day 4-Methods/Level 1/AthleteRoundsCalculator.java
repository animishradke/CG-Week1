import java.util.Scanner;

public class AthleteRoundsCalculator {

    public static double calculateRounds(double distance, int perimeter) {
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first side of the triangle: ");
        int side1 = scanner.nextInt();

        System.out.print("Enter the second side of the triangle: ");
        int side2 = scanner.nextInt();

        System.out.print("Enter the third side of the triangle: ");
        int side3 = scanner.nextInt();

        System.out.print("Enter the total distance (in meters): ");
        int distance = scanner.nextInt();

        int perimeter = side1 + side2 + side3;
        double totalRounds = calculateRounds(distance, perimeter);

        System.out.printf("The total rounds covered by the athlete is %.2f%n", totalRounds);

        scanner.close();
    }
}
