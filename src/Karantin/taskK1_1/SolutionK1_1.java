package taskK1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class SolutionK1_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        line = line.toLowerCase();
        char[] chars = line.toCharArray();
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};
        ArrayList<Character> vowelsInWord = new ArrayList<Character>();
        int[] position = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            for (char e : vowels) {
                if (chars[i] == e) {
                    position[i] = i;
                    vowelsInWord.add(chars[i]); //записали гласные из исходного слова
                    break;
                } else {
                    position[i] = -1;

                }
            }
        }
        Collections.reverse(vowelsInWord); // гласные в обратном порядке
        int j = 0;
        for (int i = 0; i < position.length; i++) {
            if (position[i] != -1) {
                chars[i] = vowelsInWord.get(j);
                j++;
            }
        }

        System.out.println(Arrays.toString(chars));

    }
}
