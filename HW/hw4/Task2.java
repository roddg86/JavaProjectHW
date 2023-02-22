package HW.hw4;

import java.util.LinkedList;
import java.util.Queue;

public class Task2 {
    public static void main(String[] args) {
        // Реализуйте очередь с помощью LinkedList со следующими методами:
        // enqueue() - помещает элемент в конец очереди,
        // dequeue() - возвращает первый элемент из очереди и удаляет его,
        // first() - возвращает первый элемент из очереди, не удаляя.

        Queue<Integer> queue = new LinkedList<>();
        System.out.println(enqueue(queue, 2));
        System.out.println(enqueue(queue, 3));
        System.out.println(enqueue(queue, 4));
        System.out.println(dequeue(queue));
        enqueue(queue, 7);
        System.out.println(first(queue));

    }

    public static Queue<Integer> enqueue(Queue<Integer> queue, Integer elem) {
        // помещает элемент в конец очереди     
            queue.add(elem);
        return queue;
    }

    public static Queue<Integer> dequeue(Queue<Integer> queue) {
        // возвращает первый элемент из очереди и удаляет его   
            queue.remove();
        return queue;
    }

    public static Integer first(Queue<Integer> queue) {
        // возвращает первый элемент из очереди, не удаляя.
            Integer elem = queue.peek();
        return elem;
    }
}
