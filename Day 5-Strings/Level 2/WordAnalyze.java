import java.util.Scanner;

public class WordAnalyze {

    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Do nothing, just end the loop
        }
        return count;
    }

    public static String[] splitIntoWords(String text) {
        int length = getLength(text);
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

    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static int[] findShortestAndLongest(String[][] wordData) {
        int minLength = Integer.parseInt(wordData[0][1]);
        int maxLength = Integer.parseInt(wordData[0][1]);
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < wordData.length; i++) {
            int length = Integer.parseInt(wordData[i][1]);
            if (length < minLength) {
                minLength = length;
                minIndex = i;
            }
            if (length > maxLength) {
                maxLength = length;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your text: ");
        String input = scanner.nextLine();
        String[] words = splitIntoWords(input);
        String[][] wordData = getWordsWithLengths(words);
        int[] resultIndices = findShortestAndLongest(wordData);
        System.out.println("\nWord\t\tLength");
        System.out.println("------------------------");
        for (String[] row : wordData) {
            System.out.println(row[0] + "\t\t" + Integer.parseInt(row[1]));
        }
        System.out.println("\nShortest word: " + wordData[resultIndices[0]][0] + " (Length: " + wordData[resultIndices[0]][1] + ")");
        System.out.println("Longest word: " + wordData[resultIndices[1]][0] + " (Length: " + wordData[resultIndices[1]][1] + ")");
        scanner.close();
    }
}