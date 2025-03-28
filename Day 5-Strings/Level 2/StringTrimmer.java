import java.util.Scanner;

public class StringTrimmer {

    public static int[] getTrimmedIndices(String text) {
        int startIndex = 0;
        int endIndex = text.length() - 1;
        while (startIndex < text.length() && text.charAt(startIndex) == ' ') {
            startIndex++;
        }
        while (endIndex >= 0 && text.charAt(endIndex) == ' ') {
            endIndex--;
        }
        return new int[]{startIndex, endIndex};
    }

    public static String getCustomSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

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
        String inputString = inputScanner.nextLine();
        int[] trimIndices = getTrimmedIndices(inputString);
        String customTrimmedString = (trimIndices[0] <= trimIndices[1]) ?
                                     getCustomSubstring(inputString, trimIndices[0], trimIndices[1]) : "";
        String builtInTrimmedString = inputString.trim();
        boolean areEqual = areStringsEqual(customTrimmedString, builtInTrimmedString);

        System.out.println("Custom Trimmed: '" + customTrimmedString + "'");
        System.out.println("Built-in Trimmed: '" + builtInTrimmedString + "'");
        System.out.println("Are both equal? " + areEqual);
        inputScanner.close();
    }
}