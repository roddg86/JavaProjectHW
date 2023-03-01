package HW.hw6;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook(1, "Acer", 32, 512, "Windows", "black", false);
        Notebook notebook2 = new Notebook(2, "Acer", 32, 512, "Ubuntu", "silver", false);
        Notebook notebook3 = new Notebook(3, "Asus", 8, 128, "Ubuntu", "black", false);
        Notebook notebook4 = new Notebook(4, "Asus", 8, 256, "Windows", "silver", false);
        Notebook notebook5 = new Notebook(5, "MSI", 16, 512, "Windows", "red", false);

        // множество ноутбуков
        HashSet<Notebook> notebookSet = new HashSet<>(Arrays.asList(notebook1, notebook2,
                notebook3, notebook4, notebook5));

        for (Notebook notebook : notebookSet) {
            System.out.println(notebook);
        }
    }
}
