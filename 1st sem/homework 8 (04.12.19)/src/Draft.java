import java.util.Arrays;
import java.util.Scanner;

public class Draft {
    public static void main (String[] args){
        int[] array = new int[5];
        int sum = 0;
        int j = sum != 0 ? 1 : 2;
        System.out.println(j);
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int x : array) {
            sum = sum + x;
        };
        for (int x : array) {
            System.out.println(x);
        }
    }
}