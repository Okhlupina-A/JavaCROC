public class Rgb implements Model {
    int r;
    int g;
    int b;

    public Rgb(int r, int g, int b) {
        if ((r >= 0) && (r <= 255)) {
            this.r = r;

        } else throw new RuntimeException("Ошибка");
        if ((g >= 0) && (g <= 255)) {
            this.g = g;

        } else throw new RuntimeException("Ошибка");
        if ((b >= 0) && (b <= 255)) {
            this.b = b;

        } else throw new RuntimeException("Ошибка");
    }


    @Override
    public int[] toRgb(Model model) {
        int[] rgbRGB = new int[3];
        rgbRGB[0] = r;
        rgbRGB[1] = g;
        rgbRGB[2] = b;
        return rgbRGB;
    }

    @Override
    public String toString() {
        return "RGB с параметрами: r = " + r + " g = " + g + " b = " + b;
    }
}
