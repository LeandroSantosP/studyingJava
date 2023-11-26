package domain;

public class PaidCalculatorEUR extends PaidCalculator {

    @Override
    String getCurrency() {
        return "EUR";
    }

    private double getTax() {
        return 0.10;
    }

    @Override
    double getPercentage() {
        return 5.10;
    }

    @Override
    double calculateSixPercentage(double amount) {
        return amount * this.getTax();
    }
}
