package task3_2;

public class ChessCell {
    private static final char[] SYMBOLS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    int x = 0;
    int y = 0;

    public ChessCell(int x, int y) {
        if (((x <= 7) && (x >= 0)) && ((y <= 7) && (y >= 0))) {
            this.x = x;
            this.y = y;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static ChessCell[] convertPositions(String[] str) {
        ChessCell[] positions = new ChessCell[str.length];
        for (int i = 0; i < str.length; i++) {
            char c0 = str[i].charAt(0); // получили первый символ (буквы от a до h)
            int x = parsingSymbol(c0); // возвращает с0
            char c1 = str[i].charAt(1); // получили второй символ -  цифры
            int y = Integer.parseInt("" + c1) - 1;
            positions[i] = new ChessCell(x, y);
        }
        return positions;
    }

    private static int parsingSymbol(char c0) {
        char[] symbols = SYMBOLS;
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == c0) {
                return i;
            }
        }
        throw new IllegalArgumentException("Неверная координата" + c0);
    }

    @Override
    public String toString() {
        String str = "" + SYMBOLS[x] + (y + 1);
        return str;
    }
}
