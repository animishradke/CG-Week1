import java.util.*;

public class BMICalculator {
    public static String[] BMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "OverWeight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] data = new double[10][3];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the weight of person " + (i + 1));
            data[i][0] = input.nextDouble();
            System.out.println("Enter the height (in cm) of person " + (i + 1));
            data[i][1] = input.nextDouble();
            data[i][1] *= 0.01;
            data[i][2] = data[i][0] / (data[i][1] * data[i][1]);
        }
        String[] bmiStatus = BMIStatus(data);
        for (int i = 0; i < 10; i++) {
            System.out.printf("Weight: %.3f, Height: %.3f, BMI: %.3f, Status: %s%n",
                              data[i][0], data[i][1], data[i][2], bmiStatus[i]);
        }
        input.close();
    }
}
