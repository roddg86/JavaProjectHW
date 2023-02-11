package HW.hw1;

public class Task2 {
    public static void main(String[] args) {
        /* Вывести все простые числа от 1 до 1000 */

        showPrimeNumber(1000);
    }

    public static void showPrimeNumber(int number) {
        /* метод выводит простые числа */
        for (int i = 2; i < number; i++) {
            if (isPrimeNumber(i))
                System.out.println(i);
        }
    }

    // public static boolean isPrimeNumber(int number) {
    // // метод проверяет число на простоту перебором множителей
    // boolean isPrime = true;
    // if (number < 2) {
    // isPrime = false;
    // }
    // for (int i = 2; i < number; i++) {
    // if (number % i == 0) { // если остаток от деления числа на само себя равен 0
    // isPrime = false; // значит оно не простое
    // }
    // }
    // return isPrime;
    // }

    public static boolean isPrimeNumber(int number) {
        // оптимизированный алгоритм который проверяет гораздо меньше чисел
        boolean isPrime = true;
        if (number < 2) {
            isPrime = false;
        }
        if (number % 2 == 0) {
            return number == 2;
        }
        if (number % 3 == 0) {
            return number == 3;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}
