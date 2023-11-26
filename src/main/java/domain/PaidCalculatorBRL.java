package domain;

public class PaidCalculatorBRL extends PaidCalculator {
    @Override
    double getTax() {
        return 0.06;
    }

    @Override
    String getCurrency() {
        return "BRL";
    }

    @Override
    double getPercentage() {
        return 3.00;
    }

    @Override
    double calculateTotal(double amountToBought) {
        double totalWithoutTax = amountToBought * this.getPercentage();
        var taxes = this.calculateSixPercentage(totalWithoutTax);
        return totalWithoutTax + taxes;
    }
}
