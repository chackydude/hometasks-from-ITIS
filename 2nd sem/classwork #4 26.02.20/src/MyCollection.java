import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class MyCollection<T> extends AbstractCollection {
    private T[] data;
    private int size;

    public MyCollection(){
        this.data = (T[]) new Objects[0];
        this.size = 0;
     }

    public MyCollection(Collection <? extends T> col) {
        Iterator<? extends T> iter = col.iterator();
        forEach();
    }

    @Override
    public Iterator iterator() {
        return new UniqueIterator(this.data);
    }

    @Override
    public int size() {
        return this.size;
    }
}
