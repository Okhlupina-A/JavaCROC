package task2_1;

public class BoundingBox implements Figure {
    double xLeftBottom, yLeftBottom, xRightTop, yRightTop;

    public BoundingBox(double xLeftBottom,
                       double yLeftBottom,
                       double xRightTop,
                       double yRightTop) {
        this.xLeftBottom = xLeftBottom;
        this.yLeftBottom = yLeftBottom;
        this.xRightTop = xRightTop;
        this.yRightTop = yRightTop;
    }

    @Override
    public String toString() {
        String fields = "0x: "+ xLeftBottom + " 0y: " + yLeftBottom +
                " 0x: "+ xRightTop + " 0y: " + yRightTop;
        return fields;
    }
}
