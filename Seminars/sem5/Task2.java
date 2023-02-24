import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        // Даны 2 строки, написать метод, который вернет true, если эти строки являются
        // изоморфными и false, если нет.
        // Строки изоморфны, если одну букву в первом слове можно заменить на некоторую
        // букву во втором слове, при этом

        // 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с
        // сохранением порядка следования.
        // (Например, add - egg изоморфны)
        // 2. буква может не меняться, а остаться такой же. (Например, note - code)

        // Пример 1:

        // Input: s = "foo", t = "bar"

        // Output: false

        // Пример 2:

        // Input: s = "paper", t = "title"

        // Output: true
        // }

        String text1 = "add";
        String text2 = "egg";
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map1 = new HashMap<>();

        boolean flag = true;
        for (int i = 0; i < text1.length(); i++) {
            if (map.containsKey(text1.charAt(i))) {
                if (text2.charAt(i) == map.get(text1.charAt(i))) {
                    continue;
                } else {
                    flag = false;
                    break;
                }
            } else {
                map.put(text1.charAt(i), text2.charAt(i));
            }
        }
        for (int i = 0; i < text2.length(); i++) {
            if (map1.containsKey(text2.charAt(i))) {
                if (text1.charAt(i) == map1.get(text2.charAt(i))) {
                    continue;
                } else {
                    flag = false;
                    break;
                }
            } else {
                map1.put(text2.charAt(i), text1.charAt(i));
            }
        }
        System.out.println(flag);
    }
}
