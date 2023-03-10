package HW.hw2;

import java.util.Scanner;
import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Task4 {

    static Logger LOGGER;
    static {
        try (FileInputStream ins = new FileInputStream("HW/hw2/log2.config")) { // полный путь до файла с конфигами
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = Logger.getLogger(Task1.class.getName());
        } catch (Exception ignore) {
            ignore.printStackTrace();
        }
    }

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int num1 = number();
        char op = operation();
        int num2 = number();
        int result = calculated(num1, num2, op);
        System.out.println(result);

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
        LOGGER.log(Level.INFO, "Entered number " + num);
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
        LOGGER.log(Level.INFO, "Entered operation " + op);
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
        LOGGER.log(Level.INFO, "Launched calculated: Result " + result);
        return result;
    }
}
