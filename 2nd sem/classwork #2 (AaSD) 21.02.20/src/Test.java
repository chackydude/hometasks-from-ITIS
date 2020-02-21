public class Test {
    public static void main(String[] args) {
        int[] array = new int[7];
        SetInt set = new SetInt(array, 0);
        for (int i = 1; i < 5; i++) {
            set.add(i);
        }
        // tests
        System.out.println("Set toString(): " + set.setToString());
        set.add(5);
        System.out.println("Set add(5): " + set.setToString());
        set.delete(5);
        System.out.println("Set delete(5): " + set.setToString());
        System.out.println("Set has(3): " + set.has(3));
        System.out.println("Set has(6): " + set.has(6));
        System.out.println("Set size(): " + set.size());
        System.out.println();
    }
}
