package HW.hw2;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        // Дана строка (получение через обычный текстовый файл!!!)

        // "фамилия":"Иванов","оценка":"5","предмет":"Математика"
        // "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

        // Написать метод(ы), который распарсит строку и, используя StringBuilder,
        // создаст строки вида:
        // Студент [фамилия] получил [оценка] по предмету [предмет].

        // Пример вывода:
        // Студент Иванов получил 5 по предмету Математика.
        // Студент Петрова получил 4 по предмету Информатика.
        // Студент Краснов получил 5 по предмету Физика.

        File file = new File("HW/hw2/readme.json");
        System.out.println(parseStr(file));
    }

    public static String parseStr(File file) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String[] arrStr = br.readLine().split("[{(\\[\\]}\\n)]");
            for (String el : arrStr) {
                if (el.length() > 1) {
                    String[] param = el.split(",");
                    String[] p1 = param[0].split(":");
                    String[] p2 = param[1].split(":");
                    String[] p3 = param[2].split(":");
                    sb.append("Студент ").append(p1[1], 1, p1[1].length() - 1).append(" получил оценку ")
                            .append(p2[1], 1, p2[1].length() - 1).append(" по предмету ")
                            .append(p3[1], 1, p3[1].length() - 1).append(".\n");
                }
            }
            return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
