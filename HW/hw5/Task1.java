package HW.hw5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Task1 {

    static Scanner sc = new Scanner(System.in, "cp866");

    public static void main(String[] args) {
        // Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
        // что 1 человек может иметь несколько телефонов.
        // Добавить функции:
        // 1) Добавление номера
        // 2) Вывод всего

        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

        while (true) {
            System.out.println("Добавить запись: y - да, выход q");
            String enter = sc.nextLine();
            if (enter.equals("y")) {
                System.out.println("Введите ФИО: ");
                String fio = sc.nextLine();
                phoneBook.putIfAbsent(fio, newListPhone());
            } else if (enter.equals("q")) {
                sc.close();
                break;
            }
        }
        showPhoneBookLine(phoneBook);
    }

    public static ArrayList<String> newListPhone() {
        // добавление номеров
        ArrayList<String> phoneArray = new ArrayList<>();
        while (true) {
            System.out.println("Введите телефон(10 цифр):   выход q");
            String telephone = sc.nextLine();
            if (telephone.equals("q")) {
                break;
            }
            phoneArray.add(telephone);
        }
        return phoneArray;
    }

    private static void showPhoneBookLine(HashMap<String, ArrayList<String>> phoneBook) {
        // вывод всей телефонной книги
        for (var elem : phoneBook.entrySet()) {
            System.out.printf("ФИО: %s, телефоны: %s\n", elem.getKey(),
                    elem.getValue().toString().replaceAll("^\\[|\\]$", ""));
        }
    }

}
