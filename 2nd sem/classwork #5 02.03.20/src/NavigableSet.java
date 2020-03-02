import java.util.*;

public class NavigableSet<T> implements SortedSet {
    protected ArrayList<T> data;
    protected int amountOfElements;
    // как сравниваются два элемента
    Comparator<T> comp;

    public NavigableSet() {

    }

    public static void main(String[] args) {
        NavigableSet<Integer> nav = new NavigableSet<>();
    }

    // constructors
    public NavigableSet(Comparator comp) {
        this.data = new ArrayList<>();
        this.amountOfElements = 0;
        this.comp = comp;
    }

    @Override
    public Comparator comparator() {
        return this.comp;
    }

    @Override
    public SortedSet subSet(Object fromElement, Object toElement) {
        return null;
    }

    @Override
    public SortedSet headSet(Object toElement) {
        return null;
    }

    @Override
    public SortedSet tailSet(Object fromElement) {
        return null;
    }

    @Override
    public Object first() {
        return null;
    }

    @Override
    public Object last() {
        return null;
    }

    @Override
    public int size() {
        return this.amountOfElements;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}

// TODO: NavigableSet, SortedSet, AbstractClass
// 0) написать NavigableSet
// 1) сделать Java Doc для Navigable Set
// 2) залить на ГитХаб