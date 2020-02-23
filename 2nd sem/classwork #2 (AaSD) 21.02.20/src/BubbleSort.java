public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 3, 4, 2};
        int len = array.length;
        for (int i = len - 1; i > -1; i--) {
            boolean swapped = false;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    int buf = array[j];
                    array[j] = array[j+1];
                    array[j+1] = buf;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        for (int element: array) {
            System.out.print(element + " ");
        }
    }
}
