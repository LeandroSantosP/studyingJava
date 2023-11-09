package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Challenge02Test {
    @Test
    void itMustBePossibleToCalculatorTheTotalWithinThe50MinutesLimit() throws Exception {
        Challenge02 challenge02 = new Challenge02();

        assertEquals(challenge02.exec(30), 50);
    }
    @Test
    void itMustBePossibleToCalculatorTheTotalWithoutThe50MinutesLimit() throws Exception {
        Challenge02 challenge02 = new Challenge02();
        assertEquals(challenge02.exec(60), 70);
    }


    @Test
    void ShouldThrowAnExceptionIfMinutesInputEqual0() {
        Challenge02 challenge02 = new Challenge02();
        Exception exception = assertThrows(Exception.class, () -> {
            challenge02.exec(-1);
        });
        assertEquals("Must not be negative minutes!", exception.getMessage());
    }
}