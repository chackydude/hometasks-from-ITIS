public class Test {
    public static void main(String[] args) {
        int[] array = new int[7];
        int[] array1 = new int[7];
//        for (int i = 0; i < 6; i++) {
//            array[i] = i;
//        }
        for (int i = 0; i < 6; i++) {
            array1[i] = 6;
        }
        MultiSetInt set = new MultiSetInt(array,0);
        set.add(1);
        set.add(2);
        set.add(3);
        SetInt set1 = new SetInt(array1, 6);
//        set1.add(6);
//        // tests
//        System.out.println("Set toString(): " + set.setToString());
//        set.add(5);
//        System.out.println("Set add(5): " + set.setToString());
//        set.delete(5);
//        System.out.println("Set delete(5): " + set.setToString());
//        System.out.println("Set has(3): " + set.has(3));
//        System.out.println("Set has(6): " + set.has(6));
//        System.out.println("Set size(): " + set.size());
//        System.out.println("Set: " + set.setToString() + "; Set1: " + set1.setToString());
//        System.out.println("Set + Set1 (merge())= " + set.merge(set1).setToString());
        for (int i = 0; i < set.counters.length; i++) {
            System.out.print(set.counters[i] + ", ");
        }
    }
}