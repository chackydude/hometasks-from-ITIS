public class EndlessArrayIterator<T> implements java.util.Iterator<T> {
    protected T[] data;
    protected int cursor = 0;

    // constructor
    public EndlessArrayIterator(T[] data) {
        this.data = data;
    }

    public EndlessArrayIterator(T array) {
    }

    // check next el
    public boolean hasNext() {
        return data.length > cursor;
    };

    // returns next element
    public T next() {
        try {
            T el =  data[cursor];
            cursor++;
            return el;
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            throw new java.util.NoSuchElementException();
        }
    }
}
