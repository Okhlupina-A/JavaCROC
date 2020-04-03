package taskK2;


import java.time.LocalTime;

/**
 * Класс Талон.
 *
 */

public class Talon {
    private String purpose; // одна из букв (A, B, C, D, E), соответствующая выбранной цели визита
    private int number; // порядковый номер Талона для соответствующей цели
    private LocalTime creationTime; // время создания Талона

    public Talon(String purpose, int number, LocalTime creationTime) {
    }
}
