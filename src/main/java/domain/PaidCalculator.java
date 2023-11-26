package domain;

public abstract class PaidCalculator {
    abstract String getCurrency();
    abstract double getPercentage();

    double calculateTotal(double amountToBought) {
        double totalWithoutTax = amountToBought * this.getPercentage();
        double taxes = 0;
        if(this instanceof PaidCalculatorWithIof) {
            taxes += ((PaidCalculatorWithIof) this).calculateIof(totalWithoutTax);
        }
        return totalWithoutTax + taxes;
    }

    public String buy(double amountToBought) {
        return String.format("Amount to be pay in %s = %.2f", this.getCurrency(), this.calculateTotal(amountToBought));
    }
}
