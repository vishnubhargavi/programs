package sets;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.*;

class HashSetExampleTest {

    @Test
    void testCreateAndPopulateHashSet() {
        HashSet<String> stringHashSet = HashSetExample.createAndPopulateHashSet();
        assertNotNull(stringHashSet);
        assertEquals(10, stringHashSet.size());
        assertTrue(stringHashSet.contains("Apple"));
        assertTrue(stringHashSet.contains("Banana"));
        // Add more assertions as needed
    }

    @Test
    void testIterateHashSetWithIterator() {
        HashSet<String> stringHashSet = HashSetExample.createAndPopulateHashSet();
        HashSetExample.iterateHashSetWithIterator(stringHashSet);
        // Manually verify the output since printing is done to the console
    }

    @Test
    void testIterateHashSetWithForLoop() {
        HashSet<String> stringHashSet = HashSetExample.createAndPopulateHashSet();
        HashSetExample.iterateHashSetWithForLoop(stringHashSet);
        // Manually verify the output since printing is done to the console
    }

    @Test
    void testIterateHashSetWithEnhancedForLoop() {
        HashSet<String> stringHashSet = HashSetExample.createAndPopulateHashSet();
        HashSetExample.iterateHashSetWithEnhancedForLoop(stringHashSet);
        // Manually verify the output since printing is done to the console
    }
}

