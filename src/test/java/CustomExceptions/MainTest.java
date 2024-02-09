package CustomExceptions;
import customexceptions.Main;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainTest {
    Main main = new Main(1000);
    @Test
    public void testWithdrawal() {
        Assert.assertTrue(main.getWithdrawalStatus(240.00));
        Assert.assertEquals(760.0, main.getCurrentBalance(), 0.01);
    }

    @Test
    public void testException() {
        Exception exception = assertThrows(RuntimeException.class,
                () -> main.getWithdrawalStatus(1200.00));
        Assert.assertEquals("Insufficient balance", exception.getCause().getMessage());
    }

    @Test
    public void testWithInvalidAmount() {
        Exception exception = assertThrows(RuntimeException.class,
                () -> main.getWithdrawalStatus(-200.00));
        Assert.assertEquals("Invalid Withdrawal", exception.getCause().getMessage());
    }

}