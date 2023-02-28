package Seminars.sem6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        //  1. Напишите метод, который заполнит массив 
        // из 1000 элементов случайными цифрами от 0 до 100.
        // Создайте метод, в который передайте заполненный выше 
        // массив и с помощью Set вычислите процент 
        // уникальных значений в данном массиве и верните его в 
        // виде числа с плавающей запятой.
        // Для вычисления процента используйте формулу:
        // процент уникальных чисел = количество уникальных 
        // чисел * 100 / общее количество чисел в массиве.
        System.out.println(checkArray(newArray(101)));
    }

    public static ArrayList<Integer> newArray(int number) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>(1000);
        for (int i = 0; i < number; i++) {
            arrayList.add(random.nextInt(164));
        }
        return arrayList;
    }

    public static void showArray(ArrayList<Integer> newArray) {
        for (int i = 0; i < newArray.size(); i++) {
            System.out.printf("%d ", newArray.get(i));
        }
    }

    public static double checkArray(ArrayList<Integer> arrayList) {
        HashSet<Integer> hashSet = new HashSet<>(arrayList);
        return (double)hashSet.size() * 100 / arrayList.size() ;
    }
    
}
