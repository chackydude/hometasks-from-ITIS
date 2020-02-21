import java.util.Arrays;

public class SetInt {
    protected int[] data;
    protected int amountOfElements;

    // constructor
    public SetInt(int[] data, int amountOfElements) {
        this.data = data;
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
        for (int i = 0; i < amountOfElements; i++) {
            if (element == data[i]) {
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
    public SetInt merge(SetInt set) {
        int[] resultData = new int[this.amountOfElements + set.amountOfElements];
        int resultAmount = 0;
        SetInt result = new SetInt(resultData, resultAmount);

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
}

/*
   TODO: AaDS H/W:

 Set (множество)
 - void add (E)
 - boolean has(E)
 - int size()
 - void delete (E)
 -* Set merge(Set)
  [1,2,3] + [3,4,5] -> [1,2,3,4,5]

 *--------------------*

Multiset
    protected data
    protected counters
    - int countOf(obj);

 *--------------------*
Sorting
    написатб эффективный алгоритм сортировки пузырьком,
    основываясь на том, что массив частично сортирован
 */

