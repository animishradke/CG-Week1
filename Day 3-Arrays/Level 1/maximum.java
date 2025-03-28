import java.util.Scanner;

 class arr14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10]; // Array to store values
        double total = 0.0; // To store the sum
        int index = 0; // Track the number of inputs

        System.out.println("Enter numbers (0 or negative number to stop):");
        while (true) {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();

         
            if (num <= 0) {
                break; // Exit the loop
            }
            numbers[index] = num;
            index++;

            // Break if array limit is reached
            if (index == 10) {
                break;
            }
        }

        // Display the stored numbers
        System.out.println("\nStored numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i]; // Calculate sum
        }

        // Display the total sum
        System.out.println("\nTotal sum: " + total);

        scanner.close();
    }
}
