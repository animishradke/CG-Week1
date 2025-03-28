import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {

    public static int[][] generateScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3];
        Random random = new Random();
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = 10 + random.nextInt(90);
            scores[i][1] = 10 + random.nextInt(90);
            scores[i][2] = 10 + random.nextInt(90);
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        int numberOfStudents = scores.length;
        double[][] results = new double[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("ID\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + "\t\t");
            }
            System.out.print((int) results[i][0] + "\t");
            System.out.print(results[i][1] + "\t");
            System.out.println(results[i][2] + "%");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        int[][] scores = generateScores(numberOfStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
        scanner.close();
    }
}