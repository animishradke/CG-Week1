import java.util.Scanner;

public class StringSplitter {

    public static int getStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception exception) {
            // End of string reached
        }
        return count;
    }

    public static String[] manualSplit(String text) {
        int length = getStringLength(text);
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int[] spaceIndexes = new int[spaceCount + 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[spaceCount] = length;
        String[] words = new String[spaceCount + 1];
        int start = 0;
        for (int i = 0; i <= spaceCount; i++) {
            int end = spaceIndexes[i];
            StringBuilder word = new StringBuilder();
            for (int j = start; j < end; j++) {
                word.append(text.charAt(j));
            }
            words[i] = word.toString();
            start = end + 1;
        }
        return words;
    }

    public static boolean compareArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String[] customWords = manualSplit(input);
        String[] builtInWords = input.split(" ");
        System.out.println("\nWords from manual split:");
        for (String word : customWords) {
            System.out.println(word);
        }
        System.out.println("\nWords from built-in split:");
        for (String word : builtInWords) {
            System.out.println(word);
        }
        boolean isEqual = compareArrays(customWords, builtInWords);
        System.out.println("\nDo both methods give the same result? " + isEqual);
        scanner.close();
    }
}