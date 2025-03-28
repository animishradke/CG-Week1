import java.util.Scanner;

class employees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int numofEmployees = 10; 

        double[] oldsalary = new double[numofEmployees];
        double[] yearsofServices = new double[numofEmployees];
        double[] newSalary = new double[numofEmployees];
        double[] bonus = new double[numofEmployees];

        double totalOldsalary = 0, totalBonus = 0, totalNewsalary = 0;

        for (int i = 0; i < numofEmployees; i++) {
            // Input validation for salary
            while (true) {
                System.out.print("Enter the old Salary for Employee " + (i + 1) + ": ");
                oldsalary[i] = scanner.nextDouble();
                if (oldsalary[i] > 0) {
                    break; // Valid salary, exit loop
                }
                System.out.println("Invalid Salary! Please enter a positive number.");
            }
            while (true) {
                System.out.print("Enter the years of Service for Employee " + (i + 1) + ": ");
                yearsofServices[i] = scanner.nextDouble();
                if (yearsofServices[i] > 0) {
                    break; 
                }
                System.out.println("Invalid years of service! Please enter a positive number.");
            }
        }

        for (int i = 0; i < numofEmployees; i++) {
            if (yearsofServices[i] > 5) {
                bonus[i] = oldsalary[i] * 0.05; 
            } else {
                bonus[i] = oldsalary[i] * 0.02; 
            }

            newSalary[i] = oldsalary[i] + bonus[i];

            // Accumulate total values
            totalOldsalary += oldsalary[i];
            totalBonus += bonus[i];
            totalNewsalary += newSalary[i];
        }
        System.out.println("\nEmployee Salary & Bonus Details:");
        System.out.println("-------------------------------------------------");
        System.out.println("Emp#   Old Salary    Years   Bonus    New Salary");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < numofEmployees; i++) {
            System.out.printf("%-5d  %-10.2f  %-6.1f  %-7.2f  %-10.2f\n",
                    (i + 1), oldsalary[i], yearsofServices[i], bonus[i], newSalary[i]);
        }
        System.out.println("\nTotal Old Salary: $" + totalOldsalary);
        System.out.println("Total Bonus Payout: $" + totalBonus);
        System.out.println("Total New Salary Payout: $" + totalNewsalary);
        scanner.close();
    }
}
