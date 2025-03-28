import java.util.Scanner;

public class StringOperations {

    public static String substring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compare(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String 1:");
        String inputString = scanner.next();

        System.out.println("Enter the Starting index :");
        int startIndex = scanner.nextInt();

        System.out.println("Enter the ending index :");
        int endIndex = scanner.nextInt();

        String customSubstring = substring(inputString, startIndex, endIndex);
        System.out.println("The sub is:" + customSubstring);

        String builtInSubstring = inputString.substring(startIndex, endIndex);
        System.out.println("Substring using substring(): " + builtInSubstring);

        boolean areEqual = compare(customSubstring, builtInSubstring);
        System.out.println("Are the two substrings equal? " + areEqual);

        scanner.close();
    }
}