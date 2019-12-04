import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class EndlessArray {
    public static void main(String[] args) {
        EndlessArray ea = new EndlessArray();
    }

    //variables
    public int amountOfElements = 0;
    public int len = 3;
    public int[] array = new int[len];
    //public Date dateOfCreation = new Date();
    final int tail = 50;
    public long hash = getHashcode();

    public EndlessArray() {
    }

    public EndlessArray(int len, int[] array) {
        this.len = len;
        this.array = array;
    }

    public EndlessArray(int amountOfElements, int len, int[] array) {
        this.amountOfElements = amountOfElements;
        this.len = len;
        this.array = array;
    }

    // initialization method
    public void init() {
    }

    // main running method
    public void start() {
    };

    public void addElement(int num) {
        if (amountOfElements < array.length) {
            array[amountOfElements] = num;
        } else {
            len += tail;
            int[] newArray = new int[len];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            };
            array = newArray;
            array[amountOfElements] = num;
        }
        amountOfElements++;
    }

    public int getElement(int index) {
        if (index >= 0 && index < amountOfElements){
            return array[index];
        } else return -0;
    }

    public int getSize() {
        return amountOfElements;
    }

    public int getCapacity() {
        return array.length;
    }

    public void removeElement(int index) {
        if (index > 0 && index <= amountOfElements){
            for (int i = index; i < amountOfElements; i++) {
                array[i] = array[i + 1];
            }
            array[amountOfElements] = 0;
        }
        amountOfElements--;
    }

    public boolean checkEquals(int[] inputArray) {
        if (inputArray.length == amountOfElements) {
            for (int i = 0; i < amountOfElements; i++) {
                if (array[i] != inputArray[i]) {
                    return false;
                }
            }
            return true;
        } else return false;
    }

    public long getHashcode() {
        int mark = 1;
        if (Math.random() > 0.5) {
            mark = -1;
        }
        long hashCode = (long) (mark * Math.random() * 2147483647);
        return hashCode;
    }

    public String turnToString() {
        String result = new String("[");
        for (int i = 0; i < amountOfElements; i++) {
            if (i == amountOfElements - 1) {
                result = result + array[i];
            } else  result = result + array[i] + ",";
        }
        result = result + "]";
        return result;
    }

    public String turnToString(String flag) {
        String result = new String("[");
        for (int i = 0; i < amountOfElements; i++) {
            if (i == amountOfElements - 1) {
                result = result + array[i];
            } else result = result +  array[i] + flag;
        }
        result = result + "]";
        return result;
    }

    public int showIndexOf(int num) {
        int index = -1;
        for (int i = 0; i < amountOfElements; i++) {
            if (array[i] == num) {
                index = i;
                return index;
            };
        }
        return index;
    }

    public int showIndexOf(int num, int startFrom) {
        int index = -1;
        for (int i = startFrom; i < amountOfElements; i++) {
            if (array[i] == num) {
                index = i;
                return index;
            };
        }
        return index;
    }

    public void showArray() {
        for (int i = 0; i < amountOfElements; i++) {
            System.out.print(array[i] + " ");
        }
    }
 }
