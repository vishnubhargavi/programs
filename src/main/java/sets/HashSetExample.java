package sets;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static HashSet<String> createAndPopulateHashSet() {
        // Create a HashSet of Strings
        HashSet<String> stringHashSet = new HashSet<>();

        // Add 10 strings to the HashSet
        stringHashSet.add("Apple");
        stringHashSet.add("Banana");
        stringHashSet.add("Cherry");
        stringHashSet.add("Date");
        stringHashSet.add("Elderberry");
        stringHashSet.add("Fig");
        stringHashSet.add("Grapes");
        stringHashSet.add("Honeydew");
        stringHashSet.add("Iguana");
        stringHashSet.add("Jackfruit");

        return stringHashSet;
    }

    public static void iterateHashSetWithIterator(HashSet<String> set) {
        // Iterate using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void iterateHashSetWithForLoop(HashSet<String> set) {
        // Iterate using for loop
        System.out.println("\nUsing for loop:");
        for (String str : set) {
            System.out.println(str);
        }
    }

    public static void iterateHashSetWithEnhancedForLoop(HashSet<String> set) {
        // Iterate using enhanced for loop
        System.out.println("\nUsing enhanced for loop:");
        Object[] stringArray = set.toArray();
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }
}


