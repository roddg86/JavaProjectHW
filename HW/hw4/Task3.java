package HW.hw4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.FileInputStream;
//import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Task3 {

    static Logger LOGGER;
    static {
        try (FileInputStream ins = new FileInputStream("HW/hw4/log2.config")) { // полный путь до файла с конфигами
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = Logger.getLogger(Task1.class.getName());
        } catch (Exception ignore) {
            ignore.printStackTrace();
        }
    }

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // В калькулятор добавьте возможность отменить последнюю операцию.
        // Пример
        // 1
        // +
        // 2
        // ответ:
        // 3
        // +
        // 4
        // ответ:
        // 7
        // Отмена
        // 3
        // *
        // 3
        // ответ:
        // 9
        // Дополнительно каскадная отмена - отмена нескольких операций

        Deque<Integer> dq = new ArrayDeque<>();
        int num1 = number();
        while (true) {
            char op = operation();
            char del = 'd';
            while (op == del) {
                System.out.println("удаленное значение: " + dq.removeLast());
                num1 = dq.peekLast();
                System.out.println("текущее значение: " + num1);
                op = operation();
            }
            int num2 = number();
            int result = calculated(num1, num2, op);
            dq.add(result);
            System.out.println(result);
            num1 = dq.peekLast();
        }
    }

    private static int number() {
        // метод считывает с клавиатуры число
        System.out.println("Введите число: ");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Ошибка попробуйте еще раз");
            scanner.next();
            num = number();
        }
        // LOGGER.log(Level.INFO, "Entered number " + num);
        return num;
    }

    private static char operation() {
        // метод считывает с клавиатуры операцию
        System.out.println("Введите операцию: ");
        char op;
        if (scanner.hasNext()) {
            op = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка, попробуйте еще раз");
            scanner.next();
            op = operation();
        }
        // LOGGER.log(Level.INFO, "Entered operation " + op);
        return op;
    }

    private static int calculated(int num1, int num2, char op) {

        // метод подсчитывает результат

        int result;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                System.out.println("Оператор не найден");
                result = calculated(num1, num2, operation());
        }
        // LOGGER.log(Level.INFO, "Launched calculated: Result " + result);
        return result;
    }
}
