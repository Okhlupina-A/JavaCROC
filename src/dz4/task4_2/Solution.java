package task4_2;

import com.sun.xml.internal.bind.v2.TODO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Есть 100500 файлов с логами.
 * Структура логов:
 * первые 8 байт это цифры(long) + пробел + текстовое сообщение.
 * Объединить все логи в один файл.

 * Алгоритм:
 * Будем мержить их попарно:
 * Сначала [0]+[1] = SUM.
 * Потом в цикле (i=2...N):
 * перемещаем файл SUM во временный файл tmp (копируем с последующим удалением исходного файла, т.е. tmp = SUM)
 * SUM = tmp + [i];
 * Удаляем tmp.
 * Повторяем цикл.
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        args = new String[4];
        args[0] = "D:/Nastya/Java в КРОК 2020/log1.txt";
        args[1] = "D:/Nastya/Java в КРОК 2020/log2.txt";
        args[2] = "D:/Nastya/Java в КРОК 2020/log3.txt";
        args[3] = "D:/Nastya/Java в КРОК 2020/log4.txt";
        File merged = createSumFile(args[0], args[1]);
        for (int i = 2; i < args.length; i++) {
            Path targetPath = Paths.get("D:/Nastya/Java в КРОК 2020/allLogs2.txt");
            Files.move(merged.toPath(), targetPath);
            merged = createSumFile(targetPath.toFile().getAbsolutePath(), args[i]);
            targetPath.toFile().delete();
        }
    }


    public static File createSumFile(String fileName1, String fileName2) throws IOException {
        File allLogs = new File("D:/Nastya/Java в КРОК 2020/allLogs.txt");
        allLogs.createNewFile();


        try (BufferedReader br1 = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(fileName1), UTF_8));
             BufferedReader br2 = new BufferedReader(
                     new InputStreamReader(
                             new FileInputStream(fileName2), UTF_8));
             BufferedWriter bw = new BufferedWriter(
                     new OutputStreamWriter(
                             new FileOutputStream(allLogs), UTF_8));
        ) {
            String line1 = br1.readLine();
            String line2 = br2.readLine();

            while ((line1 != null) || (line2 != null)) {
                if (line1 == null) {
                    bw.write(line2);
                    bw.newLine();
                    line2 = br2.readLine();
                }
                if ((line2 == null) && (line1 != null)) {
                    bw.write(line1);
                    bw.newLine();
                    line1 = br1.readLine();
                }
                if ((line1 != null) && (line2 != null)) {
                    String[] s1 = line1.split(" "); // теперь в s[0] хранится время
                    String[] s2 = line2.split(" ");
                    long time1 = Long.parseLong(s1[0]);
                    long time2 = Long.parseLong(s2[0]);

                    if (time1 <= time2) {
                        bw.write(line1);
                        bw.newLine();
                        line1 = br1.readLine();
                    } else {
                        bw.write(line2);
                        bw.newLine();
                        line2 = br2.readLine();
                    }
                }
            }

        }

        return allLogs;
    }
}

