import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    @Test
    public void testFactorialOfZero() {
        assertEquals(1, Factorial.factorial(0));
    }
    @Test
    public void testFactorialOfOne() {
        assertEquals(1, Factorial.factorial(1));
    }
    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(120, Factorial.factorial(5));
        assertEquals(362880, Factorial.factorial(9));
    }
    @Test
    public void testNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            Factorial.factorial(-1);
        });
    }
}
