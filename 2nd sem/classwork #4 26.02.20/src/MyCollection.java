import java.util.*;

public class MyCollection<T> extends AbstractCollection {
    private T[] data;
    private int size;

    // constructors -------------------- *
    public MyCollection(){
        this.data = (T[]) new Objects[0];
        this.size = 0;
     }

    public MyCollection(Collection <? extends T> col) {
        this.data = (T[]) new Objects[col.size()];
        Iterator <? extends T> iter = col.iterator();
        while (iter.hasNext()) {
            this.data[size] = iter.next();
            size++;
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
            return cursor < size;
        }

        @Override
        public T next() {
            T element = (T) data[cursor];
            cursor++;
            return element;
        }
    }
}
