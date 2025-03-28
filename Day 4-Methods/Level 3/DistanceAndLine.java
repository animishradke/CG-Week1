import java.util.Scanner;

public class DistanceAndLine {

    static double calculateEuclideanDistance(double x1Coordinate, double y1Coordinate, double x2Coordinate, double y2Coordinate) {
        return Math.sqrt(Math.pow(x2Coordinate - x1Coordinate, 2) + Math.pow(y2Coordinate - y1Coordinate, 2));
    }

    static double[] findLinearEquation(double x1Coordinate, double y1Coordinate, double x2Coordinate, double y2Coordinate) {
        double[] result = new double[2];
        double slope = (y2Coordinate - y1Coordinate) / (x2Coordinate - x1Coordinate);
        double yIntercept = y1Coordinate - slope * x1Coordinate;
        result[0] = slope;
        result[1] = yIntercept;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1 coordinate: ");
        double x1 = scanner.nextDouble();

        System.out.print("Enter y1 coordinate: ");
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2 coordinate: ");
        double x2 = scanner.nextDouble();

        System.out.print("Enter y2 coordinate: ");
        double y2 = scanner.nextDouble();

        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f\n", distance);

        if (x1 == x2) {
            System.out.println("Line is vertical. Equation: x = " + x1);
        } else {
            double[] lineEquation = findLinearEquation(x1, y1, x2, y2);
            System.out.printf("Equation of Line: y = %.2fx + %.2f\n", lineEquation[0], lineEquation[1]);
        }

        scanner.close();
    }
}