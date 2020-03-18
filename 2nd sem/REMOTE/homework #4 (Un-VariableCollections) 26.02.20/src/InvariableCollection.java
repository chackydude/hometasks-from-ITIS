import java.util.*;

public class InvariableCollection<T> extends AbstractCollection {
    private T[] data;
    private int size;

    // constructors -------------------- *
    public InvariableCollection(){
        this.data = (T[]) new Objects[10];
        this.size = 0;
     }

    public InvariableCollection(Collection<? extends T> col) {
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

    public boolean equals(InvariableCollection collection) {
        return this.size == collection.size && Arrays.equals(this.data, collection.data);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvariableCollection<?> that = (InvariableCollection<?>) o;
        return that.containsAll(this);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(data);
        return result;
    }
}
