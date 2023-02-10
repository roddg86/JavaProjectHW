package Lectures.lec1;

//import java.util.Scanner;

/* 
 * 
 * многострочный 
 * комментарий
 * 
 */
public class Programs {
    public static void main(String[] args) {
        System.out.println("Hi Java"); // классический комментарий

        // String s = " 2";
        // System.out.println(s);

        // int a = 123;
        // System.out.println(a); // 123
        // double d = 123.456;
        // System.out.println(d); // 123.456
        // System.out.println(getType(a)); // Integer
        // System.out.println(getType(d)); // Double
        // d = 1022;
        // System.out.println(d); // 1022
        // d = "mistake";
        // error: incompatible types:
        // String cannot be converted to double

        // int c = 123;
        // c = c-- - --c;
        // System.out.println(c);

        // // логические операции

        // int a = 5;
        // int b = 2;
        // System.out.println(a | b);
        // // 101
        // // 010
        // // 111
        // System.out.println(a & b);
        // System.out.println(a ^ b);

        // // массивы

        // int[] arr = new int[10];
        // System.out.println(arr.length); // 10
        // arr = new int[] { 1, 2, 3, 4, 5 };
        // System.out.println(arr.length); // 5

        // int brr[]; // тоже обьявление массива
        // brr = new int[7];
        // System.out.println(getType(brr));

        // получение данных из терминала

        // Scanner iScanner = new Scanner(System.in); // экземпляр класса сканер
        // System.out.printf("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s!", name);
        // System.out.println();
        // System.out.printf("Привет, %s!\n", name);
        // iScanner.close();

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // int x = iScanner.nextInt();
        // System.out.printf("double a: ");
        // double y = iScanner.nextDouble();
        // System.out.printf("%d + %f = %f", x, y, x + y);
        // iScanner.close();

        // Форматированный вывод

        // int a = 1, b = 2;
        // int c = a + b;
        // String res = a + " + " + b + " = " + c;
        // System.out.println(res);

        // // количестко знаков после запятой

        // float pi = 3.1415f;
        // System.out.printf("%f\n", pi); // 3,141500
        // System.out.printf("%.2f\n", pi); // 3,14
        // System.out.printf("%.3f\n", pi); // 3,141
        // System.out.printf("%e\n", pi); // 3,141500e+00
        // System.out.printf("%.2e\n", pi); // 3,14e+00
        // System.out.printf("%.3e\n", pi); // 3,141e+00

        // // Область видимости переменных

        // // область видимости блока
        // {
        // int i = 123;
        // System.out.println(i);
        // }

        // int i = 444;
        // System.out.println(i); // error: cannot find symbol

        // }

        // static String getType(Object o) {
        // return o.getClass().getSimpleName();

        // методы в java

        lib.sayHi();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("* ");
            }
            System.out.println();
        }

        // перебор коллекции с помощью foreach

        int[] arr = new int[] { 1, 2, 3, 4, 5, 77 };
        for (int item : arr) {
            System.out.println(item);
        }
    }

    // static void sayHi() {
    // System.out.println("hi");
    // }

}