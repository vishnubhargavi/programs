package additionals;

import java.util.ArrayList;
import java.util.Collections;

public class reversearraylist {

    public static void main(String[] args) {
        // Creating and initializing an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Displaying the original ArrayList
        System.out.println("Original ArrayList: " + numbers);

        // Reversing the ArrayList
        Collections.reverse(numbers);

        // Displaying the reversed ArrayList
        System.out.println("Reversed ArrayList: " + numbers);
    }
}
