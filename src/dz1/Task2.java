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
            double n = Double.parseDouble(s);
            printBytes(n);
            printBytesUpgrade(n);
        }
    }

    /**
     * Этот метод, на мой взгляд, удобнее, если потребуется добавлять новые индексы больше ТБ
     * @param number
     */
    public static void printBytesUpgrade(double number) {
        int count = 0;
        for (int i = 0; i<=5; i++){
            if (number/1024.0 < 1) break;
            number = number/1024.0;
            count ++;
        }
        if (count == 0){
            System.out.println(String.format("%.1f",number) + " B");
        }
        if (count == 1){
            System.out.println(String.format("%.1f",number) + " KB");
        }
        if (count == 2){
            System.out.println(String.format("%.1f",number) + " MB");
        }
        if (count == 3){
            System.out.println(String.format("%.1f",number) + " GB");
        }
        if (count == 4){
            System.out.println(String.format("%.1f",number) + " TB");
        }
    }

    /**
     * Метод реализован только с помощью конструкций if-else
     * @param number
     */
    public static void printBytes(double number) {
        if (number/1024.0 <1) {
            System.out.println(String.format("%.1f",number) + " B");
        } else {
            number = number / 1024;
            if (number/1024.0 < 1) {
                System.out.println(String.format("%.1f",number) + " KB");
            } else {
                number = number / 1024;
                if (number / 1024.0 <1) {
                    System.out.println(String.format("%.1f",number) + " MB");
                } else {
                    number = number / 1024;
                    if (number / 1024.0 < 1) {
                        System.out.println(String.format("%.1f",number) + " GB");
                    } else {
                        number = number / 1024;
                        if (number / 1024.0 < 1) {
                            System.out.println(String.format("%.1f",number) + " TB");
                        }
                    }
                }
            }
        }
    }
}
