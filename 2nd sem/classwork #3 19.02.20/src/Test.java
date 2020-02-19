public class Test {
    public static void main(String[] args) {
        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.toString(i);
        }

        // tests: []; [null, null, null]; ["a", "b", "null", "d", "null", "e", "f"]

        ModifiedStringArrayIterator iter = new ModifiedStringArrayIterator(array);
        while(iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print(" ");
        }
    }
}
