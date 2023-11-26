package domain;

import domain.PaidCalculator;

public abstract class PaidCalculatorWithIof extends PaidCalculator {
    abstract double calculateIof(double amount);

}
