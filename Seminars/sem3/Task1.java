package Seminars.sem3;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        // Заполнить список десятью случайными числами.
        // Отсортировать список методом sort() и вывести его на экран.

        ArrayList<Integer> list = new ArrayList<>();

        list = genRandomArray(10, 100);
        System.out.println(list);

    }

    public static ArrayList<Integer> genRandomArray(int size, int maxValue) {
        /* метод генерирует список случайных чисел */
        ArrayList<Integer> list = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            list.add(i, rand.nextInt(maxValue));
            list.sort(null);
        }
        return list;
    }
}
