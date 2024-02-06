package additionals;

import java.util.HashMap;
import java.util.Map;

public class stringrotation {

    public static boolean areRotations(String str1, String str2) {
        // Check if lengths are equal and not empty
        if (str1.length() != str2.length() || str1.isEmpty() || str2.isEmpty()) {
            return false;
        }

        // Concatenate str1 with itself
        String concatenatedStr = str1 + str1;

        // Check if str2 is a substring of the concatenated string
        return concatenatedStr.contains(str2);
    }

    public static void main(String[] args) {
        // Example usage:
        String str1 = "waterbottle";
        String str2 = "erbottlewat";

        if (areRotations(str1, str2)) {
            System.out.println(str2 + " is a rotation of " + str1);
        } else {
            System.out.println(str2 + " is not a rotation of " + str1);
        }
    }
}
