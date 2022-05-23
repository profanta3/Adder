import Adder.Adder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdderTest {

    @Test
    public void testAdderGood() {
        Adder adder = new Adder();

        int a = 4;
        int b = 2;

        int actual = adder.add(a, b);

        int expected = 6;
        assertEquals(actual, expected);
    }

}
