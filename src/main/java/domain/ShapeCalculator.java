package domain;


public class ShapeCalculator {
    private final Shape shapeOne;
    private final Shape shapeTwo;

    ShapeCalculator(Shape shapeOne, Shape shapeTwo) {
        this.shapeOne = shapeOne;
        this.shapeTwo = shapeTwo;
        System.out.println(this.shapeOne.GetArea());
        System.out.println(this.shapeTwo.GetArea());
    }

    String mostGreaterShaper() {
        if(this.shapeTwo.GetArea() > this.shapeOne.GetArea()) {
            return String.format("The largest area is the = %s", this.shapeTwo.name);
        } else  {
            return String.format("The largest area is the = %s", this.shapeOne.name);
        }
    }
}
