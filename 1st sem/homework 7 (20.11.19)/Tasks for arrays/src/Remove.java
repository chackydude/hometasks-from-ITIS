import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {
        System.out.println("Enter array's length:");
        Scanner inputScanner = new Scanner(System.in);
        int len = inputScanner.nextInt();
        int[] array = new int[len];
        System.out.println("Enter the array:");
        for (int i = 0; i < len; i++) {
            array[i] = inputScanner.nextInt();
        }
        System.out.println("Enter removing number (> 0)");
        int num = inputScanner.nextInt();
        int k = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] == num) {
                array[i] = 0;
                k++;
            }
        };
        int[] newArray = new int[len - k];
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] != 0) {
                newArray[j] = array[i];
                j++;
            }
        }
        System.out.println("New array:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
