import java.util.Arrays;

public class Stack<T> {
    // FILO
    public int amountOfElements = 0;
    public int length;
    public T array[];
    public T lastElement;

    //constructor
    public Stack(int length) {
        this.array = (T[]) new Object[length];
        this.length = length;
    }

    // adds element into the end of the Stack
    public void add(T elem) {
        this.lastElement = elem;
        this.array[this.amountOfElements] = elem;
        this.amountOfElements++;
    }

    // returns and deletes element from the end of the Stack
    public T pop() {
        T buffer = this.lastElement;
        this.lastElement = array[this.amountOfElements - 2];
        this.array[this.amountOfElements - 1] = null;
        this.amountOfElements--;
        return buffer;
    }

    // how much elements Stack includes
    public int size() {
        return this.amountOfElements;
    }

    // returns last element of the Stack without deleting
    public T peek() {
        return this.lastElement;
    }

    // returns array of the Stack at that moment
    @Override
    public String toString() {
        return Arrays.toString(this.array);
    }
}
