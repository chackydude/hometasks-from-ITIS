import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // счетчик номеров удовлетворяющих условию в массиве strs
        int counter = 0;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        String[] strs = new String[n];
        // считывание массивов
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        input.nextLine();
        for (int i = 0; i < n; i++) {
            strs[i] = input.nextLine();
        }
        for (int i = 0; i < n; i++) {
            if (checkString(strs[i], nums)) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println(true);
        } else System.out.println(false);
    }

    // метод проверяющий условие задачи
    public static boolean checkString(String str, int[] nums) {
       // переменная отвечающая за соответствие значения факториала, значению в массиве nums
       boolean flag = false;
       // проход по всем парам символов строки
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = i+1; j < str.length(); j++) {
                int num = calcFact(str.charAt(i) + str.charAt(j));
                for (int k = 0; k < nums.length; k++) {
                    if (num == nums[k]) {
                        flag = true;
                        break;
                    }
                }
            }
        }
        return flag;
   }

    // метод вычисляющий факториал числа
    public static int calcFact(int n) {
        int result = 1;
        for (int i = n; i > 0; i--) {
            result = result * i;
        }
        return result;
    }
}
