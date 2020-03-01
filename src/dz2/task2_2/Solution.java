package task2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static task2_2.Annotation.findByPoint;

public class Solution {
    public static void main(String[] args) throws IOException {
        Annotation a1 = new Annotation("Круг", null);
        Annotation a3 = new Annotation("Круг", new Circle(0,0, 5));
        Annotation a2 = new Annotation("Прямоугольник", new BoundingBox(12, 12, 56, 83));
        Annotation[] annotations = new Annotation[]{null, a1, null, a2, null, a3};
        System.out.println("Все элементы массива annotations:");
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        System.out.println("Введите с клавиатуры координаты точки (x и y), чтобы определить в какую область она попадает");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());

        System.out.print ("Заданная точка попадает в ");
        System.out.println(findByPoint(annotations, x, y));
        System.out.println("Для сдвига фигуры введите номер аннотации в диапазоне от 0 до " +(annotations.length-1));

        int numberOfAnnotation = Integer.parseInt(reader.readLine());
        System.out.println("Введите dx (сдвиг по оси x)");
        int dx = Integer.parseInt(reader.readLine());
        System.out.println("Введите dy (сдвиг по оси y)");
        int dy = Integer.parseInt(reader.readLine());
        if ((annotations[numberOfAnnotation]!= null)&&(annotations[numberOfAnnotation].figure!= null)) {
            annotations[numberOfAnnotation].figure.move(dx, dy);
            System.out.println("Сдвинутая фигура соответствует");
            System.out.println(annotations[numberOfAnnotation]);
        } else System.out.println("В данной аннотации нет фигуры");



    }
}
