package task4_1;

import java.io.*;
import java.nio.charset.StandardCharsets;


public class Solution {
    public static void main(String[] args) throws IOException {
        int count = 0;
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("D:/Nastya/Java в КРОК 2020/text.txt"), StandardCharsets.UTF_8))) {
            String line;

            while ((line=br.readLine()) != null) {
                String[] s = line.split(" ");
                for (String element: s) {
                    element = element.trim();
                    if (!element.isEmpty()){
                        count++;
                    }
                }
            }
            System.out.println(count);

        }

    }
}
