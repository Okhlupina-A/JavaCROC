package taskK2;

import java.time.LocalTime;
import java.util.List;
import java.util.Map;

/**
 * Класс Dashboard:
 * рассчитывает среднее время ожидания
 * рассчитывает время ожидания каждого талона
 * реализует очередь
 * отображает ее на Табло
 */

public class Dashboard {
    List<Window> windows; // список всех окон в визовом центре
    List<LocalTime> waitingTime;
    // список времени ожидания для каждого прошедшего талона =
    // (время, когда талону назначен N# окна - время создания талона)
    int meanDelay; // среднее время ожидания
    static Map<Talon, String> queue; //

    /**
     *Метод отображает состояние очереди в формате:
     *
     * А12 = 5 мин
     * C1 = Окно 3
     *
     * @param queue содержит все сведения о талонах и либо номер окна в формате String, либо среднее время ожидания
     */
    void showDashboard(Map<Talon, String> queue) {
    }

    /**
     * Метод добавляет новый талон в очередь, в зависимости от времени создания.
     * @param talon
     */
    void addTalonToDashboard(Talon talon) {

    }

    /**
     * Метод возвращает статус Талона.
     * @param talon
     * @return либо окно, либо время ожидания
     */
    String getStatus (Talon talon){
        return null;
    }

    /**
     * Метод удаляет талон из Dashbord
     * после того, как посетитель подошел к назначенному окну.
     * @param talon
     */
    void removeTalonFromDashboard(Talon talon){

    }

    /**
     * Метод высчитывает дельту между
     * временем, когда талону назначен N# окна
     * и временем создания талона.
     *
     * @return дельту или, если дельту нельзя найти, то 5 мин
     */
    LocalTime getWaitingTime(){
        return null;
    }

    /**
     * Метод считает среднее время ожидания.
     * @return
     */
    int calculateMeanDelay(){
        return 0;
    }



}
