package domain;

public abstract class PaidCalculator {
    abstract double getTax();
    abstract String getCurrency();
    abstract double getPercentage();
    protected double calculateSixPercentage(double amount) {
        return amount * this.getTax();
    }
    abstract double calculateTotal(double amountToBought);
    public String buy(double amountToBought) throws Exception {
        return String.format("Amount to be pay in %s = %.2f", this.getCurrency(), this.calculateTotal(amountToBought));
    }
}
