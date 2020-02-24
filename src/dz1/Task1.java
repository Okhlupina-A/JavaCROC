public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[] {25, 1, -2, 4, 6, 8, 9, 14, 115, -24, 0, 19, 100};
        System.out.println("Исходный массив");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        int temp = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i] > array[array.length - 1]) && (array[i] > array[i + 1])) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        for (int i = array.length - 1; i > 0; i--) {
            if ((array[i] < array[0]) && (array[i] < array[i - 1])) {
                temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
            }
        }

        System.out.println("Результат");
        for (int j : array) {

            System.out.print(j + " ");
        }

    }
}

