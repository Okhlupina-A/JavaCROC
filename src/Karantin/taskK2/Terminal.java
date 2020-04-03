package taskK2;

import java.time.LocalTime;
import java.util.List;

/**
 * Класс Терминал позволяет:
 * выбирать цель из предложенных (методом choosePurpose);
 * на основании выбранной цели создавать Талон (методом createTalon);
 * считать количество Талонов выданных для каждой цели в отдельности.
 * <p>
 * Терминал это обычный класс, а не интерфейс, т.к. в зале визового центра
 * * может быть установлено несколько экземпляров информационных терминалов.
 */

public class Terminal {
    static List<Integer> talonCounter; // список счетчиков для целей A, B, C, D, E
    static List<String> purposesBeforeLunch; //хранит дообеденные цели
    static List<String> purposesAfterLunch; // хранит послеобеденные цели
    static LocalTime lunchTime; // устанавливает время обеда

    /**
     * Метод для выбора цели визита.
     * в зависимости от текущего времени предлагает разные цели визита,
     * прописанные в static List<String> purposesBeforeLunch и
     * в static List<String> purposesAfterLunch.
     * Пользователь выбирает цель
     * @return возвращает код выбранной цели A, B, C, D или Е
     */
    String choosePurpose() {
        return null;
    }

    /**
     * Метод для создния талона.
     *
     * @param purpose цель визита
     * @return новый экземпляр талона
     */
    Talon createTalon(String purpose) {
        return null;
    }

}
