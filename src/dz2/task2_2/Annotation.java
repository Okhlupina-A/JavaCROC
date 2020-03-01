package task2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Annotation {
    String text;
    Figure figure;


    public Annotation(String text, Figure figure) throws IOException {
        this.text = text;
        this.figure = figure;
    }

    static Annotation findByPoint(Annotation[] annotations, int x, int y) {
        for (int i = 0; i < annotations.length; i++) {
            if ((annotations[i] != null)&& (annotations[i].figure != null) && (annotations[i].figure.checkPoint(x, y))) {
                return annotations[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String fields = text + " " + figure;
        return fields;
    }
}
