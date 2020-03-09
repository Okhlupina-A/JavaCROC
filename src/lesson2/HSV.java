public class HSV implements Model {
    int h;
    int s;
    int v;

    public HSV(int h, int s, int v) {
        if ((h >= 0) && (h <= 360)) {
            this.h = h;
        } else {
            throw new RuntimeException("Ошибка");
        }
        if ((s >= 0) && (s <= 100)) {
            this.s = s;
        } else {
            throw new RuntimeException("Ошибка");
        }
        if ((v >= 0) && (v <= 100)) {
            this.v = v;
        } else {
            throw new RuntimeException("Ошибка");
        }
    }

    @Override
    public int[] toRgb(Model model) {
        int h_i = (int) ((h / 60.0) % 6);
        double v_min = ((100.0 - s) * v) / 100.0;
        double a = (v - v_min) * (double) ((h % 60) / 60);
        double v_inc = v_min + a;
        double v_dec = v - a;
        int[] hsvRGB = new int[3];
        if (h_i == 0) {
            hsvRGB[0] = v;
            hsvRGB[1] = (int) v_inc;
            hsvRGB[2] = (int) v_min;
            return hsvRGB;
        }
        if (h_i == 1) {
            hsvRGB[0] = (int) v_dec;
            hsvRGB[1] = v;
            hsvRGB[2] = (int) v_min;
            return hsvRGB;
        }
        if (h_i == 2) {
            hsvRGB[0] = (int) v_min;
            hsvRGB[1] = v;
            hsvRGB[2] = (int) v_inc;
            return hsvRGB;
        }
        if (h_i == 3) {
            hsvRGB[0] = (int) v_min;
            hsvRGB[1] = (int) v_dec;
            hsvRGB[2] = (int) v;
            return hsvRGB;
        }
        if (h_i == 4) {
            hsvRGB[0] = (int) v_min;
            hsvRGB[1] = (int) v_dec;
            hsvRGB[2] = (int) v;
            return hsvRGB;
        }
        if (h_i == 5) {
            hsvRGB[0] = (int) v;
            hsvRGB[1] = (int) v_min;
            hsvRGB[2] = (int) v_dec;
            return hsvRGB;
        }
        return hsvRGB;

    }

    @Override
    public String toString() {
        return "HSV с параметрами: h = " + h + " s = " + s + " v = " + v;
    }
}
