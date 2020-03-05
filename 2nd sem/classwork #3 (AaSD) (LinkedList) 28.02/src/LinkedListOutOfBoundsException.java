public class LinkedListOutOfBoundsException  extends ArrayIndexOutOfBoundsException{
    public LinkedListOutOfBoundsException() {
        super();
    }

    public LinkedListOutOfBoundsException(String s) {
        super(s);
    }

    public LinkedListOutOfBoundsException(int index) {
        super(index);
    }
}
