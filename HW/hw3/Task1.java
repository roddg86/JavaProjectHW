package HW.hw3;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    // Пусть дан произвольный список целых чисел,
    // удалить из него четные числа
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        genRandomArray(10, 10, list);
        showList(list);
        removeEvenNumbers(list);
        System.out.println();
        showList(list);
    }

    public static void removeEvenNumbers(ArrayList<Integer> list) {
        // удалить четные числа из списка
        for (int i = 0; i < list.size(); i++) {
            if (isEven(list.get(i))) {
                list.remove(i);
                i--; // возвращаемся на одну позицию назад
            }
        }
    }

    public static boolean isEven(int number) {
        // проверка числа на четность
        return number % 2 == 0;
    }

    private static void showList(ArrayList<Integer> list) {
        // вывод листа в консоль
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
