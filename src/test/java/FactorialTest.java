import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {
    @Test
    public void testFactorialOfZero() {
        Assert.assertEquals(1, Factorial.factorial(0));
    }

    @Test
    public void testFactorialOfOne() {
        Assert.assertEquals(1, Factorial.factorial(1));
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        Assert.assertEquals(120, Factorial.factorial(5));
        Assert.assertEquals(362880, Factorial.factorial(9));
    }
}
