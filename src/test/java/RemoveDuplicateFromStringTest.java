package sets;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromStringTest {

    @Test
    void testRemoveDuplicates() {

        String inputString1 = "programming";
        String result1 = RemoveDuplicatesFromString.removeDuplicates(inputString1);
        assertEquals("progamin", result1);


        String inputString2 = "abcdefg";
        String result2 = RemoveDuplicatesFromString.removeDuplicates(inputString2);
        assertEquals("abcdefg", result2);


        String inputString4 = "";
        String result4 = RemoveDuplicatesFromString.removeDuplicates(inputString4);
        assertEquals("", result4);

       
        String inputString5 = "!@#$%^&*()";
        String result5 = RemoveDuplicatesFromString.removeDuplicates(inputString5);
        assertEquals("!@#$%^&*()", result5);
    }
}
