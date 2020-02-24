import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        double n = Double.parseDouble(s);
        printBytes(n);
    }

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
