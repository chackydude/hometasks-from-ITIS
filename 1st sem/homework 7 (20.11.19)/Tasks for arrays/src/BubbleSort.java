import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Enter the length of array:");
        Scanner inputScanner = new Scanner(System.in);
        int len = inputScanner.nextInt();
        int[] first= new int[len];
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = (int) Math.round(Math.random() * 9);
            first[i] = array[i];
        };
        System.out.println("Default array:");
        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        };

        System.out.println();
        System.out.println("Bubble sorted array:");
        for (int i = 0; i < len; i++) {
            System.out.print(bubbleSorted(array)[i] + " ");
        }

        System.out.println();
        System.out.println("Insertion sorted array:");
        for (int i = 0; i < len; i++) {
            System.out.print(insertionSorted(array)[i] + " ");
        }

        System.out.println();
        System.out.println("Selection sorted array:");
        for (int i = 0; i < len; i++) {
            System.out.print(selectionSorted(array)[i] + " ");
        }
    }

    // that's bubble sorting
    /*
     * how it works?
     *
     * изначально (первая интерация) мы проходимся по всему массиву длинной len, сравнивая элементы попарно
     * если какой-то элемент больше своего парного, то мы сдвигаем больший элемент вправо, на позицию
     * выше, т.е. после первой итерации на последний "верхней" позиции у нас будет находится наибольший
     * элемент, образно говоря максимальный элемент "всплыл"
     *
     * на последующих итерациях мы не затрагиваем последнюю позицию и т.д.
     * */
    public static int[] bubbleSorted(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length - 1 - i; j++) {
                if (result[j] > result[j+1]) {
                    int buffer = result[j];
                    result[j] = result[j + 1];
                    result[j+1] = buffer;
                }
            }
        };
        return result;
    }

    //that's insertion sorting
    /*
    * how it works?
    *
    * мы берем из массива элемент и сравниваем его с элеметами перед ним,
    * и если выбранный нами элемент меньше предыдущего, то мы перемещаем его вслево, тем самым, сдвигая значения массива
    * начиная с позиции элиента меньшего выбранного до позиции выбранного на один ввраво (освободивщееся от выбранного
    * элемента место), таким ообразом проходим весь массив, находя для каждого итерируемого элемента
    * свою позицию в отсортированном массиве
    *
    * */
    public static int[] insertionSorted(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        };
        for (int left = 0; left < result.length; left++) {
            // "catching" one element
            int value = result[left];
            // checking all elements before value
            int i = left - 1;
            for (; i >= 0; i--) {
                // if value less than element then move element to the right side
                if (value < result[i]) {
                    result[i + 1] = result[i];
                } else {
                    // if element less than value then stop
                    break;
                }
            }
            //  fill value to the free pos
            result[i + 1] = value;
        }
        return result;
    }

    // that's selection sorting
    /*
    * how it works?
    *
    * мы сравниваем различные подмножества, от 0 до последнего, от 1 до последнего и т.д.
    * предполагаем, что первый элемент в каждом подмножестве минимальный
    * в оставшейся части подмножества ищем элемент меньше предложенного минимума (изначально
    * выброанного первого элемента подмножества) и если находим такой, то запоминаем индекс
    * и меняем местами
    *
    * */
    public static int[] selectionSorted (int[] array){
        int min, temp;
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        };
        for (int i = 0; i < result.length-1; i++){
            min = i;
            for (int j = i+1; j < result.length; j++){
                if (result[j] < result[min])
                    // remember index of minimum
                    min = j;
            }
            temp = result[min];
            result[min] = result[i];
            result[i] = temp;
        }

        return result;
    }
}
