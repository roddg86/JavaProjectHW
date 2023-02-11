package Seminars.sem1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Как вас зовут?");
        Scanner sc = new Scanner(System.in); // открыть считывание в терминале
        String name = sc.nextLine(); // считать значение строки построчно
        sc.close(); // закрыть сканер
        System.out.println(name);

    }
}
