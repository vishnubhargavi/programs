package additionals;
import java.util.HashMap;
import java.util.Map;

public class repeatedmorethanonce {

    public static void findRepeatedDigits(int number) {
        // Convert the number to a string for easy iteration
        String numStr = Integer.toString(number);

        // Create a HashMap to store digit frequencies
        Map<Character, Integer> digitCountMap = new HashMap<>();

        // Count the frequency of each digit
        for (char digit : numStr.toCharArray()) {
            digitCountMap.put(digit, digitCountMap.getOrDefault(digit, 0) + 1);
        }

        // Print the repeated digits
        System.out.print("Repeated digits: ");
        for (Map.Entry<Character, Integer> entry : digitCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }

        if (digitCountMap.isEmpty()) {
            System.out.println("No repeated digits found.");
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int inputNumber = 1122345566;
        findRepeatedDigits(inputNumber);
    }
}
