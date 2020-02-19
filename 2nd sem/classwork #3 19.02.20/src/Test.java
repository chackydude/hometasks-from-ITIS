import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        // iterable array
        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.toString(i);
        }
        // works!
//        StringArrayIterator iterator = new StringArrayIterator(array);
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        ModifiedStringArrayIterator iterator1 = new ModifiedStringArrayIterator(array);
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}


// tests: []; [null, null, null]; ["a", "b", "null", "d", "null", "e", "f"]
