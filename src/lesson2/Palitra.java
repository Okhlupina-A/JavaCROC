/*
Лазать, летать и бегать
*/
public class Palitra {

    public static void main(String[] args) {
        Model[] palitra = new Model[]{new Rgb(123, 0, 125), new HSV(125, 25, 33), new Grey(56)};
        Model c = new Rgb(122, 0, 128);
        System.out.println(comparateModels(c, palitra));
    }

    public static Model comparateModels(Model c, Model[] palitra) {
        int[] a = c.toRgb(c);
        Model pc = palitra[0];

        double delta0 = deltaEvklid(a, palitra[0].toRgb(palitra[0]));

        for (int i = 1; i < palitra.length; i++) {
            int[] b = palitra[i].toRgb(palitra[i]);
            double delta = deltaEvklid(a, b);
            if (delta < delta0) {
                delta0 = delta;
                pc = palitra[i];
            }
        }
        return pc;
    }

    public static double deltaEvklid(int[] a, int[] b) {
        double d = Math.sqrt(((a[0] - b[0]) * (a[0] - b[0])) + ((a[1] - b[1]) * (a[1] - b[1])) + ((a[2] - b[2]) * (a[2] - b[2])));
        return d;
    }
}