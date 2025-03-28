import java.util.Scanner;

public class StudentMarksReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        int[][] marks = new int[n][3];
        double[] percentages = new double[n];
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + " (Physics, Chemistry, Maths):");

            for (int j = 0; j < 3; j++) {
                marks[i][j] = scanner.nextInt();

                while (marks[i][j] < 0) {
                    System.out.print("Marks cannot be negative. Enter again: ");
                    marks[i][j] = scanner.nextInt();
                }
            }

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            if (percentages[i] >= 90) grades[i] = 'A';
            else if (percentages[i] >= 80) grades[i] = 'B';
            else if (percentages[i] >= 70) grades[i] = 'C';
            else if (percentages[i] >= 60) grades[i] = 'D';
            else grades[i] = 'F';
        }

        System.out.println("\nStudent Results:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d - Percentage: %.2f%%, Grade: %c%n", (i + 1), percentages[i], grades[i]);
        }

        scanner.close();
    }
}
