package Iterators;

public class StrangeIterator {
    protected String[] data;
    protected int cursor = 0;

    // constructor
    public StrangeIterator(String[] data) {
        this.data = data;
    }

    // check next el
    public boolean hasNext() {
        return data.length > cursor;
    };

    // returns next element
    public String next() {
        try {
            String el = data[cursor];
            cursor++;
            return el;
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            throw new java.util.NoSuchElementException();
        }
    }
}
