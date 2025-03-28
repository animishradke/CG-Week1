import java.util.Scanner;

class StringHandling {
    public static String longest(String sentence) {
        String[] words = sentence.split(" "); 
        String longestWord = ""; // Store longest word
        
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word; 
            }
        }
        return longestWord;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String sentence = scanner.nextLine();
        
        String result = longest(sentence);
        System.out.println("The longest word is: " + result);
        
        scanner.close();
    }
}

