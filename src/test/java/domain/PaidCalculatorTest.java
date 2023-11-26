package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaidCalculatorTest {

    @Test
    void shouldBuyAndCalculateAmountToPaidInReals() throws Exception {
        PaidCalculator paidCalculator = new PaidCalculatorBRL();
        var output = paidCalculator.buy(100);
        assertEquals(output, "Amount to be pay in BRL = 318.00");
    }

    @Test  void shouldBuyAndCalculateAmountToPaidInEUR() throws Exception {
        PaidCalculator paidCalculator = new PaidCalculatorEUR();
        var output = paidCalculator.buy(100);
        assertEquals(output, "Amount to be pay in EUR = 561.00");
    }

}