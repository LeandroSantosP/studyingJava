package domain;

public class PaidCalculatorBRL extends PaidCalculatorWithIof {
    @Override
    String getCurrency() {
        return "BRL";
    }

    private double getIof() {
        return 0.06;
    }

    @Override
    double getPercentage() {
        return 3.00;
    }

    @Override
    double calculateIof(double amount) {
        return amount * this.getIof();
    }

}
