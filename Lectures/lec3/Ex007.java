package Lectures.lec3;

import java.util.Iterator;
import java.util.List;

public class Ex007 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 12, 123, 1234, 12345);
        for (int item : list) {
            System.out.println(item);
        }

        Iterator<Integer> col = list.iterator();

        while (col.hasNext()) { // пока есть следующий элемент
            System.out.println(col.next()); // дай нам следующий элемент

        }
    }
}
