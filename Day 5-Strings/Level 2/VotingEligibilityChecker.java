import java.util.Random;
import java.util.Scanner;

public class VotingEligibilityChecker {

    public static int[] generateAges(int numberOfPeople) {
        Random random = new Random();
        int[] ages = new int[numberOfPeople];
        for (int i = 0; i < numberOfPeople; i++) {
            ages[i] = random.nextInt(90) + 10;
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = Integer.toString(ages[i]);
            if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-15s%n", "Age", "Can Vote");
        System.out.println("-------------------------");
        for (String[] row : results) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = 10;
        int[] personAges = generateAges(numberOfPeople);
        String[][] eligibility = checkVotingEligibility(personAges);
        displayResults(eligibility);
        scanner.close();
    }
}