package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeCalculatorTest {


    @Test
    void calcArea(){
        Shape circle = new Shape("Circle", 1, 1,1);
        Shape square = new Shape("Square", 1, 1,1);
        assertEquals(new ShapeCalculator(circle, square).mostGreaterShaper(), "The largest area is the = Circle");
    }

}