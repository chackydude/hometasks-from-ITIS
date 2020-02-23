public class Test {
    public static void main(String[] args) {
        int[] array = new int[7];
        int[] array1 = new int[7];
        for (int i = 1; i < 6; i++) {
            array[i] = i;
        }
        for (int i = 6; i < 12; i++) {
            array1[i-6] = 6;
        }

        SetInt set = new SetInt(array);
        SetInt set1 = new SetInt(array1);

        // tests for SetInt ------------------------
        System.out.println("Set toString(): " + set.setToString());
        set.add(6);
        System.out.println("Set add(6): " + set.setToString());
        set.delete(6);
        System.out.println("Set delete(6): " + set.setToString());
        System.out.println("Set has(3): " + set.has(3));
        System.out.println("Set has(6): " + set.has(6));
        System.out.println("Set size(): " + set.size());
        System.out.println("Set: " + set.setToString() + "; Set1: " + set1.setToString());
        System.out.println("Set + Set1 (merge()) = " + set.merge(set1).setToString());

        // tests for MultiSetInt -------------------
        MultiSetInt mult = new MultiSetInt();
        mult.add(1);
        mult.add(2);
        mult.add(3);
        mult.add(3);
        System.out.println("MultiSet: " + mult.setToString());
        System.out.println("MultiSet - counter: " + mult.counters.entrySet());
        mult.delete(3);
        System.out.println("MultiSet: " + mult.setToString());
        System.out.println("MultiSet - counter: " + mult.counters.entrySet());
    }
}
