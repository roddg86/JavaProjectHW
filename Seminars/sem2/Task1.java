package Seminars.sem2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /* Дано четное число N (>0) и символы c1 и c2.
            Написать метод, который вернет строку длины N,
            которая состоит из чередующихся символов c1 и c2, начиная с c1.

            Пример:
            Ввод: 6 a b
            Вывод: ababab */

        Scanner sc = new Scanner(System.in, "cp866"); // открыть считывание в терминале
        System.out.println("Введите четное число");
        int num = sc.nextInt();
        System.out.println("Введите первый символ");
        char c1 = sc.next().charAt(0);
        System.out.println("Введите второй символ");
        char c2 = sc.next().charAt(0);
        sc.close(); // закрыть сканер
        
        System.out.println("Результат:");
        symbol(num,c1,c2);
    }

    private static void symbol(int count, char c1, char c2) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count/2; i++) {
            sb.append(c1).append(c2);
        }
        System.out.println(sb);
    }
}
