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
        this.array[amountOfElements] = elem;
        if (amountOfElements == 0) this.firstElement = elem;
        amountOfElements++;
    }

    // returns and deletes first element in the Queue
    public T pop() {
        T buffer = this.firstElement;
        for (int i = 0; i < amountOfElements-1; i++) {
            this.array[i] = this.array[i+1];
        }
        if (amountOfElements > 0) this.array[amountOfElements - 1] = null;
        this.firstElement = this.array[0];
        amountOfElements--;
        return buffer;
    }

    // returns just first element in the Queue
    public T peek(){
        return this.firstElement;
    }

    // returns size of Queue
    public int size() {
        if (this.amountOfElements > 0) {
            return this.amountOfElements;
        } else return 0;
    }

    // returns array of the Queue in that moment
    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
