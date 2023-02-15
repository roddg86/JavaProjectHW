package HW.hw2;

import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Task1 {

    static Logger LOGGER;
    static {
        try (FileInputStream ins = new FileInputStream("HW/hw2/log.config")) { // полный путь до файла с конфигами
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = Logger.getLogger(Task1.class.getName());
        } catch (Exception ignore) {
            ignore.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
        // результат после каждой итерации запишите в лог-файл.

        int[] sortArr = { 12, 6, 4, 1, 15, 10 };
        int[] x = bubbleSort(sortArr);
        showSortArray(bubbleSort(x));

    }

    public static int[] bubbleSort(int[] sortArr) {
        // алгоритм сортировки последовательным сравнении двух соседних элементов

        int swap = 0;
        for (int i = 0; i < sortArr.length - 1; i++) {
            for (int j = 0; j < sortArr.length - i - 1; j++) { // начинается с первого элемента массива до
                                                               // предпоследнего индекса
                if (sortArr[j + 1] < sortArr[j]) {
                    swap = sortArr[j]; // во временную переменную помещаем первый элемент
                    sortArr[j] = sortArr[j + 1]; // на место первого ставим второй элемент
                    sortArr[j + 1] = swap; // вместо второго элемента пишем первый из временной памяти
                }
            }
            LOGGER.log(Level.INFO, "Iteration element " + sortArr[i] + "\n");
        }

        return sortArr;
    }

    private static void showSortArray(int[] sortArr) {
        // метод выводит отсортированный массив
        for (int i = 0; i < sortArr.length; i++) {
            LOGGER.log(Level.INFO, "Sorted element " + sortArr[i]);
            //System.out.println(sortArr[i]);
        }
    }
}