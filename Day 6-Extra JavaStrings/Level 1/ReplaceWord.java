 class ReplaceWord {
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        if (sentence == null || oldWord == null || newWord == null) {
            return sentence;
        }
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
        String sentence = "Java is fun. Learning Java is great!";
        String oldWord = "Java";
        String newWord = "Python";
        
        String updatedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Updated Sentence: " + updatedSentence);
    }
}