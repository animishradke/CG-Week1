import java.util.*;

class BonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Salary: ");
        int salary = input.nextInt();

        System.out.print("Enter the Working Years: ");
        int years = input.nextInt();

        int bonus = 0;

        if (years > 5) {
            bonus = (salary * 5) / 100; // 5% of salary
        }

        System.out.print("Bonus salary is " + bonus);
    }
}
