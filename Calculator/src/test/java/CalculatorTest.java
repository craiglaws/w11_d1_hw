import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void canAdd(){
        assertEquals(7, calculator.add(3,4));
    }

    @Test
    public void canSubtract(){
        assertEquals(5, calculator.subtract(9,4));
    }

    @Test
    public void canMultiply(){
        assertEquals(24, calculator.multiply(3,8));
    }

    @Test
    public void canDivide(){
        assertEquals(7.5, calculator.divide(15, 2), 0.01);
    }
}
