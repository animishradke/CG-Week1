import java.util.Scanner;

public class MeasurementConverter {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKg(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Fahrenheit:");
        double fahrenheit = input.nextDouble();
        System.out.printf("The given %.3f in Celsius is %.3f\n", fahrenheit, convertFahrenheitToCelsius(fahrenheit));

        System.out.println("Enter the Celsius:");
        double celsius = input.nextDouble();
        System.out.printf("The given %.3f in Fahrenheit is %.3f\n", celsius, convertCelsiusToFahrenheit(celsius));

        System.out.println("Enter the pounds:");
        double pounds = input.nextDouble();
        System.out.printf("The given %.3f in kg is %.3f\n", pounds, convertPoundsToKg(pounds));

        System.out.println("Enter the kilograms:");
        double kg = input.nextDouble();
        System.out.printf("The given %.3f in pounds is %.3f\n", kg, convertKilogramsToPounds(kg));

        System.out.println("Enter the gallons:");
        double gallons = input.nextDouble();
        System.out.printf("The given %.3f in liters is %.3f\n", gallons, convertGallonsToLiters(gallons));

        System.out.println("Enter the liters:");
        double liters = input.nextDouble();
        System.out.printf("The given %.3f in gallons is %.3f\n", liters, convertLitersToGallons(liters));

        input.close();
    }
}
