package taskK2;
/**
 * Класс Окно:
 * может менять статус с занято на свободно и свободно на занято
 * может вызывать следующий талон (т.е устанавливать статус свободно)
 *
 */

import java.time.LocalTime;

public class Window {
    private boolean isFree; // false - занято, true - свободно
    private int number; // номер окна
    private String[] purposes; // коды целей, с которыми может работать данное окно



    public Window(boolean isFree, int number, String[] purposes) {
    }

    /**
     * Метод изменяет состояние окна.
     * @param isFree меняет текущее состояние на переданное значение
     */
    void setFree(boolean isFree) {
    }

    /**
     * Метод изменяет состояние окна на true (свободен)
     */
    void callNext() {

    }
}
