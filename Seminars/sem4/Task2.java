package Seminars.sem4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Реализовать консольное приложение, которое:

        // 1. Принимает от пользователя строку вида add~text

        // 1. add~text - сохранить text в связный список.
        // 2. Если введено print~num, выводит строку из позиции num
        // в связном списке и удаляет её из списка.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        LinkedList<String> list = new LinkedList<>();
        Move(sc, list);
    }

    private static void Move(Scanner sc, LinkedList<String> list) {
        // метод делает работу программы
        while (true) {
            System.out.println("");
            String[] text = sc.nextLine().split("~");
            if (text[0].equals("add")) {
                addText(text[1], list);
                System.out.println(list.toString());
            } else if (text[0].equals("print")) {
                delText(Integer.parseInt(text[1]), list);
                System.out.println(list.toString());
            } else {
                System.out.println("Error");
            }
        }
    }

    private static void addText(String text, LinkedList<String> list) {
        // метод добавляет текст
        list.add(text);
    }

    public static void delText(int num, LinkedList<String> list) {
        // метод удаляет текст
        System.out.println(list.remove(num));
    }
}
