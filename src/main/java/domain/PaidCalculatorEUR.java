package domain;

public class PaidCalculatorEUR extends PaidCalculatorWithIof {

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

    @Override
    double calculateIof(double amount) {
        return amount * this.getIof();
    }
}
