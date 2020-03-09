package task3_2;

import static task3_2.ChessCell.convertPositions;

public class Horse {

    public static void checkHorseMoving(String[] str) {
        if (str.length != 0) {
            ChessCell[] p = convertPositions(str); // вернули массив позиций (x,y) в диапазоне от 0 до 7
            for (int i = 0; i < p.length - 1; i++) {
                try {
                    horseMove(p[i], p[i + 1]);
                } catch (IllegalMoveException e) {
                    System.out.println("Конь так не ходит: " + p[i] + " -> " + p[i+1]);
                    break;
                }
            }
        } else {
            System.out.println("Передан пустой массив");
        }
    }

    private static void horseMove(ChessCell p1, ChessCell p2) throws IllegalMoveException {
        int xFrom = p1.x;
        int yFrom = p1.y;
        int xTo = p2.x;
        int yTo = p2.y;
        if (!((xTo == xFrom + 2 && yTo == yFrom + 1)
                || (xTo == xFrom + 2 && yTo == yFrom - 1)
                || (xTo == xFrom - 2 && yTo == yFrom + 1)
                || (xTo == xFrom - 2 && yTo == yFrom - 1)
                || (xTo == xFrom + 1 && yTo == yFrom + 2)
                || (xTo == xFrom - 1 && yTo == yFrom + 2)
                || (xTo == xFrom + 1 && yTo == yFrom - 2)
                || (xTo == xFrom - 1 && yTo == yFrom - 2))
        ) {
            throw new IllegalMoveException();
        }
    }
}
