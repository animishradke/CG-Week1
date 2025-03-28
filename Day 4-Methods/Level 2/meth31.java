import java.util.*;

public class meth31 {

    public static double[] roots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - (4 * a * c);
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        }
        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return new double[0];
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values of a, b, c");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double[] Roots = roots(a, b, c);

        if (Roots.length == 0) {
            System.out.println("No roots are there");
        } else if (Roots.length == 1) {
            System.out.printf("The root of the quadratic equation is %.3f\n", Roots[0]);
        } else {
            System.out.printf("The roots of the quadratic equation are %.3f and %.3f\n", Roots[0], Roots[1]);
        }
        input.close();
    }
}
