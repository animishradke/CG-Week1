import java.util.Random;

public class ZaraBonus {

    public static int[][] generateEmployeeData(int employees) {
        int[][] data = new int[employees][2]; // [salary, yearsOfService]
        Random rand = new Random();

        for (int i = 0; i < employees; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // Random 5-digit salary (10000 to 99999)
            data[i][1] = rand.nextInt(11);            // Random years of service (0 to 10)
        }

        return data;
    }

    public static double[][] calculateBonusAndNewSalary(int[][] oldData) {
        double[][] result = new double[oldData.length][2]; // [bonusAmount, newSalary]

        for (int i = 0; i < oldData.length; i++) {
            int salary = oldData[i][0];
            int years = oldData[i][1];
            double bonus = (years > 5) ? 0.05 * salary : 0.02 * salary;

            result[i][0] = bonus;
            result[i][1] = salary + bonus;
        }

        return result;
    }

    public static void displayReport(int[][] oldData, double[][] newData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("%-10s%-15s%-15s%-15s%-15s%-15s\n", "Emp ID", "Old Salary", "Years", "Bonus", "New Salary", "Bonus %");
        System.out.println("----------------------------------------------------------------------------------------");

        for (int i = 0; i < oldData.length; i++) {
            int salary = oldData[i][0];
            int years = oldData[i][1];
            double bonus = newData[i][0];
            double newSalary = newData[i][1];
            String bonusPercent = (years > 5) ? "5%" : "2%";

            System.out.printf("%-10d%-15d%-15d%-15.2f%-15.2f%-15s\n", 
                    (i + 1), salary, years, bonus, newSalary, bonusPercent);

            totalOld += salary;
            totalBonus += bonus;
            totalNew += newSalary;
        }

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("%-10s%-15.2f%-15s%-15.2f%-15.2f\n", "TOTAL", totalOld, "", totalBonus, totalNew);
    }

    public static void main(String[] args) {
        int numberOfEmployees = 10;

        int[][] employeeData = generateEmployeeData(numberOfEmployees);
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);

        displayReport(employeeData, bonusData);
    }
}
