package sets;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {

    public static String removeDuplicates(String input) {
        // Use a LinkedHashSet to maintain order while removing duplicates
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();

        // Iterate through each character in the input string
        for (char ch : input.toCharArray()) {
            // Add the character to the LinkedHashSet
            uniqueChars.add(ch);
        }

        // Build the result string from the unique characters in the LinkedHashSet
        StringBuilder result = new StringBuilder();
        for (char ch : uniqueChars) {
            result.append(ch);
        }

        return result.toString();
    }
}
