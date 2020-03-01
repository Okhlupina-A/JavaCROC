package task2_2;

public class BoundingBox implements Figure {
    int xLeftBottom, yLeftBottom, xRightTop, yRightTop;

    public BoundingBox(int xLeftBottom,
                       int yLeftBottom,
                       int xRightTop,
                       int yRightTop) {
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
