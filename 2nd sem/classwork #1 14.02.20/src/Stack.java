public class Stack<T> {
    public int amountOfElements = 0;
    public int length;
    public T array[];
    public T lastElement;

    //constructor
    public Stack(int length) {
        this.array = (T[]) new Object[length];
    }

    // adds element into the end of the Stack
    public void add(T elem) {
        this.lastElement = elem;
        this.array[amountOfElements] = elem;
        this.amountOfElements++;
    }

    // returns and deletes element from the end of the Stack
    public T pop() {
        T buffer = this.lastElement;
        this.array[amountOfElements] = null;
        amountOfElements--;
        this.lastElement = array[amountOfElements-1];
        return buffer;
    }

    // how mush elements Stack includes
    public int size() {
        return this.amountOfElements;
    }

    // returns last element of the Stack without deleting
    public T peek() {
        return this.lastElement;
    }
}
