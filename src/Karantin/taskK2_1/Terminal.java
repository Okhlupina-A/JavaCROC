package taskK2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import static taskK2_1.Dashboard.addToDashboard;

public class Terminal {
    static int countTalonov=0;

    public static void getTalon() throws IOException {
        String purpose = choosePurpose(); // возвращает A, B, C, D или E
        LocalTime createTime = LocalTime.now();
        countTalonov++;
        Talon talon = new Talon(purpose, countTalonov, createTime, 1);
        addToDashboard(talon);

    }
    public static String choosePurpose() throws IOException {
        return null;
    }

}
