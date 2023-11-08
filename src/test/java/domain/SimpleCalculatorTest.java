package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void shouldCalculateTwoPlusTwoToEqualFour() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        var output = simpleCalculator.calcAdd(2, 2);
        assertEquals(output, 4);
    }

    @Test
    void shouldNotCalculateOnePlusTwoToEqualFour () {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        var output = simpleCalculator.calcAdd(1, 2);
        assertNotEquals(output, 4);
    }
}