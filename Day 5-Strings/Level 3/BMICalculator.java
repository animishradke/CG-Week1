import java.util.Scanner;

public class BMICalculator {

    public static String[] calculateBMIAndHealthStatus(double weightInKilograms, double heightInCentimeters) {
        double heightInMeters = heightInCentimeters / 100.0;
        double bmiValue = weightInKilograms / (heightInMeters * heightInMeters);
        String healthStatus;
        if (bmiValue < 18.5) {
            healthStatus = "Underweight";
        } else if (bmiValue < 25) {
            healthStatus = "Normal";
        } else if (bmiValue < 30) {
            healthStatus = "Overweight";
        } else {
            healthStatus = "Obese";
        }
        return new String[]{
                String.format("%.2f", heightInCentimeters),
                String.format("%.2f", weightInKilograms),
                String.format("%.2f", bmiValue),
                healthStatus
        };
    }

    public static String[][] computeBMIsForAll(double[][] personData) {
        int numberOfPersons = personData.length;
        String[][] bmiResults = new String[numberOfPersons][4];
        for (int i = 0; i < numberOfPersons; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];
            bmiResults[i] = calculateBMIAndHealthStatus(weight, height);
        }
        return bmiResults;
    }

    public static void displayBMIReport(String[][] bmiData) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-------------------------------------------------------");
        for (String[] personResult : bmiData) {
            System.out.printf("%-10s %-10s %-10s %-15s\n",
                    personResult[0], personResult[1], personResult[2], personResult[3]);
        }
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double[][] personDetails = new double[10][2];
        System.out.println("Enter height (in cm) and weight (in kg) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d:\n", i + 1);
            System.out.print(" Height (cm): ");
            personDetails[i][1] = inputScanner.nextDouble();
            System.out.print(" Weight (kg): ");
            personDetails[i][0] = inputScanner.nextDouble();
        }
        String[][] bmiReportData = computeBMIsForAll(personDetails);
        System.out.println("\nBMI Report:");
        displayBMIReport(bmiReportData);
        inputScanner.close();
    }
}