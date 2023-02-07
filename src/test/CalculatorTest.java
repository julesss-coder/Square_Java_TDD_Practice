import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTest {
    Calculator calculator;
    
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    // Tests for add method
    @Test
    void addTest() {
        assertEquals(4, calculator.add(2, 2));
        assertEquals(0, calculator.add(2, -2));
        assertEquals(-5, calculator.add(-2, -3));
        assertEquals(2, calculator.add(0, 2));
    }

    // Tests for squareRoot() method
    @Test
    void squareRootTest() {
        assertEquals(Math.sqrt(2), calculator.squareRoot(2));
    }

    @Test
    void exceptionSquareRootTest() {
        assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-1));
    }

    // Tests for squareRoot method
    @Test
    void squareTest() {
        assertEquals(4, calculator.square(2));
        assertEquals(0, calculator.square(0));
        assertEquals(100, calculator.square(10));
        assertEquals(1, calculator.square(1));
        assertEquals(9, calculator.square(3));
    }

    // test for an illegal argument
    @Test
    void exceptionCalculateTest() {
        assertThrows(IllegalArgumentException.class, () -> calculator.square(-1));
    }
}
