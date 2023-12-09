package domain;

public class PaidCalculatorEURWithOutIof extends PaidCalculator {
    @Override
    String getCurrency() {
        return "EUR";
    }
    @Override
    double getPercentage() {
        return 5.10;
    }
}
