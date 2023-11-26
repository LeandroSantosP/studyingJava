package domain;

public class PaidCalculator {
    double dollarPriceADouble;

    public PaidCalculator() {

    }
    public void setDollarPriceADouble(double dollarPriceADouble) {
        this.dollarPriceADouble = dollarPriceADouble;
    }

   public double buy(double amountToBought, String currency) {
        if(currency == null) currency = "USD";
        double totalWithoutTax = amountToBought * this.dollarPriceADouble;
        return totalWithoutTax;
    }
}
