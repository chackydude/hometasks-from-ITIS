import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String[][] storage = new String[2][2];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                storage[i][j] = input.nextLine();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(storage[i][j] + ' ');
            }
            System.out.println();
        }
    }
}
