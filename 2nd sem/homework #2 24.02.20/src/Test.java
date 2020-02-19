public class Test {
    public static void main(String[] args) {
        Integer[] array1 = new Integer[] {1,2,3,4,5};
        EndlessArray<Integer> array = new EndlessArray<Integer>(5, array1);

        EndlessArrayIterator<EndlessArray> iterator = new EndlessArrayIterator<EndlessArray>(array);
        // EndlessArray != EndlessArray<Integer>???
    }
}
