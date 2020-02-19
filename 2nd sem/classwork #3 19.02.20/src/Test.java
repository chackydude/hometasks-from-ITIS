import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        // iterable arrays for tests
        String[] array = new String[7];
        for (int i = 0; i < array.length; i++) {
            array[0] = null;
            array[1] = "1";
            array[2] = null;
            array[3] = "3";
            array[4] = "4";
            array[5] = null;
            array[6] = "6";
        }

        ModifiedStringArrayIterator iterator1 = new ModifiedStringArrayIterator(array);
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
            System.out.println("cursor: " + iterator1.cursor);
        }
    }
}


// tests: []; [null, null, null]; ["a", "b", "null", "d", "null", "e", "f"]
