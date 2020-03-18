import java.util.*;

public class VariableCollection<T> extends AbstractCollection {
    private T[] data; // elements
    private int size; // amount of elements

    // constructors -------------------- *
    public VariableCollection(){
        this.data = (T[]) new Object[10];
        this.size = 0;
    }

    public VariableCollection(Collection<? extends T> col) {
        this.size = 0;
        this.data = (T[]) new Object[col.size()];
        Iterator<? extends T> iter = col.iterator();
        while (iter.hasNext()) {
            this.data[this.size] = iter.next();
            this.size++;
        }
    }

    // methods ------------------------- *
    @Override
    public Iterator<T> iterator() {
        return new CollectionIterator<T>();
    }

    @Override
    public int size() {
        return this.size;
    }

    /*
    Java API: Ensures that this collection contains the specified element (optional operation).
    Returns true if this collection changed as a result of the call.
    (Returns false if this collection does not permit duplicates and already
    contains the specified element.)
     */
    @Override
    public boolean add(Object element) {
        if (data.length <= size) {
            T[] newData = (T[]) new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        T[] dataCheck;
        dataCheck = (T[]) new Object[10];
        System.arraycopy(data, 0, dataCheck, 0, data.length);
        data[size] = (T) element;
        size++;
        return this.data == dataCheck;
    }

    /*
    Java API: Removes a single instance of the specified element from this collection,
    if it is present (optional operation). More formally, removes an element
    e such that (o==null ? e==null : o.equals(e)), if this collection contains one
    or more such elements. Returns true if this collection contained the specified
    element (or equivalently, if this collection changed as a result of the call).
     */
    @Override
    public boolean remove(Object element) {
        Iterator<T> it = iterator();
        if (element==null) {
            while (it.hasNext()) {
                if (it.next()==null) {
                    // deletes the element that was last received by the method next()
                    it.remove();
                    return true;
                }
            }
        } else {
            while (it.hasNext()) {
                if (element.equals(it.next())) {
                    it.remove();
                    return true;
                }
            }
        }
        return false;
    }

    // compare collections

    public boolean equals(VariableCollection collection) {
        return this.size == collection.size && Arrays.equals(this.data, collection.data);
    }

    // iterator ------------------------ *
    private class CollectionIterator<T> implements Iterator<T> {
        private int cursor;

        public CollectionIterator(){
            this.cursor = 0;
        };

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
        VariableCollection<?> that = (VariableCollection<?>) o;
        return that.containsAll(this);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(data);
        return result;
    }
}
