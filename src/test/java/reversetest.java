import org.junit.Test;
import Strings.reversestring;

import static org.junit.Assert.assertEquals;

public class reversetest {

    @Test
    public void testReverseSentence() {
        String inputSentence = "Java J2EE Reverse Me";
        String expectedOutput = "avaJ EE2J esreveR eM";

        String result = reversestring.reverseSentence(inputSentence);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void testReverseSentenceWithEmptyString() {
        String inputSentence = "";
        String expectedOutput = "";

        String result = reversestring.reverseSentence(inputSentence);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void testReverseSentenceWithSingleWord() {
        String inputSentence = "Hello";
        String expectedOutput = "olleH";

        String result = reversestring.reverseSentence(inputSentence);
        assertEquals(expectedOutput, result);
    }

    // Add more test cases as needed

}
