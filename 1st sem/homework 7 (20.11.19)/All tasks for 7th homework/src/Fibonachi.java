import java.util.Scanner;

public class Fibonachi {
    public void startFib() {
        System.out.println("Enter number of the Fibonacci's sequence:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Answer:");
        System.out.println(getValueOfFib(number - 1));
    }
    /*create array "cache" to save all members of sequence until the n*/
    public int getValueOfFib(int n) {
        int[] cache = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i < 2) {
                cache[i] = i;
            } else {
                cache[i] = -1;
            }
        }
        return calculateFib(cache, n);
    }

    /*calculate the sequence's number with using array of previous values*/
    public int calculateFib(int[] cache, int n) {
        if (cache[n] >= 0) {
            return cache[n];
        }
        cache[n] = calculateFib(cache, n - 1) + calculateFib(cache, n - 2);
        return cache[n];
    }
}
