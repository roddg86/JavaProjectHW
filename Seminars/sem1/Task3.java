package Seminars.sem1;

//import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
         * Считать фразу и переставить слова в
         * обратном порядке.
         */

        System.out.println("Введите фразу: ");
        Scanner sc = new Scanner(System.in, "cp866"); // открыть считывание в терминале
        String phrase = sc.nextLine(); // считать значение строки построчно
        sc.close(); // закрыть сканер

        System.out.println(phrase);

        String[] words = phrase.split(" ");

        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }

        // String out = Arrays.toString(words);
        System.out.println(String.join(" ", words));
    }

}
