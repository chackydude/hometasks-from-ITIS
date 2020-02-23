import java.util.Arrays;
import java.util.HashMap;

public class MultiSetInt extends SetInt{
    protected int[] data;
    protected int amountOfElements;
    // dictionary, which contains pairs value : amount of this value in the data
    protected HashMap<Integer, Integer> counters;

    // constructor
    public MultiSetInt(int[] array, int amountOfElements) {
        this.amountOfElements = amountOfElements;

    }

    // adds element into the set
    public void add(int element) {
        boolean flag = true;
        for (int i = 0; i < this.data.length; i++) {
            if (element == this.data[i]) {
                flag = false;
            }
        }
        if (flag) {
            this.amountOfElements++;
            this.data[amountOfElements - 1] = element;
        }
    }

    // checks element in the set
    public boolean has(int element) {
        boolean flag = false;
        for (int i = 0; i < this.amountOfElements; i++) {
            if (element == this.data[i]) {
                flag = true;
            }
        }
        return flag;
    }

    // returns amount of elements in the set
    public int size() {
        return this.amountOfElements;
    }

    // deleting element from the set
    public void delete(int element) {
        for (int i = 0; i < this.amountOfElements; i++) {
            if (element == this.data[i]) {
                for (int j = i; j < this.amountOfElements - 1; j++) {
                    this.data[j] = this.data[j+1];
                }
                this.amountOfElements--;
            }
        }
    }

    // merges two sets
    public MultiSetInt merge(MultiSetInt set) {
        int[] resultData = new int[this.amountOfElements + set.amountOfElements];
        int resultAmount = 0;
        MultiSetInt result = new MultiSetInt(resultData, resultAmount);

        for (int i = 0; i < this.amountOfElements; i++) {
            if (!result.has(this.data[i])) {
                result.add(this.data[i]);
            }
        }

        for (int j = 0; j < set.amountOfElements; j++) {
            if (!result.has(set.data[j])) {
                result.add(set.data[j]);
            }
        }

        return result;
    }

    public StringBuilder setToString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < this.amountOfElements - 1; i++) {
            result.append(this.data[i] + ", ");
        }
        result.append(data[amountOfElements - 1] + "]");
        return result;
    }

    // deletes duplicates in the array
    public static int[] modifyArray(int [] array) {
        int[] result = new int[array.length];
        int unicAmount = 0;
        for (int i = 0; i < array.length; i++) {
            boolean flag = true;
            int element = array[i];
            for (int j = 0; j < result.length; j++) {
                if (element == result[j]) {
                    flag = false;
                }
            }
            if (flag) {
                result[unicAmount] = element;
                unicAmount++;
            }
        }
        return result;
    }
}
