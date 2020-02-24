import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Написать метод, форматирующий и выводящий на экран заданный размер в байтах в человекочитаемом виде.
 * Пример:
 * printBytes(23) -> "23.0 B"
 * printBytes(1024) -> "1.0 KB"
 */
public class Task2 {
    public static void main(String[] args) throws IOException {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            long n = Long.parseLong(s);
            printBytesUpgrade(n);
        }
    }

    public static void printBytesUpgrade(long number) {
        int count = 0;
        double number1 = (double) number;
        String[] index = new String[]{"B", "KB", "MB", "GB", "TB", "PB", "EB"};
        // потому что в лонге 8 байт и максимальное значение 9223372036854775807. YB уже не влезет в лонг
        for (int i = 0; i<=8; i++){
            if (number1/1024.0 <1){
                System.out.println(String.format("%.1f",number1) + " " + index[count]);
                break;
            }
            number1 = number1/1024.0;
            count ++;
        }
    }

}
