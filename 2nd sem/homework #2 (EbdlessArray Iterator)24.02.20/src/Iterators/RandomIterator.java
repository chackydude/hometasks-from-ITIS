package Iterators;

public class RandomIterator {
    protected Integer[] data;
    protected int cursor = 0;

    // constructor
    public RandomIterator(Integer[] data) {
        this.data = data;
    }

    // check next el
    public boolean hasNext() {
        return true;
    };

    // returns next element
    public int next() {
        return (int) Math.floor(100 * Math.random());
    }
}
