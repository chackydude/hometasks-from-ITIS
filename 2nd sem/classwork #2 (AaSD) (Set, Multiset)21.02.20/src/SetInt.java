import java.util.Arrays;

public class SetInt {
    protected int[] data;
    protected int amountOfElements;

    // constructors
    public SetInt() {
    }

    public SetInt(int[] array) {
        // when we create new SetInt, we delete from "array" all duplicates and
        // and store amount of unique elements in the "amountOfElements"
        this.data = SetInt.modifyArray(array);
        this.amountOfElements = SetInt.uniqueCount(array);
    }

    // adds element into the set
    public void add(int element) {
        boolean flag = true;
        for (int i = 0; i < this.amountOfElements; i++) {
            if (element == this.data[i]) {
               flag = false;
               break;
            }
        }
        if (flag) {
            this.amountOfElements++;
            this.data[this.amountOfElements - 1] = element;
        }
    }

    // checks element in the set
    public boolean has(int element) {
        boolean flag = false;
        for (int i = 0; i < this.amountOfElements; i++) {
            if (element == this.data[i]) {
                flag = true;
                break;
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
        SetInt result = new SetInt(resultData);

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

    // set --> string
    public StringBuilder setToString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < this.amountOfElements - 1; i++) {
            result.append(this.data[i] + ", ");
        }
        result.append(this.data[this.amountOfElements - 1] + "]");
        return result;
    }

    // deletes duplicates in the array
    public static int[] modifyArray(int [] array) {
        int[] result = new int[array.length];
        int uniqAmount = 0;
        for (int i = 0; i < array.length; i++) {
            boolean flag = true;
            int element = array[i];
            for (int j = 0; j < result.length; j++) {
                if (element == result[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result[uniqAmount] = element;
                uniqAmount++;
            }
        }
        return result;
    }

    // calculates amount of unique elements in the array
    public static int uniqueCount(int[] array) {
        int result = 0;
        int countUnique = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) continue;
            countUnique++;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                    break;
                }
            }
        }
        return result = countUnique - count;
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

Multiset - по аналогии с Set хранит уникальные элементы в data, но в n
    protected data
    protected counters
    - int countOf(obj);

 *--------------------*
Sorting
    написатб эффективный алгоритм сортировки пузырьком,
    основываясь на том, что массив частично сортирован
 */


// Идеи которые по итогу нужно реализовать утром:
/*
    1) сделать так, чтобы при передаче массива с неуникальными элементами в конструктор, в this.data записывался
    массив только с уникальными элементами (без дупликатов)
    2) всему, что в data не заполнено присвоить значение NaN
    3) counters - организовать как словарь (элемент : колитчество встреч)
    4) пересмотреть и понять весь свой легаси (вчерашний) код
 */
