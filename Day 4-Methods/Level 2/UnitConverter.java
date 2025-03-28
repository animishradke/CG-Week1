import java.util.Scanner;

public class UnitConverter {
    public static double convertYardsToFeet(double yards) {
        double yardsToFeet = 3;
        return yards * yardsToFeet;
    }

    public static double convertFeetToYards(double feet) {
        double feetToYards = 0.333333;
        return feet * feetToYards;
    }

    public static double convertMeterToInches(double meters) {
        double metersToInches = 39.3701;
        return meters * metersToInches;
    }

    public static double convertInchesToMeter(double inches) {
        double inchesToMeters = 0.0254;
        return inches * inchesToMeters;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inchesToCm = 2.54;
        return inches * inchesToCm;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the yards:");
        double yards = input.nextDouble();
        System.out.printf("The yards %.3f in feet is %.3f\n", yards, convertYardsToFeet(yards));

        System.out.println("Enter the feet:");
        double feet = input.nextDouble();
        System.out.printf("The feet %.3f in yards is %.3f\n", feet, convertFeetToYards(feet));

        System.out.println("Enter the meters:");
        double meters = input.nextDouble();
        System.out.printf("The meters %.3f in inches is %.3f\n", meters, convertMeterToInches(meters));

        System.out.println("Enter the inches:");
        double inches = input.nextDouble();
        System.out.printf("The inches %.3f in meters is %.3f\n", inches, convertInchesToMeter(inches));
        System.out.printf("The inches %.3f in centimeters is %.3f\n", inches, convertInchesToCentimeters(inches));

        input.close();
    }
}
