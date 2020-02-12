package OtherTasks;

import java.util.Scanner;
// other version of Task1.java
public class Task1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размеры массива");
        int n, m;
        n = sc.nextInt();
        while (n < 0) {
            System.out.println("Nope.");
            n = sc.nextInt();
        }
        m = sc.nextInt();
        while (m < 0) {
            System.out.println("Nope.");
            m = sc.nextInt();
        }
        sc.nextLine();
        String[][] array = getArrayOfStrings(n, m);
        if (checkRules(array, n, m)) {
            System.out.println("Yes!");
        } else {
            System.out.println("Nope!");
        }
    }

    public static String[][] getArrayOfStrings(int n, int m) {
        Scanner sc = new Scanner(System.in);
        String str;
        boolean b = false;
        String[][] array = new String[n][m];
        System.out.println("Enter strings.");
        for (int i = 0; i < (n); i++) {
            for (int j = 0; j < (m); j++) {
                while (!b) {
                    str = sc.nextLine();
                    b = correctnessCheck(str);
                    if (b) {
                        array[i][j] = str;
                    } else {
                        System.out.println("Try again.");
                    }
                }
                b = false;
            }
        }
        for (int i = 0; i < (n); i++) {
            for (int j = 0; j < (m); j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        return array;
    }



    public static boolean correctnessCheck(String str) {
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (((ch >= 'a') && (ch <= 'z')) || ((ch >= 'A') && (ch <= 'Z'))) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean checkRules(String[][] array, int n, int m) {
        char ch;
        boolean b ;
        int max;
        char[] chars = {'A','a','O','o','U','u','E','e','I','i'};
        for (int j = 0; j < m; j++) {
            b = false;
            max = -1;
            for (int i = 0; i < n; i++) {
                for (int k = 0; k < array[i][j].length(); k++) {
                    ch = array[i][j].charAt(k);
                    if ((k % 2) == 0) {
                        for (int z = 0; z < chars.length; z++) {
                            if (ch == (chars[z])) {
                                b = true;
                                break;
                            }
                        }
                    }
                }
                if (!b) {
                    System.out.println("Проеб века!");
                    break;
                }
                if (max >= (array[i][j].length())) {
                    System.out.println("Проеб zека!");
                    break;
                } else {
                    max = array[i][j].length();
                }
            }
            if (b) {
                return true;
            }
        }
        return false;
    }
}