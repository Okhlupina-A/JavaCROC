package task2_1;

import java.util.Arrays;

public class Annotation {
    String text;
    Figure figure;

    public Annotation(String text, Figure figure) {
        this.text = text;
        this.figure = figure;
    }

    public static void main(String[] args) {
        Annotation a1 = new Annotation("My annotation1", new Circle(0.0, 0.0, 2.0));
        Annotation a2 = new Annotation("My annotation2", new BoundingBox(12.0, 12.0, 56.0, 89.13));
        Annotation[] annotations = new Annotation[] {a1, a2};
        for (Annotation annotation : annotations) {
            System.out.println(annotation);

        }

    }

    @Override
    public String toString() {
        String fields = text + " " + figure;
        return fields;
    }
}
