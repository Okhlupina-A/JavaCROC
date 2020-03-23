package taskK1_2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class SolutionK1_2 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("D:/Nastya/Java в КРОК 2020/phoneLog.txt"), "UTF-8"))
        ) {
            String line;
            ArrayList<Long> startTime = new ArrayList<Long>();
            ArrayList<Long> finishTime = new ArrayList<Long>();
            while ((line = br.readLine()) != null) {
                String[] split = line.split(","); // теперь [0] - время начала [2] - время окончания разговора
                System.out.println(Arrays.toString(split));
                long start = Long.parseLong(split[0]);
                long finish = Long.parseLong(split[1]);
                if (finish<start){
                    throw new CallEndingException("Время окончания вызова меньше времени начала");
                }
                startTime.add(start);
                finishTime.add(finish);
            }
            int count = 1;
            for (int i = 1; i < startTime.size(); i++) {
                int x = 1;
                for (int j = 0; j < i; j++) {
                    if (startTime.get(i) < finishTime.get(j)) {
                        x++;
                    }
                }
                if (x > count) {
                    count = x;
                }
            }
            System.out.println(count);

        }
    }
}
