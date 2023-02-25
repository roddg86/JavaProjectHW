package HW.hw5;

public class Task3 {

    static int[] chessboard = { 0, 0, 0, 0, 0, 0, 0, 0 };
    static int index = 0;
    static int version = 1;

    public static void main(String[] args) {
        // На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И
        // вывести Доску. Пример вывода доски 8x8
        // 0x000000
        // 0000x000
        // 00x00000

        while (chessboard[0] < 8) {
            if (checking()) {
                if (index == 7) {
                    System.out.println("Вариант " + version++);
                    displayBoard(chessboard);
                    System.out.println();
                    chessboard[index]++;
                } else {
                    index++;
                }
            } else {
                chessboard[index]++;
            }
        }
    }

    public static void displayBoard(int[] arr) {
        // отрисовка доски
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (arr[j] == i) {
                    System.out.printf("%3s", "X");
                } else {
                    System.out.printf("%3s", "O");
                }
            }
            System.out.println();
        }
    }

    public static boolean checking() {
        // проверка боя
        int i;
        if (index == 0) {
            return true;
        }
        if (chessboard[index] > 7) {
            chessboard[index] = 0;
            index--;
            return false;
        }
        for (i = 0; i < index; i++) {
            if ((chessboard[index] == chessboard[i]) | ((Math.abs(chessboard[index] - chessboard[i])) == (index - i))) {
                return false;
            }
        }
        return true;
    }
}
