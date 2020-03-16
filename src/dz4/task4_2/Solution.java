package task4_2;

import com.sun.xml.internal.bind.v2.TODO;

import java.io.*;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Есть 100500 файлов с логами.
 * Структура логов:
 * первые 8 байт это цифры(long) + пробел + текстовое сообщение.
 * Объединить все логи в один файл.

 * Алгоритм:
 * Будем мержить их попарно:
 * Сначала [0]+[1] = SUM.
 * Потом в цикле SUM + [i] = SUM2
 * Удаляем файл SUM, но ссылку оставляем. В эту ссылку записываем файл SUM2.
 * Повторяем цикл.
 * НЕ ПОНИМАЮ, ПОЧЕМУ НЕ РАБОТАЕТ?
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        args = new String[4];
        args[0] = "D:/Nastya/Java в КРОК 2020/log1.txt";
        args[1] = "D:/Nastya/Java в КРОК 2020/log2.txt";
        args[2] = "D:/Nastya/Java в КРОК 2020/log3.txt";
        args[3] = "D:/Nastya/Java в КРОК 2020/log4.txt";
        File file = createSumFile(args[0], args[1]);
        file.renameTo(new File("D:/Nastya/Java в КРОК 2020/allLogs2.txt")); /*
        WTF???? Почему renameTo переименовывает файл, но путь к файлу остается с прежним именем???
        */

        for (int i = 2; i < args.length; i++) {
            File file2 = createSumFile(file.getAbsolutePath(), args[i]);
            file.delete(); // теперь ссылка file ни на что не ссылается (пустая)
            file = file2;
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

