import org.junit.Test;
import static org.junit.Assert.*;
import Strings.anagrams;
public class anagramstest {

    @Test
    public void testAnagrams() {
        String str1 = "Listen";
        String str2 = "Silent";

        // Ensure that the method correctly identifies anagrams
        assertTrue(anagrams.areAnagrams(str1, str2));
    }

    @Test
    public void testNotAnagrams() {
        String str1 = "Hello";
        String str2 = "World";

        // Ensure that the method correctly identifies non-anagrams
        assertFalse(anagrams.areAnagrams(str1, str2));
    }

    @Test
    public void testAnagramsIgnoreCase() {
        String str1 = "Listen";
        String str2 = "SILENT";

        // Ensure that the method correctly identifies anagrams regardless of case
        assertTrue(anagrams.areAnagrams(str1, str2));
    }

    @Test
    public void testAnagramsDifferentLength() {
        String str1 = "Listen";
        String str2 = "SilentWord";

        // Ensure that the method correctly handles different lengths
        assertFalse(anagrams.areAnagrams(str1, str2));
    }

    @Test
    public void testAnagramsSameLengthDifferentCharacters() {
        String str1 = "Listen";
        String str2 = "Tinsel";

        // Ensure that the method correctly handles anagrams with different characters
        assertTrue(anagrams.areAnagrams(str1, str2));
    }

    @Test
    public void testAnagramsSameCharactersDifferentOrder() {
        String str1 = "Listen";
        String str2 = "Tisnel";

        // Ensure that the method correctly handles anagrams with the same characters in a different order
        assertTrue(anagrams.areAnagrams(str1, str2));
    }

    @Test
    public void testAnagramsNullString() {
        String str1 = null;
        String str2 = "Silent";

        // Ensure that the method handles null strings gracefully
        assertFalse(anagrams.areAnagrams(str1, str2));
    }

    @Test
    public void testAnagramsEmptyString() {
        String str1 = "";
        String str2 = "Silent";

        // Ensure that the method handles empty strings gracefully
        assertFalse(anagrams.areAnagrams(str1, str2));
    }
}