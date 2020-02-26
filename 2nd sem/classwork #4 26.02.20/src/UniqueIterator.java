import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.Objects;

public class UniqueIterator<T> implements Iterator<T>{
    protected T[] data;
    protected int cursor = 0;

    // constructors
    public UniqueIterator(T[] data) {
        this.data = data;
    }

    public UniqueIterator() {
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
