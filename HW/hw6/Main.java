package HW.hw6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook(1, "Acer", 32, 512, "Windows 10", "black", false);
        Notebook notebook2 = new Notebook(2, "Dell", 16, 256, "Ubuntu", "silver", false);
        Notebook notebook3 = new Notebook(3, "HP", 8, 1024, "Mint", "metallic", false);
        Notebook notebook4 = new Notebook(4, "Asus", 24, 128, "Windows 11", "white", false);
        Notebook notebook5 = new Notebook(5, "MSI", 4, 2048, "Windows 7", "red", false);

        // множество ноутбуков
        HashSet<Notebook> notebookSet = new HashSet<>(Arrays.asList(notebook1, notebook2,
                notebook3, notebook4, notebook5));

        // shoWSet(selectModel(notebookSet));
        // shoWSet(selectRamType(notebookSet));
        // shoWSet(selectSsdType(notebookSet));

        System.out.println("Здравствуйте, это магазин ноутбуков!");
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        criteria();
        System.out.println(String.format("%5s", "").replace(" ", "-"));
        System.out.print("Ввод: ");
        String number = scanner();
        shoWSet(selectType(notebookSet, number));
        System.out.println(String.format("%5s", "").replace(" ", "-"));

    }

    public static void criteria() {
        // критерии выбора
        ArrayList list = new ArrayList<>();
        list.add(0, "5 - Модель");
        list.add(0, "4 - Цвет");
        list.add(0, "3 - Операционная система");
        list.add(0, "2 - Объем ЖД");
        list.add(0, "1 - ОЗУ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
    }

    public static HashSet<Notebook> virusesInstalled(HashSet<Notebook> notebookSet) {
        HashSet<Notebook> virusedNotebookSet = new HashSet<>();
        for (Notebook notebook : notebookSet) {
            notebook.makeVirusInstalled();
            virusedNotebookSet.add(notebook);
        }
        return virusedNotebookSet;
    }

    public static String scanner() {
        // Считать строку со ввода
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        // scanner.close();
        return scan;
    }

    public static void shoWSet(HashSet<Notebook> notebookSet) {
        // Вывод множества на экна
        Iterator iterator = notebookSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static HashSet<Notebook> selectType(HashSet<Notebook> notebookSet, String number) {
        // Выбрать по модели
        HashSet<Notebook> newResultSet = new HashSet<>();
        System.out.println(String.format("%5s", "").replace(" ", "-"));
        System.out.println("Конкретнее: ");
        System.out.println(String.format("%5s", "").replace(" ", "-"));
        for (Notebook notebook : notebookSet) {
            switch (number) {
                case "1":
                    String str = notebook.toString();
                    System.out.println(notebook.getRamType());

                    break;
                case "2":
                    System.out.println(notebook.getSsdType());

                    break;
                case "3":
                    System.out.println(notebook.getOsType());

                    break;
                case "4":
                    System.out.println(notebook.getColorType());

                    break;
                case "5":
                    System.out.println(notebook.getModelType());

                    break;
                default:
                    shoWSet(notebookSet);
                    break;
            }
        }
        System.out.println(String.format("%5s", "").replace(" ", "-"));
        System.out.print("Ввод: ");
        String type = scanner();
        System.out.println("Установить вирус? y - да, n - нет");
        String virus = scanner();

        System.out.println("Доступные варианты:");
        for (Notebook elem : notebookSet) {
            String str = elem.toString();
            if (str.contains(type)) {
                newResultSet.add(elem);
            }
        }
        if (virus.equals("y")) {
            virusesInstalled(newResultSet);
        } else {
            return newResultSet;
        }
        return newResultSet;
    }
}
