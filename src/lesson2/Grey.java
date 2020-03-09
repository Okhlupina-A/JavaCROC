public class Grey implements Model {
    int grey;

    public Grey(int grey) {
        if ((grey >= 0) && (grey <= 255)) {
            this.grey = grey;
        } else {
            throw new RuntimeException("Ошибка");
        }
    }

    @Override
    public int[] toRgb(Model model) {
        int[] greyRGB = new int[3];
        greyRGB[0] = (grey / 8) * 3;
        greyRGB[1] = (grey / 8) * 3;
        greyRGB[2] = (grey / 8) * 2;
        return greyRGB;
    }

    @Override
    public String toString() {
        return "(8 bit) Grey со значением = " + grey;
    }
}
