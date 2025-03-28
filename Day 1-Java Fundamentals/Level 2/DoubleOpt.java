import java.util.Scanner;

 class DoubleOpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        double result1 = a + b * c;  // Multiplication (*) first, then Addition (+)
        double result2 = a * b + c;  // Multiplication (*) first, then Addition (+)
        double result3 = c + a / b;  // Division (/) first, then Addition (+)
        double result4 = a % b + c;  // Modulus (%) first, then Addition (+)
        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f%n", result1, result2, result3, result4);
        scanner.close();
    }
}
