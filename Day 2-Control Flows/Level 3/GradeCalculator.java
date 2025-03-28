import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maths marks (out of 100): ");
        int maths = scanner.nextInt();

        System.out.print("Enter the physics marks (out of 100): ");
        int physics = scanner.nextInt();

        System.out.print("Enter the chemistry marks (out of 100): ");
        int chemistry = scanner.nextInt();

        int totalMarks = maths + physics + chemistry;
        int percentage = totalMarks / 3;

        if (percentage <= 39) {
            System.out.println("Total marks = " + totalMarks + " Grade = R and Remarks: Remedial standards");
        } else if (percentage >= 40 && percentage <= 49) {
            System.out.println("Total marks = " + totalMarks + " Grade = E and Remarks: Level-1, too below agency-normalized standards");
        } else if (percentage >= 50 && percentage <= 59) {
            System.out.println("Total marks = " + totalMarks + " Grade = D and Remarks: Level-1, well below agency-normalized standards");
        } else if (percentage >= 60 && percentage <= 69) {
            System.out.println("Total marks = " + totalMarks + " Grade = C and Remarks: Level-2, below but approaching agency-normalized standards");
        } else if (percentage >= 70 && percentage <= 79) {
            System.out.println("Total marks = " + totalMarks + " Grade = B and Remarks: Level-3, at agency-normalized standards");
        } else {
            System.out.println("Total marks = " + totalMarks + " Grade = A and Remarks: Level-4, above agency-normalized standards");
        }

        scanner.close();
    }
}
