package Streams;
import org.junit.Test;
import streams.CapitalizeAndSort;
import static org.junit.Assert.assertArrayEquals;

public class capitalizeandsorttest {
    @Test
    public void testCapitalizeAndSort() {
        String[] inputArray = {"elephant", "dog", "cat", "rabbit"};
        String[] expectedOutput = {"Cat", "Dog", "Elephant", "Rabbit"};

        assertArrayEquals(expectedOutput, CapitalizeAndSort.capitalizeAndSort(inputArray));
    }

    @Test
    public void testCapitalizeAndSortEmptyArray() {
        String[] inputArray = {};
        String[] expectedOutput = {};

        assertArrayEquals(expectedOutput, CapitalizeAndSort.capitalizeAndSort(inputArray));
    }

    @Test
    public void testCapitalizeAndSortSingleElementArray() {
        String[] inputArray = {"apple"};
        String[] expectedOutput = {"Apple"};

        assertArrayEquals(expectedOutput, CapitalizeAndSort.capitalizeAndSort(inputArray));
    }

    @Test
    public void testCapitalizeAndSortAlreadyCapitalized() {
        String[] inputArray = {"Cat", "Dog", "Elephant", "Rabbit"};
        String[] expectedOutput = {"Cat", "Dog", "Elephant", "Rabbit"};

        assertArrayEquals(expectedOutput, CapitalizeAndSort.capitalizeAndSort(inputArray));
    }
}