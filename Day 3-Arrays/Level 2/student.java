import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Input number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // b. Arrays to store marks, percentage, and grade
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // c. Input marks with validation
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            physics[i] = getValidMarks(sc, "Physics");
            chemistry[i] = getValidMarks(sc, "Chemistry");
            maths[i] = getValidMarks(sc, "Maths");

            // d. Calculate percentage
            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = total / 3.0;

            // Calculate grade
            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 75)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 40)
                grade[i] = 'D';
            else
                grade[i] = 'F';
        }

        // e. Display results
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Physics: " + physics[i]);
            System.out.println("Chemistry: " + chemistry[i]);
            System.out.println("Maths: " + maths[i]);
            System.out.printf("Percentage: %.2f%%\n", percentage[i]);
            System.out.println("Grade: " + grade[i]);
        }

        sc.close();
    }

    // Helper function to ensure valid marks
    public static int getValidMarks(Scanner sc, String subject) {
        int marks;
        while (true) {
            System.out.print(subject + " marks: ");
            marks = sc.nextInt();
            if (marks >= 0 && marks <= 100)
                return marks;
            else
                System.out.println("Invalid marks! Enter a value between 0 and 100.");
        }
    }
}
