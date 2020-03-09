package task3_1;

public class ChessBoard {
    private int x = 0;
    private int y = 0;

    public ChessBoard(int x, int y) {
        if (((x <= 7) && (x >= 0)) && ((y <= 7) && (y >= 0))) {
            this.x = x;
            this.y = y;
        } else throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        ChessBoard position1 = new ChessBoard(0, -7);
        System.out.println(position1);
    }

    public void setX(int x) {
        if ((x <= 7) && (x >= 0)) {
            this.x = x;
        } else throw new IllegalArgumentException();
    }

    public void setY(int y) {
        if ((y <= 7) && (y >= 0)) {
            this.y = y;
        } else throw new IllegalArgumentException();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        char[] chars = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        String str = "" + chars[x] + "" + (y+1);
        return str;
    }


}
