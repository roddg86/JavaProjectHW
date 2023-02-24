import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Создать структуру для хранения Номеров паспортов и Фамилий сотрудников
        // организации.
        // 123456 Иванов
        // 321456 Васильев
        // 234561 Петрова
        // 234432 Иванов
        // 654321 Петрова
        // 345678 Иванов
        // Вывести данные по сотрудникам с фамилией Иванов.

        Map<Integer, String> map = new HashMap<>();

        // var mapof = Map.of(222222, "Иванов", 333333, "Петров"); // заполнение мапы
        // через of, второй способ

        Scanner sc = new Scanner(System.in, "cp866");
        while (true) {
            System.out.println("Введите фамилию: ");
            String surname = sc.next();
            if (surname.equals("q")) {
                sc.close();
                break;
            }
            System.out.println("Введите номер паспорта: ");
            Integer number = sc.nextInt();
            map.put(number, surname);
            System.out.println(map);
        }
        for (var elem : map.entrySet()) { // бежим по ключу и значению
            if (elem.getValue().equals("Иванов")) {
                System.out.println(elem.getKey() + " " + elem.getValue());
            }
        }
        System.out.println(map.containsValue("Иванов"));
    }
}
