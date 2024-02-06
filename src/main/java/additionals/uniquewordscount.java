package additionals;

import java.util.HashMap;
import java.util.Map;

public class uniquewordscount {

    public static void countUniqueWords(String inputString) {
        // Split the input string into words
        String[] words = inputString.split("\\s+");

        // Create a HashMap to store word frequencies
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Count the frequency of each word
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Count the number of unique words
        int uniqueWordCount = 0;
        for (int count : wordCountMap.values()) {
            if (count == 1) {
                uniqueWordCount++;
            }
        }

        // Print the result
        System.out.println("Number of unique words: " + uniqueWordCount);
    }

    public static void main(String[] args) {
        // Example usage:
        String inputStr = "java is a programming language and language java is versatile and popular";
        countUniqueWords(inputStr);
    }
}

