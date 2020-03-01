package task2_2;

public class Annotation {
    String text;
    Figure figure;

    Annotation findByPoint (Annotation[] annotations, int x, int y) {

    }

    public Annotation(String text, Figure figure) {
        this.text = text;
        this.figure = figure;
    }

    public static void main(String[] args) {
        Annotation a1 = new Annotation("My annotation1", new Circle(0, 0, 2));
        Annotation a2 = new Annotation("My annotation2", new BoundingBox(12, 12, 56, 83));
        Annotation[] annotations = new Annotation[] {a1, a2};
        for (Annotation annotation : annotations) {
            System.out.println(annotation);

        }
        for (int i=0; i<annotations.length; i++){
            findByPOint()
        }

    }

    Annotation findByPoint (Annotation[] annotations, int x, int y){

    }

    @Override
    public String toString() {
        String fields = text + " " + figure;
        return fields;
    }
}
