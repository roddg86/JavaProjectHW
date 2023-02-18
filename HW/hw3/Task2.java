package HW.hw3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {
        // Задан целочисленный список ArrayList.
        // Найти минимальное, максимальное и среднее ариф. из этого списка

        ArrayList<Integer> list = new ArrayList<>();

        genRandomArray(10, 100, list);
        showList(list);

        Double listAverege = average(list);
        Integer listMax = maxList(list);
        Integer listMin = minList(list);

        System.out.println();
        System.out.printf("Максимальное " + listMax + "\n");
        System.out.printf("Минимальное " + listMin + "\n");
        System.out.printf("Среднее арифметическое " + listAverege + "\n");
    }

    private static Integer maxList(ArrayList<Integer> list) {
        // найти максимальное число в списке
        int max = Collections.max(list);
        return max;
    }

    private static Integer minList(ArrayList<Integer> list) {
        // найти минимальное число в списке
        int min = Collections.min(list);
        return min;
    }

    public static double average(ArrayList<Integer> list) {
        // среднее ариф. из списка чисел
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / list.size();
    }

    public static void showList(ArrayList<Integer> list) {
        // вывод списка в консоль
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static ArrayList<Integer> genRandomArray(int size, int maxValue, ArrayList<Integer> list) {
        // метод генерирует список случайных чисел
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            list.add(i, rand.nextInt(maxValue));
            list.sort(null);
        }
        return list;
    }

}
