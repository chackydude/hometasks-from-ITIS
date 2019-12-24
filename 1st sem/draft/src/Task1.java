import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        String s3 = input.nextLine();
        boolean flag = true;
        //s1
        if (!s1.equals("street")) {
            flag = false;
            System.out.println('1');
        }
        //s2
        for (int i = 0; i < s2.length()-1; i++) {
            if (s2.charAt(i) > 'z' || s2.charAt(i) < 'A') {
                    flag = false;
                System.out.println('2');
            }
        }
        if (s2.charAt(s2.length() - 1) != ',') {
            flag = false;
            System.out.println("2.1");
        }
        //s3
        for (int i = 0; i < s3.length(); i++) {
            if (s3.charAt(i) < '0' || s3.charAt(i) > '9') {
                flag = false;
                System.out.println('3');
            }
        }
        System.out.println(s1 + ' ' + s2 + ' ' + s3);
        if (flag) {
            System.out.println("correct input");
        } else {
            System.out.println("error");
        }
    }
}
