package Seminars.sem4;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Task4 {
    // элементы массива загрузить в очередь
    // и из очереди достать эти элементы
    public static void main(String[] args) {
        String[] arr = new String[] { "hi", "welcome", "java", "task", "new" };
        Queue<String> q = new LinkedList<>();
        Queue<String> q1 = new LinkedList<>(Arrays.asList(arr));
        for (int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
        }

        while (!q1.isEmpty()) {
            System.out.print(q1.remove() + " ");
        }
        System.out.println();

        Deque<String> dq = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            dq.addFirst(arr[i]);
        }

        while (!dq.isEmpty()) {
            System.out.print(dq.removeFirst() + " ");
        }
    }
}
