package Seminars.sem2;

import java.io.FileWriter;

public class Task3 {
    public static void main(String[] args) {
        // задание: записать слово TEST в файл 10 раз
        Integer n = 10;
        String text = "TEST";
        String file_name = "Seminars/sem2/1.txt";
        try {
            FileWriter writer = new FileWriter(file_name, true);
            for (int i = 0; i < n; i++) {
                writer.write(text);
            }
            writer.close();
            System.out.println("Получилось");
        } catch (Exception e) {
            System.out.println("Что то пошло не так");
        }
    }

}
