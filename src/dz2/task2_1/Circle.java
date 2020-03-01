package task2_1;

public class Circle implements Figure {
    double xCenter, yCenter, radius;

    public Circle(double xCenter, double yCenter, double radius) {
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.radius = radius;
    }

    @Override
    public String toString() {
        String fieldsOfCircle = "0x: "+ xCenter + " 0y: " + yCenter + " радиус: "+ radius;
        return fieldsOfCircle;
    }
}
