package Seminars.sem6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Борис", "Александр", 10, "Сиамский", "Рыжий", "Самец", 1, false);
        System.out.println(cat.toString());
        cat.makeVaccinated();
        System.out.println(cat.toString());
    }

}
