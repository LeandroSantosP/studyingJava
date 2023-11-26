package domain;

public class PaidCalculatorEURWithOutIof extends PaidCalculator {
    @Override
    String getCurrency() {
        return "EUR";
    }

    private double getIof() {
        return 0.10;
    }

    @Override
    double getPercentage() {
        return 5.10;
    }
}
