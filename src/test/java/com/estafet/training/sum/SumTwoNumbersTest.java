package DisableTest;

import DisableTest.SumTwoNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//@Disabled
public class SumTwoNumbersTest {
    private SumTwoNumbers sumTwoNumbers;

    @BeforeEach
    public void setUp() {
        sumTwoNumbers = new SumTwoNumbers();
    }

    @Disabled
    @Test
    public void addTest() {
        Assertions.assertEquals(8, sumTwoNumbers.add(3, 5));
    }

    @Test
    public void addTestNotEquals() {
        Assertions.assertNotEquals(2, sumTwoNumbers.add(3, 5));
    }
}