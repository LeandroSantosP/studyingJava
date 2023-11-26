package domain;

public class PaidCalculatorBRL extends PaidCalculator {
    @Override
    String getCurrency() {
        return "BRL";
    }

    private double getTax() {
        return 0.06;
    }

    @Override
    double getPercentage() {
        return 3.00;
    }

    @Override
    double calculateSixPercentage(double amount) {
        return amount * this.getTax();
    }

}
