package HW.hw1;

import java.util.Scanner;

public class Task3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * 3. Реализовать простой калькулятор (+ - / *)
         * число
         * знак
         * число
         * ответ:
         */

        int num1 = number();
        int num2 = number();
        char op = operation();
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
        return result;
    }
}
