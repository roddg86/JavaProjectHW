package Seminars.sem1;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        /*
         * Дан массив nums = [3,2,2,3] и число val = 3.
         * Если в массиве есть числа, равные заданному,
         * нужно перенести эти элементы в конец массива.
         * Таким образом, первые несколько (или все)
         * элементов массива должны быть
         * отличны от заданного, а остальные - равны ему.
         * Пример
         * 1 2 3 4 5 6 3
         * Вывод
         * 1 2 4 5 6 3 3
         */

        int[] nums = genRandomArray(10, 5);
        showArray(nums);
        showArray(sortValue(nums, 3));

    }

    public static int[] sortValue(int[] array, int value) {
        /* метод переносит заданное число в конец массива */
        int[] secArray = new int[array.length];
        int defIndex = 0; // для тех чисел которые мы не будем сортировать
        int indexVal = array.length - 1; // индексов меньше на 1 чем длинна массива, поэтому -1, для тех чисел которые
                                         // мы будем сортировать

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                secArray[indexVal] = array[i];
                indexVal--;
            } else {
                secArray[defIndex] = array[i];
                defIndex++;
            }
        }
        return secArray;

    }

    public static void showArray(int[] array) {
        /* метод выводит массив на экран */
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] genRandomArray(int size, int maxValue) {
        /* метод генерирует массив случайных чисел */
        int[] array = new int[size];

        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(maxValue);
        }
        return array;
    }

}
