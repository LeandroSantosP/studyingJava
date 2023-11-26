package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaidCalculatorTest {

    @Test
    void shouldBuyAndCalculateAmountToPaidInReals() {
        PaidCalculator paidCalculator = new PaidCalculatorBRL();
        var output = paidCalculator.buy(100);
        assertEquals(output, "Amount to be pay in BRL = 318.00");
    }

    @Test
    void shouldBuyAndCalculateAmountToPaidInEUR() {
        PaidCalculator paidCalculator = new PaidCalculatorEUR();
        var output = paidCalculator.buy(100);
        assertEquals(output, "Amount to be pay in EUR = 561.00");
    }


    @Test
    void shouldBuyAndCalculateAmountToPaidInEURWithOutIof() {
        PaidCalculator paidCalculator = new PaidCalculatorEURWithOutIof();
        var output = paidCalculator.buy(100);
        assertEquals(output, "Amount to be pay in EUR = 510.00");
    }
}