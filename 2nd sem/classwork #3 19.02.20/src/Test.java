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

        String[] array1 = new String[]{"1", "2", "3", "4", "5"};
        String[] array2 = new String[] {null, null, null, null, null};

        UniqIterator iterator3 = new UniqIterator(array1);
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }
        System.out.println("\n------------");
        ModifiedStringArrayIterator iterator = new ModifiedStringArrayIterator(array1);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("------------");
        ModifiedStringArrayIterator iterator1 = new ModifiedStringArrayIterator(array1);
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println("\n------------");
        ModifiedStringArrayIterator iterator2 = new ModifiedStringArrayIterator(array);
        while (iterator1.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}


// tests: []; [null, null, null]; ["a", "b", "null", "d", "null", "e", "f"]
