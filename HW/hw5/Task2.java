package HW.hw5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task2 {

    static ArrayList<String> namesEmployee = new ArrayList<>();
    static Map<String, Integer> namesCount = new HashMap<>();

    public static void main(String[] args) {
        // Пусть дан список сотрудников:
        // Иван Иванов
        // Светлана Петрова
        // Кристина Белова
        // Анна Мусина
        // Анна Крутова
        // Иван Юрин
        // Петр Лыков
        // Павел Чернов
        // Петр Чернышов
        // Мария Федорова
        // Марина Светлова
        // Мария Савина
        // Мария Рыкова
        // Марина Лугова
        // Анна Владимирова
        // Иван Мечников
        // Петр Петин
        // Иван Ежов

        // Написать программу, которая найдет и выведет повторяющиеся имена с
        // количеством повторений.
        // Отсортировать по убыванию популярности Имени.

        String listEmployee = "Иван Иванов Светлана Петрова Кристина Белова Анна Мусина Анна Крутова Иван Юрин Петр Лыков Павел Чернов Петр Чернышов Мария Федорова Марина Светлова Мария Савина Мария Рыкова Марина Лугова Анна Владимирова Иван Мечников Петр Петин Иван Ежов";

        namesArray(listEmployee);
        namesCount(namesEmployee);
        sortedMap(namesCount);

    }

    public static void sortedMap(Map<String, Integer> namesCount) {
        // Сортировка мапы по значению
        namesCount.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }

    public static Map<String, Integer> namesCount(ArrayList<String> namesEmployee) {
        // делаем мапу имен и их количества повторений
        for (int i = 0; i < namesEmployee.size(); i++) {
            String key = namesEmployee.get(i);
            namesCount.put(key, namesCount.get(key) == null ? 1 : namesCount.get(key) + 1);
        }
        return namesCount;
    }

    public static ArrayList<String> namesArray(String listEmployee) {
        // делаем список имен сотрудников из списка сотрудников
        String[] arrayEmployee = listEmployee.split(" ");
        for (int i = 0; i < arrayEmployee.length; i += 2) {
            namesEmployee.add(arrayEmployee[i]);
        }
        return namesEmployee;
    }

}
