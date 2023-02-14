package Seminars.sem2;

public class Task2 {
    public static void main(String[] args) {
        /* Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
        Соколов Никитка: результат - a4b3cd2 */

        String msg = "qqqqwwweeerrttttyyyyy";
        rle(msg);
    }
    
    public static void rle(String array) {
        // метод преобразовывает строку по rle алгоритму в сложенную строку
        StringBuilder sb = new StringBuilder();
        int counter = 1;
        for (int i = 1; i < array.length(); i++) {
            if(array.charAt(i) == array.charAt(i-1)){
                counter++;
            }else{
                sb.append(array.charAt(i-1)).append(counter);
                counter = 1;
            }
        }
        sb.append(array.charAt(array.length()-1)).append(counter);
        System.out.println(sb.toString());
    }
}
