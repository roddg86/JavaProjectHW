package HW.hw2;

public class Task3 {
    public static void main(String[] args) {
        // Напишите метод, который принимает на вход строку (String) и определяет
        // является ли строка палиндромом (возвращает boolean значение).
        String text = "tttrrruuuuuurrrttt    ,";
        Boolean result = isPalindrome(text);
        System.out.println(result);

    }

    public static boolean isPalindrome(String text) {
        // метод проверяет строку на палиндром
        // Слово или фраза, которые одинаково читаются слева направо и справа налево
        
        text = text.replaceAll("\\W", "");// удаляем все ненужное
        StringBuilder sb = new StringBuilder(text);
        sb.reverse(); // переворачиваем строку
        String invertedText = sb.toString();// присваиваем перевернутую строку

        return text.equalsIgnoreCase(invertedText);// возвращаем сравнение двух строк вне зависимости от регистра

    }

}
