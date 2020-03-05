import Iterators.RandomIterator;
import Iterators.StrangeIterator;

public class Test {
    public static void main(String[] args) {
        int j = 0;
        Integer[] arrayTest = new Integer[] {0,1,2,3,4};

        EndlessArray<Integer> arrayEn = new EndlessArray<Integer>(5, arrayTest);
        // create object of EndlessArray iterator
        EndlessArrayIterator<EndlessArray> iterator = new EndlessArrayIterator<EndlessArray>(arrayEn);
        // EndlessArray != EndlessArray<Integer>??? TODO fix type error

        // RandomIterator test
        RandomIterator iterator1 = new RandomIterator(arrayTest);
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
            j++;
            if (j == 5) break;
        }
        System.out.println("------");
        //StrangeIterator test
        StrangeIterator iterator2 = new StrangeIterator(arrayTest);
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}
