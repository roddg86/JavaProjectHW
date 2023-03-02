import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task3 {
    public static void main(String[] args) {
        // Написать программу, определяющую правильность расстановки скобок в выражении.
        // Пример 1: a+(d*3) - истина
        // Пример 2: [a+(1*3) - ложь
        // Пример 3: [6+(3*3)] - истина
        // Пример 4: {a}[+]{(d*3)} - истина
        // Пример 5: <{a}+{(d*3)}> - истина
        // Пример 6: {a+]}{(d*3)} - ложь

        String text = "<{a}+{(d*3)}>";
        Map<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        map.put('>', '<');

        boolean flag = true;
        for (int i = 0; i < text.length(); i++) {
            if (map.containsValue(text.charAt(i))) {
                stack.push(text.charAt(i));
            }
            if (map.containsKey(text.charAt(i))) {
                if (stack.isEmpty() || map.get(text.charAt(i)) != stack.pop()) {
                    flag = false;
                    break;
                }
            }
        }
        if (!stack.isEmpty()) {
            flag = false;
        }
        System.out.println(flag);
    }
}
