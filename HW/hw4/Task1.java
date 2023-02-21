package HW.hw4;

import java.util.LinkedList;

public class Task1 {

    public static void main(String[] args) {
        // Пусть дан LinkedList с несколькими элементами.
        // Реализуйте метод(не void), который вернет “перевернутый” список.

        LinkedList<Integer> list = new LinkedList<>();
        System.out.println(addElemList(list));
        System.out.println(reverseList(list));

    }

    public static LinkedList<Integer> addElemList(LinkedList<Integer> list) {
        // заполнение списка элементами
        for (int i = 0; i < 10; i++) {
            list.add(i, i);
        }
        return list;
    }

    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        // разворот списка
        LinkedList<Integer> resultList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            resultList.add(list.get(i));
        }
        return resultList;
    }

}
