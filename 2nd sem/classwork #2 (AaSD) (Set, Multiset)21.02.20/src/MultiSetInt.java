import java.util.Arrays;
import java.util.HashMap;

public class MultiSetInt extends SetInt{
    protected int[] data;
    protected int amountOfElements;
    // dictionary, which contains pairs value : amount of this value in the data
    protected HashMap<Integer, Integer> counters;

    // constructors
    public MultiSetInt() {
        this.amountOfElements = 0;
        this.data = new int[this.amountOfElements + 100];
        this.counters = new HashMap<>();
    }

    public MultiSetInt(int[] array) {
        this.data = MultiSetInt.modifyArray(array);
        this.amountOfElements = MultiSetInt.uniqueCount(array);
        this.counters = new HashMap<>();
    }

    // adds element into the multi-set
    public void add(int element) {
        boolean flag = true;
        for (int i = 0; i < this.amountOfElements; i++) {
            if (element == this.data[i]) {
                flag = false;
                if (this.counters.containsKey(element)) {
                    this.counters.put(element, this.counters.get(element) + 1);
                } else this.counters.put(element, 1);
            }
        }
        if (flag) {
            this.amountOfElements++;
            this.data[this.amountOfElements - 1] = element;
            this.counters.put(element, 1);
        }
    }

    // deleting element from the multi-set
        public void delete(int element) {
            for (int i = 0; i < this.amountOfElements; i++) {
                if (element == this.data[i]) {
                    for (int j = i; j < this.amountOfElements - 1; j++) {
                        this.data[j] = this.data[j+1];
                    }
                    this.amountOfElements--;
                    this.counters.remove(element);
                }
            }
    }

    // merges two multi-sets
    public MultiSetInt merge(MultiSetInt set) {
        int[] resultData = new int[this.amountOfElements + set.amountOfElements];
        MultiSetInt result = new MultiSetInt(resultData);

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

    // multi-set --> string
    public StringBuilder setToString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < this.amountOfElements - 1; i++) {
            result.append(this.data[i] + ", ");
        }
        result.append(this.data[this.amountOfElements - 1] + "]");
        return result;
    }
}
