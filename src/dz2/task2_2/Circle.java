package task2_2;

public class Circle implements Figure {
    int xCenter, yCenter, radius;

    public Circle(int xCenter, int yCenter, int radius) {
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.radius = radius;
    }

    @Override
    public String toString() {
        String fieldsOfCircle = "0x: " + xCenter + " 0y: " + yCenter + " радиус: " + radius;
        return fieldsOfCircle;
    }

    @Override
    public boolean checkPoint(int x, int y) {
        if ((x - xCenter) * (x - xCenter) <= (radius * radius - (y - yCenter) * (y - yCenter))) {
            return true;
        }
        return false;
    }

    @Override
    public void move(int dx, int dy) {
        xCenter += dx;
        yCenter += dy;

    }
}
