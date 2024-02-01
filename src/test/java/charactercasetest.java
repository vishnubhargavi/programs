package additionals;

import static org.junit.Assert.*;
import org.junit.Test;
public class charactercasetest {
    @Test
    public void testReplaceCase() {
        String inputString = "Hello World!";
        String result = charactercase.replaceCase(inputString);
        assertEquals("hELLO wORLD!", result);
    }
    @Test
    public void testReplaceCaseWithEmptyString() {
        String inputString = "";
        String result = charactercase.replaceCase(inputString);
        assertEquals("", result);
    }
    @Test
    public void testReplaceCaseWithMixedCase() {
        String inputString = "ThIs Is A MiXeD CaSe StRiNg";
        String result = charactercase.replaceCase(inputString);
        assertEquals( "tHiS iS a mIxEd cAsE sTrInG", result);
    }
    @Test
    public void testReplaceCaseWithNumbers() {
        String inputString = "String With Numbers 2468";
        String result = charactercase.replaceCase(inputString);
        assertEquals( "sTRING wITH nUMBERS 2468", result);
    }
}
