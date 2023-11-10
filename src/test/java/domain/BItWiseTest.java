package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BItWiseTest {


    @Test
    void test(){
        BItWise bItWise = new BItWise();
        var output = bItWise.exec(100);
        assertEquals("THE 6TH BIT IS TRUE", output);
    }
}