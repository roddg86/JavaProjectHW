package HW.hw6;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // множество ноутбуков
        HashSet<Notebook> notebookSet = new HashSet<>();
        notebookSet.add(new Notebook(1, "Acer", 32, 512, "Windows", "black", false));
        notebookSet.add(new Notebook(2, "Acer", 32, 512, "Ubuntu", "silver", false));
        notebookSet.add(new Notebook(3, "Asus", 8, 128, "Ubuntu", "black", false));
        notebookSet.add(new Notebook(4, "Asus", 8, 256, "Windows", "silver", false));
        notebookSet.add(new Notebook(5, "MSI", 16, 512, "Windows", "red", false));
    }
}
