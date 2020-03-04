import java.util.*;

public class MyNavigableSet<T> extends AbstractSet<T> implements NavigableSet<T> {
    private ArrayList<T> data;
    private Comparator<T>  comparator;
    private SortedSet<T> sortedSet;

    // constructors
    public MyNavigableSet(Comparator<T> comparator) {
        this.comparator = comparator;
        this.data = new ArrayList<T>(100);
    }

    public MyNavigableSet(Comparator<T> comparator, ArrayList<T> list) {
        this.comparator = comparator;
        this.data = list;
    }

    // adds an element comparing according to the comparator
    public boolean add(T element) {
        if (data.size() == 0) {
            data.add(element);
            return true;
        } else {
            if (this.data.contains(element)) {
                return false;
            } else {
                for (int i = 0; i < this.data.size(); i++) {
                    if (this.comparator.compare(this.data.get(i), element) > 0) {
                        this.data.add(i, element);
                        return true;
                    }
                }
                this.data.add(this.data.size(), element);
                return true;
            }
        }
    }

    // first element which strictly less than arg
    @Override
    public T lower(T element) {
        if (this.data.size() == 0) {
            return null;
        } else  if (this.comparator.compare(data.get(data.size()-1), element) < 0){
            return data.get(data.size()-1);
        } else {
            for (int i = 0; i < this.data.size(); i++) {
                if (this.comparator.compare(this.data.get(i), element) >= 0) {
                    if (i > 0) {
                        return this.data.get(i - 1);
                    } else return null;
                }
            }
            return null;
        }
    }

    // first element which not strictly less than arg
    @Override
    public T floor(T element) {
        if (this.data.size() == 0) {
            return null;
        } else  if (this.comparator.compare(data.get(data.size()-1), element) <= 0){
            return data.get(data.size()-1);
        } else {
            for (int i = 0; i < this.data.size(); i++) {
                if (this.comparator.compare(this.data.get(i), element) > 0) {
                    if (i > 0) {
                        return this.data.get(i - 1);
                    } else return null;
                }
            }
            return null;
        }
    }

    @Override
    public T ceiling(T element) {
        if (this.data.size() == 0) return null;
        if (this.data.indexOf(element) > 0) {
            return this.data.get(this.data.indexOf(element));
        } else {
            for (int i = 0; i < this.data.size(); i++) {
                if (this.comparator.compare(this.data.get(i), element) >= 0) {
                    return this.data.get(i);
                }
            }
            return null;
        }
    }

    @Override
    public T higher(T t) {
        return null;
    }

    @Override
    public T pollFirst() {
        return null;
    }

    @Override
    public T pollLast() {
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public NavigableSet<T> descendingSet() {
        return null;
    }

    @Override
    public Iterator<T> descendingIterator() {
        return null;
    }

    @Override
    public NavigableSet<T> subSet(T fromElement, boolean fromInclusive, T toElement, boolean toInclusive) {
        return null;
    }

    @Override
    public NavigableSet<T> headSet(T toElement, boolean inclusive) {
        return null;
    }

    @Override
    public NavigableSet<T> tailSet(T fromElement, boolean inclusive) {
        return null;
    }

    @Override
    public int size() {
        return this.data.size();
    }

    @Override
    public Comparator<T> comparator() {
        return this.comparator;
    }

    @Override
    public SortedSet<T> subSet(T fromElement, T toElement) {
        return null;
    }

    @Override
    public SortedSet<T> headSet(T toElement) {
        return null;
    }

    @Override
    public SortedSet<T> tailSet(T fromElement) {
        return null;
    }

    @Override
    public T first() {
        return this.data.get(0);
    }

    @Override
    public T last() {
        return this.data.get(this.data.size() - 1);
    }

    @Override
    public String toString() {
        return this.data.toString();
    }
}

// TODO: NavigableSet, SortedSet, AbstractClass
// 0) написать NavigableSet
// 1) сделать Java Doc для Navigable Set
// 2) залить на ГитХаб

// TODO: add, lower, floor, celling, higher, pollFirst, pollLast, iterator, subset, headset, tailset, toString, hashCode, first, last, size