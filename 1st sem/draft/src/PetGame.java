import java.util.Scanner;

public class PetGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("imagine a number");
        int num1 = input.nextInt();
        int num2;
        System.out.println("enter a number");
        int counter = 1;
        boolean flag = true;
        while (flag) {
            num2 = input.nextInt();
            if (num1 != num2) {
                counter++;
                if (num1 > num2) {
                    System.out.println("less");
                } else System.out.println("bigger");
            } else {
                flag = false;
                System.out.println("right!");
                System.out.println("score: " + counter);
            }
        };
    }
}
