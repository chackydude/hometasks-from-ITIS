package Iterators;

public class StrangeIterator {
    protected Integer[] data;
    public int cursor1 = 0;
    public int cursor2;
    protected int flag = 0;

    // constructor
    public StrangeIterator(Integer[] data) {
        this.data = data;
        this.cursor2 = data.length - 1 - cursor1;
    }

    // check next el
    public boolean hasNext() {
        return (cursor1 - cursor2 != 1);
    };

    // returns next element
    public int next() {
        try {
            int el;
            if (flag % 2 == 0) {
                el = data[cursor1];
                cursor1++;
            } else {
                el = data[cursor2];
                cursor2 = data.length - 1 - cursor1;
            }
            flag++;
            return el;
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            throw new java.util.NoSuchElementException();
        }
    }
}
