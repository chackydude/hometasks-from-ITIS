package OtherTasks;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {123, 1234, 12345, 123, 12};
        System.out.println(calcDigit(12));
    }

    public static int calcDigit(int n) {
        int counter = 0;
        while (n > 0) {
            n = n / 10;
            counter++;
        }
        return counter;
    }
}
