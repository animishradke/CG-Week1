import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in cm: ");
        double heightCm = scanner.nextDouble();

        double heightMeters = heightCm * 0.01;
        double bmi = weight / (heightMeters * heightMeters);

        if (bmi <= 18.4) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        scanner.close();
    }
}
