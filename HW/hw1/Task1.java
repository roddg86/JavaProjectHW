package HW.hw1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
         * Вычислить n-угольное треугольного число(сумма чисел от 1 до n),
         * а так же n! (произведение чисел от 1 до n)
         */

        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        Integer number = sc.nextInt();
        sc.close();

        String str1 = String.format("Вы ввели число: %d", number);
        System.out.println(str1);

        int resultSum = showSumN(number);
        String str2 = String.format("Сумма чисел от 1 до %d равна %d", number, resultSum);
        System.out.println(str2);

        int resultMult = showMultN(number);
        String str3 = String.format("Произведение чисел от 1 до %d равно %d", number, resultMult);
        System.out.println(str3);
    }

    public static int showSumN(int number) {
        /* метод вычисляет сумму чисел от 1 до n */
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
        }
        return result;
    }

    public static int showMultN(int number) {
        /* метод вычисляет n! произведение чисел от 1 до n */
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
