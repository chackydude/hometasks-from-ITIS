import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter dimension:");
        int n = inputScanner.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) Math.round(10 * Math.random());
            }
        };

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int buffer;
                buffer = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = buffer;
            }
        };

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
