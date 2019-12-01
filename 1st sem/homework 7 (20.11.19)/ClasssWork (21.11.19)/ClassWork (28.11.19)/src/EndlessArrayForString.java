import java.util.Arrays;
import java.util.Scanner;

public class EndlessArrayForString {
    public static void main(String[] args) {
        String[] array = new String[]{"java", "JVM", "SE", "Spring"};
        add("java", array);
        System.out.println(Arrays.toString(array));
    }

    // coef. of expansion
    public static int K = 2;

    public static void add(String string, String[] array) {
        int flag = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(null)) {
                array[i] = string;
                flag = 1;
            }
            if (flag == 0) {
                    String[] newArray = new String[array.length * K];
                    System.arraycopy(array, 0, newArray, array.length, array.length);
                    newArray[newArray.length] = string;
            }
        };
        array = newArray;
    }
}
}
// нужные методы в EndlessArray:
/*
void add(int val);
int get(int index);
int getSize()
int getCapacity();
void remove(int index);
equals
hashCode
toString
Constructor x3 ^_^
indexOf(int data) (first element)
indexOf(int data, int from) (overloading)s
 */