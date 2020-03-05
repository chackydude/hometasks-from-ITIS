import java.util.ArrayList;
import java.util.Arrays;

public class Queue <T> {
    // FIFO
    public T array[];
    public T firstElement;
    public int length;
    public int amountOfElements = 0;

    // constructor
    public Queue(int length) {
        this.array = (T[]) new Object[length];
        this.length = length;
    }

    // adds element in the end of Queue
    public void add(T elem) {
        this.array[this.amountOfElements] = elem;
        if (this.amountOfElements == 0) this.firstElement = elem;
        this.amountOfElements++;
    }

    // returns and deletes first element in the Queue
    public T pop() {
        T buffer = this.firstElement;
        for (int i = 0; i < this.amountOfElements-1; i++) {
            this.array[i] = this.array[i+1];
        }
        if (this.amountOfElements > 0) this.array[this.amountOfElements - 1] = null;
        this.firstElement = this.array[0];
        if (this.amountOfElements > 0) this.amountOfElements--;
        return buffer;
    }

    // returns just first element in the Queue
    public T peek(){
        return this.firstElement;
    }

    // returns size of Queue
    public int size() {
        return amountOfElements;
    }

    // returns array of the Queue in that moment
    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
