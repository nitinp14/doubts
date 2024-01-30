package doubts;

public class WordCounter {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence to count the number of words.";
        int wordCount = countWords(sentence);
        System.out.println("Number of words in the sentence: " + wordCount);
    }

    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }

        // Split the sentence into words based on spaces
        String[] words = sentence.split("\\s+");

        // Return the count of words
        return words.length;
    }
}
