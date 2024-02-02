package additionals;
import additionals.arraysum;
import static org.junit.Assert.*;
import org.junit.Test;

    public class arraysumtest {

        @Test
        public void testCalculateSum() {
            int[] arr = {1, 2, 3, 4, 5};
            int expected = 15;
            assertEquals(expected, arraysum.calculateSum(arr));
        }

        @Test
        public void testCalculateSumEmptyArray() {
            int[] arr = {};
            int expected = 0;
            assertEquals(expected, arraysum.calculateSum(arr));
}
    }
