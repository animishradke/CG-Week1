import java.util.Scanner;

public class CollinearityCheck {
    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        if (x2 - x1 == 0 || x3 - x2 == 0 || x3 - x1 == 0) {
            return (x1 == x2) && (x2 == x3); // vertical line check
        }
        double slopeAB = (double)(y2 - y1) / (x2 - x1);
        double slopeBC = (double)(y3 - y2) / (x3 - x2);
        double slopeAC = (double)(y3 - y1) / (x3 - x1);
        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates of 3 points (x1 y1 x2 y2 x3 y3):");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        boolean slopeCollinear = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean areaCollinear = areCollinearByArea(x1, y1, x2, y2, x3, y3);

        System.out.println("\nUsing Slope Method: " + (slopeCollinear ? "Collinear" : "Not Collinear"));
        System.out.println("Using Area Method : " + (areaCollinear ? "Collinear" : "Not Collinear"));
        sc.close();
    }
}
