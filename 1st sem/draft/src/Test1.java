import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // рекурсия с МЕМОИЗОЦИЯ
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(calcFib(x));
    }
    // заводим на число массив-кеш, где элементы с индексом >= 2 - отрицательные [0, 1, -1, -1 ...]
    // т.е. по сути записали два первых члена последовательности Фибоначчи, для вычисления последующих членов последовательности
    // просто берем значения первых элементов, больших нуля
    public static int calcFib(int n) {
        int[] cache = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i < 2) {
                cache[i] = i;
            } else cache[i] = -1;
        }
        return fibRecursion(cache, n);
    }

    public static int fibRecursion(int[] cache, int n) {
        if (cache[n] >= 0) {
            return cache[n];
        }
        cache[n] = fibRecursion(cache, n - 1) + fibRecursion(cache, n - 2);
        return cache[n];
    }

    public static calcFib1(int n) {
        int[] cache = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i < 2) {
                cache[i] = i;
            } else cache[i] = -1;
        }
        return fibRecursion1(cache, n);
    }

    public static int fibRecursion1(int[] cache, int n) {
        if (cache[n] > 0) {
            return cache[n];
        }
        cache[n] = fibRecursion(cache, n - 1) + fibRecursion(cache, n - 2);
        return cache[n];
    }
}
