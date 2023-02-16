package Lectures.lec3;

import java.util.ArrayList;
import java.util.List;

public class Ex01_object {
    public static void main(String[] args) {
        Object o = 1;
        GetType(o);

        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.0, 2));
        System.out.println(Sum(1, 2.0));
        System.out.println(Sum(1.2, 2.1));

        List<Integer> list = new ArrayList<Integer>(); // <> обобщение
        list.add(1);
        list.add(123);
        // list.add("string line"); // механизм добавления строк невозможен на этапе
        // компиляции
        for (Object v : list) {
            System.out.println(v);
            // Проблема извлечения данных
        }
    }

    static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }

    // общий метод вычислени суммы на основе Object для всех типов сразу
    static Object Sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) {
            return (Object) ((Double) a + (Double) b);
        } else if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer) a + (Integer) b);
        } else
            return 0;
    }

}
