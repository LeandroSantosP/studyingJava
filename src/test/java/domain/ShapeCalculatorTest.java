package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeCalculatorTest {
    @Test
    void calcArea() {
        Shape circle = new Circle(1, 1, 1);
        Shape square = new Square(1, 1, 1);
        assertEquals(new ShapeCalculator(circle, square).mostGreaterShaper(), "The largest area is the = Circle");
    }

}