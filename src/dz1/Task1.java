public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[] {25, 1, -2, 4, 6, 8, 9, 14, 115, -24, 0, 19, 100};
        System.out.println("Исходный массив");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();


        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int indexOfMin = 0;
        int indexOfMax = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                indexOfMin = i;
                min = array[i]; // находим чему равен минимум
            }
            if (array[i] > max) {
                indexOfMax = i;
                max = array[i]; // находим максимум
            }
        }
        System.out.println("Min = " +min + " Индекс минимума = " + indexOfMin + " Max = " + max + " Индекс максимума = " + indexOfMax);

        if (indexOfMax < indexOfMin) {
            array[indexOfMax] = min;
            array[indexOfMin] = max;
            int index = indexOfMin;
            indexOfMin = indexOfMax;
            indexOfMax = index;

            for (int j = indexOfMin; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = min;

            for (int x = indexOfMax; x < array.length - 1; x++) {
                array[x] = array[x + 1];
            }
            array[array.length - 1] = max;
        } else {
            for (int j = indexOfMin; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = min;

            for (int x = indexOfMax; x < array.length - 1; x++) {
                array[x] = array[x + 1];
            }
            array[array.length - 1] = max;
        }

        System.out.println("Результат");
        for (int i : array) {

            System.out.print(i + " ");
        }
    }
}
