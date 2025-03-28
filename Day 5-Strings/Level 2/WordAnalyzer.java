import java.util.Scanner;

public class WordAnalyzer {

    public static int getStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException exception) {
            // End of string reached
        }
        return count;
    }

    public static String[] splitSentenceIntoWords(String sentence) {
        int length = getStringLength(sentence);
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (sentence.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int[] spaceIndices = new int[spaceCount + 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (sentence.charAt(i) == ' ') {
                spaceIndices[index++] = i;
            }
        }
        spaceIndices[spaceCount] = length;
        String[] words = new String[spaceCount + 1];
        int startIndex = 0;
        for (int i = 0; i <= spaceCount; i++) {
            int endIndex = spaceIndices[i];
            StringBuilder wordBuilder = new StringBuilder();
            for (int j = startIndex; j < endIndex; j++) {
                wordBuilder.append(sentence.charAt(j));
            }
            words[i] = wordBuilder.toString();
            startIndex = endIndex + 1;
        }
        return words;
    }

    public static String[][] getWordAndLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = inputScanner.nextLine();
        String[] wordsArray = splitSentenceIntoWords(inputSentence);
        String[][] wordLengthData = getWordAndLengthArray(wordsArray);

        System.out.println("\nWord\t\tLength");
        System.out.println("------------------------");
        for (String[] row : wordLengthData) {
            String word = row[0];
            int length = Integer.parseInt(row[1]);
            System.out.println(word + "\t\t" + length);
        }
        inputScanner.close();
    }
}