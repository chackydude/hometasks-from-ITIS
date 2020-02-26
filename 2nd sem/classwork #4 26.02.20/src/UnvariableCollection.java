import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class UnvariableCollection<T> extends AbstractCollection {
    private T[] data;
    private int size;

    // constructors -------------------- *
    public UnvariableCollection(){
        this.data = (T[]) new Objects[10];
        this.size = 0;
     }

    public UnvariableCollection(Collection<? extends T> col) {
        this.data = (T[]) new Objects[col.size()];
        Iterator<? extends T> iter = col.iterator();
        while (iter.hasNext()) {
            this.data[this.size] = iter.next();
            this.size++;
        }
    }

    // methods ------------------------- *
    @Override
    public Iterator<T> iterator() {
        return new CollectionIterator();
    }

    @Override
    public int size() {
        return this.size;
    }

    // iterator ------------------------ *
    private class CollectionIterator<T> implements Iterator<T> {
        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return this.cursor < size;
        }

        @Override
        public T next() {
            T element = (T) data[this.cursor];
            this.cursor++;
            return element;
        }
    }
}
