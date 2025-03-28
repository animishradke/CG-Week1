public class TrigonometryCalculator {

    public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        TrigonometryCalculator calculator = new TrigonometryCalculator();
        double angle = 45.0; // Example angle in degrees
        double[] results = calculator.calculateTrigonometricFunctions(angle);

        System.out.println("Angle: " + angle + " degrees");
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
    }
}
