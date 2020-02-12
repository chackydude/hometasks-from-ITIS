package OtherTasks;

import java.util.Scanner;

// task no1 with array of Strings WORKS!
public class Task1 {
    public static void main(String[] args) {
        int n,m;
        int counter;
        boolean answer = false;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        while(n < 0) {
            n = input.nextInt();
        };
        m = input.nextInt();
        while (m < 0) {
            m = input.nextInt();
        }
        String[][] storage = new String[n][m];
        input.nextLine();

        // ввод и проверка ввода на корректность
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                String str = input.nextLine();
                if (checkInput(str)) {
                    storage[i][j] = str;
                } else {
                    System.out.println("Incorrect input. Try again.");
                    str = input.nextLine();
                }
            }
        }
        // переход на новый столбец
        for (int i = 0; i < n; i++) {
            counter = 0;
            // переход на новую строку
            for (int j = 1; j < m; j++) {
                if (checkStr(storage[0][i])
                        && checkStr(storage[j][i])
                        && (storage[j][i].length() > storage[j-1][i].length())) {
                    counter++;
                }
            }
            if (counter == m-1) {
                answer = true;
            }
        }

        System.out.println(answer);
    }

    // метод, для проверки корректности ввода
    public static boolean checkInput(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a') && ('z' <= ch) || (ch >= 'A') && ('Z' <= ch)) {
                continue;
            } else return false;
        }
        return true;
    }

    // метод проверяющий соответствие строки условию задачи
    public static boolean checkStr(String str) {
        char[] chars = {'A','a','O','o','U','u','E','e','I','i'};
        boolean flag = false;
        for (int i = 0; i < str.length(); i+=2) {
            char ch = str.charAt(i);
            for (int j = 0; j < chars.length; j++) {
                if (ch == chars[j]) {
                    flag = true;
                }
            }
        }
        return flag;
    }
}
