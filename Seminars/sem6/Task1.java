package Seminars.sem6;

import java.util.Arrays;
import java.util.HashSet;

public class Task1 {
    public static void main(String[] args) {
        // 1. Создайте HashSet, заполните его следующими числами: 
        // {1, 2, 3, 2, 4, 5, 6, 3}. 
        // Распечатайте содержимое данного множества.

        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(1, 100, 3, 2, 4, 5, 6, 3));

        for (Integer integer : hashSet) {
            System.out.printf("%d ", integer);
        }
    }
    
}
