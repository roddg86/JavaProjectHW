package Seminars.sem3;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        // Заполнить список названиями планет Солнечной системы
        // в произвольном порядке с повторениями.
        // Вывести название каждой планеты и количество
        // его повторений в списке.

        ArrayList<String> WordsArr = new ArrayList<>();
        randFillList(5, WordsArr);
        System.out.println(WordsArr.toString());
        showList(WordsArr);

        // WordsArr.add("Земля");
        // WordsArr.add("Венера");
        // WordsArr.add("Марс");
        // WordsArr.add("Юпитер");
        // WordsArr.add("Уран");
        // WordsArr.add("Земля");
        // WordsArr.add("Земля");
        // WordsArr.add("Венера");
        // WordsArr.add("Венера");
        // WordsArr.add("Юпитер");
        // WordsArr.add("Юпитер");
        // WordsArr.add("Уран");
        // WordsArr.add("Уран");
        // WordsArr.add("Уран");
        // WordsArr.add("Уран");

    }

    private static void showList(ArrayList<String> list) {
        // вывод листа на экран
        int counter = 1;
        list.sort(null);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                counter++;
            } else {
                System.out.println(list.get(i - 1) + " " + counter);
                counter = 1;
            }
        }
        System.out.println(list.get(list.size() - 1) + " " + counter);
    }

    public static void randFillList(int count, ArrayList<String> list) {
        // метод заполняет список строк
        Random rand = new Random();
        String[] planets = {
                "Mercury",
                "Venus",
                "Earth",
                "Mars",
                "Jupiter",
                "Saturn",
                "Uranus",
                "Neptune"
        };
        for (int i = 0; i < count; i++)
            list.add(planets[rand.nextInt(planets.length)]);
    }
}
