package domain;

public abstract class PaidCalculator {
    abstract String getCurrency();

    abstract double getPercentage();

    abstract double calculateSixPercentage(double amount);

    double calculateTotal(double amountToBought) {
        double totalWithoutTax = amountToBought * this.getPercentage();
        var taxes = this.calculateSixPercentage(totalWithoutTax);
        return totalWithoutTax + taxes;
    }

    public String buy(double amountToBought) {
        return String.format("Amount to be pay in %s = %.2f", this.getCurrency(), this.calculateTotal(amountToBought));
    }
}
