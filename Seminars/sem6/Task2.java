package Seminars.sem6;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Task2 {
    public static void main(String[] args) {
        // Создайте LinkedHashSet, заполните его следующими числами: 
        // {1, 2, 3, 2, 4, 5, 6, 3}.  
        // Распечатайте содержимое данного множества.

        LinkedHashSet<Integer> LinkedhashSet = new LinkedHashSet<>(Arrays.asList(1, 1000, 3, 2, 4, 5, 6, 3));

        for (Integer integer : LinkedhashSet) {
            System.out.printf("%d ", integer);
        }
    }
    
}
