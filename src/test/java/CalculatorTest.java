import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Test
    public void testMultiply() {
        calculator = new Calculator();
        int result = calculator.multiply(4, 5); // Assuming 'a' is 4 and 'b' is 5
        assertEquals(20, result);
    }
}