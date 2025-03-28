import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }

        double[][] personData = new double[num][3];  // [weight, height, BMI]
        String[] weightStatus = new String[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter the weight (kg) for person " + (i + 1) + ": ");
            personData[i][0] = scanner.nextDouble();

            System.out.print("Enter the height (m) for person " + (i + 1) + ": ");
            personData[i][1] = scanner.nextDouble();

            // BMI = weight / (height * height)
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            double bmi = personData[i][2];

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi <= 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nBMI Results:");
        System.out.println("--------------------------------------
