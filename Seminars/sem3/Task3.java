package Seminars.sem3;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        // Создать список типа ArrayList.
        // Поместить в него как строки, так и целые числа.
        // Пройти по списку, найти и удалить целые числа.
        ArrayList list = new ArrayList<>();
        list.add(0, 1);
        list.add(0, "hello");
        list.add(0, 2);
        list.add(0, "hi");
        list.add(0, "a");
        list.add(0, 6);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                list.remove(i);
                i--;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

}
