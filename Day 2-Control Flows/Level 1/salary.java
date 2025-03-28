import java.util.Scanner;

class cf17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        
        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();
        
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: INR " + bonus);
        } else {
            System.out.println("No bonus, as years of service is less than or equal to 5.");
        }

        System.out.print("\nEnter a number to print its multiplication table from 6 to 9: ");
        int number = scanner.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
