import java.util.Arrays;
import java.util.Objects;

/**
 * Class of "everlasting" array
 * @author trofimoff trofimovdanil946@gmail.com
 * @version 1.1
 */
public class EndlessArray {
    public static void main(String[] args) {
        EndlessArray ea = new EndlessArray();
    }

    //variables
    public int amountOfElements = 0;
    public int len = 3;
    public int[] array = new int[len];
    //public Date dateOfCreation = new Date();
    private final int TAIL = 50;
    public long hash = getHashcode();

    /**
     * Constructor, creation of the new object
     * @see EndlessArray#EndlessArray()
     */
    public EndlessArray() {
    }

    /**
     * Constructor, creation of the new object with parameters
     * @param len
     * @param array
     */
    public EndlessArray(int len, int[] array) {
//        this.INIT_LEN = len;
        this.array = array;
    }

    /**
     * Constructor, creation of the new object with parameters
     * @param amountOfElements
     * @param len
     * @param array
     */
    public EndlessArray(int amountOfElements, int len, int[] array) {
        this.amountOfElements = amountOfElements;
//        this.INIT_LEN = len;
        this.array = array;
    }

    /**
     * Method to add new element in the array
     * @param num - adding element
     */
    public void addElement(int num) {
        if (amountOfElements < array.length) {
            array[amountOfElements] = num;
        } else {
            len += TAIL;
            int[] newArray = new int[len];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            };
            array = newArray;
            array[amountOfElements] = num;
        }
        amountOfElements++;
    }

    /**
     * Method to get element from the array by index
     * @param index - index of the getting element
     * @return returns integer element
     */
    public int getElement(int index) throws IndexOutOfBoundsException{
        if (index >= 0 && index < amountOfElements){
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Введен индекс, которому не соответствует ни один элемент!");
        }
    }

    /**
     * Method to get amount of elements in the array
     * @return returns number of how much elements array contains
     */
    public int getSize() {
        return amountOfElements;
    }

    /**
     * Method to get capacity of the array, how much elements array can consist
     * @return capacity of the array
     */
    public int getCapacity() {
        return array.length;
    }

    /**
     * Method to remove element from the array by index
     * @param index - index of removing element
     */
    public void removeElement(int index) throws IndexOutOfBoundsException{
        if (index > 0 && index <= amountOfElements){
            for (int i = index; i < amountOfElements; i++) {
                array[i] = array[i + 1];
            }
            array[amountOfElements] = 0;
        } else {
            throw new IndexOutOfBoundsException("Введен индекс, которому не соответствует ни один элемент!");
        }
        amountOfElements--;
    }

    /**
     * Method to compare two arrays element by element
     * @param inputArray - comparing array
     * @return returns true if two arrays equals, else returns false
     */
    public boolean checkEquals(int[] inputArray) {
        if (inputArray.length == amountOfElements) {
            for (int i = 0; i < amountOfElements; i++) {
                if (array[i] != inputArray[i]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    /**
     * Overrided method to get hashcode
     * @return returns hashcode of the array
     */
    public long getHashcode() {
        int mark = 1;
        if (Math.random() > 0.5) {
            mark = -1;
        }
        long hashCode = (long) (mark * Math.random() * 2147483647);
        return hashCode;
    }

    /**
     * Method default turns array to string, with "," between the elements
     * @return returns string which consists out array
     */
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

    /**
     * Overloaded method, flag - is element, what must to be between the elements
     * @param flag - symbol between elements
     * @return returns string which consists our array
     */
    // overloaded method, flag - is element, what must to be between the elements
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

    /**
     * Method to find first desiring element by index
     * @param num - desiring element
     * @return returns index of first desiring element which equals num
     */
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

    /**
     * Method to find first desiring element by index
     * @param num - desiring element
     * @param startFrom - starting index
     * @return returns index of first desiring element which equals num
     */
    // overloaded method, where startFrom - index to begin searching
    public int showIndexOf(int num, int startFrom) {
        int index = -1;
        if (startFrom >= amountOfElements || startFrom < 0) {
            throw new IndexOutOfBoundsException("Введен индекс, которому не соответствует ни один элемент!");
        }
        for (int i = startFrom; i < amountOfElements; i++) {
            if (array[i] == num) {
                index = i;
                return index;
            };
        }
        return index;
    }

    /**
     * Method to output all elements from our array
     */
    public void showArray() {
        for (int i = 0; i < amountOfElements; i++) {
            System.out.print(array[i] + " ");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EndlessArray array1 = (EndlessArray) o;
        return amountOfElements == array1.amountOfElements &&
                hash == array1.hash &&
                Arrays.equals(array, array1.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(amountOfElements, len, TAIL, hash);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }
}
