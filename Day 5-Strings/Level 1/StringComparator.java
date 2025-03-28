import java.util.Scanner;

public class StringComparator {

    public static boolean areStringsEqual(String firstText, String secondText) {
        if (firstText.length() != secondText.length()) {
            return false;
        }
        for (int i = 0; i < firstText.length(); i++) {
            if (firstText.charAt(i) != secondText.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter the first text:");
        String text1 = inputScanner.next();

        System.out.println("Enter the second text:");
        String text2 = inputScanner.next();

        boolean areEqualCustom = areStringsEqual(text1, text2);
        boolean areEqualBuiltIn = text1.equals(text2);

        System.out.println("Using custom comparison: " + areEqualCustom);
        System.out.println("Using built-in equals method: " + areEqualBuiltIn);

        if (areEqualCustom == areEqualBuiltIn) {
            System.out.println("The comparison results are consistent.");
            if (areEqualCustom) {
                System.out.println("The texts are equal.");
            } else {
                System.out.println("The texts are not equal.");
            }
        } else {
            System.out.println("The comparison results are inconsistent!");
        }

        inputScanner.close();
    }
}