import java.util.*;

public class StudentVoteChecker {

    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] age = new int[10];

        for (int i = 0; i < age.length; i++) {
            System.out.println("Enter the age of student " + (i + 1));
            age[i] = input.nextInt();
        }

        StudentVoteChecker checker = new StudentVoteChecker();

        for (int i = 0; i < age.length; i++) {
            boolean result = checker.canStudentVote(age[i]);
            if (result) {
                System.out.println((i + 1) + " student can vote");
            } else {
                System.out.println((i + 1) + " student cannot vote");
            }
        }

        input.close();
    }
}
