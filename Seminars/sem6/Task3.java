package Seminars.sem6;

import java.util.Arrays;
import java.util.TreeSet;

public class Task3 {
    public static void main(String[] args) {
        //3. Создайте TreeSet, заполните его следующими числами: 
        // {1, 2, 3, 2, 4, 5, 6, 3}.  
        // Распечатайте содержимое данного множества

        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(1, 1000, 3000, 2, 400000000, 5, 6000000, 3));
        for (Integer integer : treeSet) {
            System.out.printf("%d ", integer);
        }
    }
    
}
