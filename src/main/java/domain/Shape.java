package domain;
import java.lang.Math;
public class Shape {
    public String name;
    private final double side1;
    private final double side2;
    private final double side3;

    Shape(String name, double side1, double side2, double side3) {
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    double GetArea() {
        double p = (this.side1 + this.side2 + side3) / 2.0;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }
}
