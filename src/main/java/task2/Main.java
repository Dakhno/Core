package task2;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 4, 0, -5, 1, 0, 1, 9, -7, 5, 3, 3, 5, -5, 13};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(sortWithDouble(array1)));
        System.out.println(Arrays.toString(sortWithoutDouble(array1)));
    }


    private static int[] sortWithDouble(int[] array0) {
        boolean sort = true;
        while (sort) {
            sort = false;
            for (int i = 1; i < array0.length; i++) {
                if (array0[i] < array0[i - 1]) {
                    sort = true;
                    int d = array0[i];
                    array0[i] = array0[i - 1];
                    array0[i - 1] = d;
                }
            }
        }
        return array0;
    }

    private static int[] sortWithoutDouble(int[] array0) {
        sortWithDouble(array0);
        int numberDouble = 0;
        for (int i = 1; i < array0.length; i++) {
            if (array0[i] == array0[i - 1]) {
                numberDouble++;
            }
        }

        int[] arrayWithoutDouble = new int[array0.length - numberDouble];
        arrayWithoutDouble[0] = array0[0];
        int j = 0;
        for (int i = 1; i < array0.length; i++) {
            if (array0[i] == array0[i - 1]) {
                j++;
            } else {
                arrayWithoutDouble[i - j] = array0[i];
            }

        }
        return arrayWithoutDouble;
    }
}
