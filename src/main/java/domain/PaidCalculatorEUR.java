package domain;

public class PaidCalculatorEUR extends PaidCalculator {
    @Override
    double getTax() {
        return 0.10;
    }

    @Override
    String getCurrency() {
        return "EUR";
    }

    @Override
    double getPercentage() {
        return 5.10;
    }

    @Override
    double calculateTotal(double amountToBought) {
        double totalWithoutTax = amountToBought * this.getPercentage();
        var taxes = this.calculateSixPercentage(totalWithoutTax);
        return totalWithoutTax + taxes;
    }
}
