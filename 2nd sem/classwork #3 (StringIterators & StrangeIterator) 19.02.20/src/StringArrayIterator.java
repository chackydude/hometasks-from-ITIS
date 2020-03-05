public class StringArrayIterator implements java.util.Iterator<String>{
    protected String[] data;
    protected int cursor = 0;

    // constructor
    public StringArrayIterator(String[] data) {
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
