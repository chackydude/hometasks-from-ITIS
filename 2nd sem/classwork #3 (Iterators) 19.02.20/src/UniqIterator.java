import java.util.Objects;

public class UniqIterator<T> {
    protected T[] data;
    protected int cursor = 0;

    // constructor
    public UniqIterator(T[] data) {
        this.data = (T[]) new Objects[0];
    }

    // check next el
    public boolean hasNext() {
        return data.length > cursor;
    };

    // returns next element
    public T next() {
        try {
            T el = data[cursor];
            cursor++;
            return el;
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            throw new java.util.NoSuchElementException();
        }
    }
}