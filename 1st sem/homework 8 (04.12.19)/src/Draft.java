import java.util.Arrays;
import java.util.Scanner;

public class Draft {
    public static void main (String[] args){
        int[] array = new int[5];
        System.out.println(array.hashCode());
        System.out.println(array.hashCode());
        array[1] = 5;
        System.out.println(array.hashCode());
    }
}