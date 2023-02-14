package Seminars.sem2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Task3 {
    public static void main(String[] args) {
        // задание: записать слово TEST в файл 10 раз
        Integer n = 10;
        String text = "TEST";
        String file_name = "Seminars/sem2/1.txt";
        File file = new File(file_name);
        try {
            FileWriter writer = new FileWriter(file, true);
            for (int i = 0; i < n; i++) {
                writer.write(text);
                writer.write("\n");
            }
            writer.close();
            System.out.println("Получилось");
        } catch (Exception e) {
            System.out.println("Что то пошло не так");
        }

        // прочитать файл
        try {
            FileReader f = new FileReader(file);
            char[] a = new char[(int) file.length()];
            f.read(a);
            for (char c : a) {
                System.out.print(c);
            }
            f.close();
        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }

    }

}
