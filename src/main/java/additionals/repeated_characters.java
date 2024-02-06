package additionals;

import java.util.HashMap;
import java.util.Map;

public class repeated_characters {

    public static void findRepeatedCharacters(String inputString) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char ch : inputString.toCharArray()) {
            // Ignore spaces
            if (ch != ' ') {
                // Increment count for each character
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);

                // Check if the character is repeated
                if (charCount.get(ch) == 2) {
                    System.out.print(ch + " ");
                }
            }
        }

        if (charCount.isEmpty()) {
            System.out.println("No repeated characters found.");
        }
    }

    public static void main(String[] args) {
        // Example usage:
        String inputStr = "programming";
        System.out.print("Repeated characters: ");
        findRepeatedCharacters(inputStr);
    }
}
